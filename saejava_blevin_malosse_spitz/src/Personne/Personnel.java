/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personne;

import static Personne.EntierContraint.*;

/**
 *
 * @author audranmalosse
 */
public abstract class Personnel extends Personne {
    
    private static double primeAnnuelle;
    private boolean obtentionPrime = false;
    private boolean droitPrime = false;
    private boolean estTitulaire = false;
    private boolean estVacataire = false;
    private double txHoraire = 42;
    private double nbHeures= 0;
    private double heuresEffectue=0;
    private double salaireFixe;
    private double salaireTotalMensuel;
    private double salaireTotalAnnuel;
    
    private Bureau sonBureau;
    
    /**Constructeur qui prend le Nom, le Prenom, le Salaire Fixe */
    public Personnel (String Nom, String Prenom, double SalaireFixe){
        super(Nom, Prenom);
        this.setSalaireFixe(SalaireFixe);
        this.salaireFixe = SalaireFixe;

        
    }

    /**Constructeur qui prend le Nom et le Prenom*/
    public Personnel (String Nom, String Prenom){
        this(Nom, Prenom, 0);
    }
    
    /**Constructeur par défaut*/
    public Personnel (){
        this("Inconnu", "Inconnu", 0);
    }
    
    //getter
    public double getSalaireFixe(){return this.salaireFixe;}
    public static double getPrimeAnnuelle(){return Personnel.primeAnnuelle;}
    public boolean getObtensionPrime() {return this.obtentionPrime;}
    public boolean getDroitPrime() {return this.droitPrime;}
    public Bureau getSonBureau(){return sonBureau;}
    
    //setter
    public void setSalaireFixe(double Val){this.salaireFixe = Math.abs(Val);}
    public static void setPrimeAnnuelle(double Val){Personnel.primeAnnuelle = Math.abs(Val);}
    public void setSonBureau(Bureau bureau){sonBureau = bureau;}
    /**Permet de donner l'obtenstion ou non à la Prime*/
    public void setObtentionPrime(boolean Bool){this.obtentionPrime = Utils.verifBool(Bool);}
    /**Permet de donner le droit ou non à la Prime*/
    public void setDroitPrime(boolean Bool){this.droitPrime = Utils.verifBool(Bool);}
    public void setEstTitulaire(boolean Bool){this.estTitulaire = Bool;}
    public void setEstVacataire(boolean Bool){this.estVacataire = Bool;}
    public void addNbHeuresEffectuee(double Heures){this.heuresEffectue += Heures;}
    
    
    public void setNbHeures(double Heures){
        if (this.estTitulaire){
            if (Heures < 64)
                this.nbHeures = 64;
            else if (Heures > 384)
                this.nbHeures = 384;
            else 
                this.nbHeures = Heures;    
        }
        if (this.estVacataire){
            this.nbHeures = Heures;
        }
            
    }
            
    /** Test d'égalité de deux peronnes*/
    public boolean equals (Personnel obj){
        if (!(obj instanceof Personnel))
            return false;
        Personnel p = (Personnel) obj;
        return super.equals(obj) && this.salaireFixe == p.salaireFixe && this.sonBureau == p.sonBureau;   
    }
    
    /**Redéfinition de toString
     * @return l'ensemble des attributs de la classe et leur valeur*/
    @Override
    public String toString(){
        
        String bureau = "";
        if (Utils.isNull(sonBureau)) bureau += "aucun";
        else bureau += sonBureau.getNumero();
        
        return super.toString() + "\nLe salaire fixe est de : " + salaireFixe + 
            "\nLe salaire mensuel est de : " + salaireTotalMensuel +
            "\nLe salaire annuel total est de :" + salaireTotalAnnuel +
            "\nBureau : " + bureau + "\n";
    }
    
    public void changeBureau(Bureau newBureau){
        sonBureau.envoieVersNewBureau(this, newBureau);
    }
    
    /**Calcule des heures suplémentaire du titulaire*/
    public double calculHeuresSuplémentaire (){
        if(this.nbHeures>192)
            if ((this.heuresEffectue-this.nbHeures)>0)
                return (this.heuresEffectue - this.nbHeures);
        return 0;
    }
    
    /**Défini le salaire mensuel du personnel*/
    public double getSalaireMensuel(){
        if (this.estTitulaire)
            return (this.calculHeuresSuplémentaire()*this.txHoraire)+this.salaireFixe;
        if (this.estVacataire)
            return this.nbHeures*this.txHoraire;
        else
            return this.salaireFixe;

    }
    
    /**Défini le salaire annuel du personnel*/
    public double defSalaireAnnuel(){
        if(this.droitPrime  && this.obtentionPrime)
            return this.getSalaireFixe()*12+this.primeAnnuelle;
        else
            return this.getSalaireFixe()*12;
    }
}
