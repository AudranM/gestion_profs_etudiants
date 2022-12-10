/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personne;

/**
 *
 * @author audranmalosse
 */
public abstract class Personnel extends Personne {
    
    private static double primeAnnuelle;
    private boolean obtentionPrime = false;
    private boolean droitPrime = false;
    private double salaireFixe;
    private double salaireTotalMensuel;
    private double salaireTotalAnnuel;
    
    /**Constructeur qui prend le Nom, le Prenom, le Salaire Fixe */
    public Personnel (String Nom, String Prenom, double SalaireFixe){
        super(Nom, Prenom);
        this.setSalaireFixe(SalaireFixe);
        this.salaireFixe = SalaireFixe;
        this.defSalaireMensuel();
        this.defSalaireAnnuel();
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
    
    //setter
    public void setSalaireFixe(double Val){this.salaireFixe = Math.abs(Val);}
    public static void setPrimeAnnuelle(double Val){Personnel.primeAnnuelle = Math.abs(Val);}
    public void setObtentionPrime(boolean Bool){this.obtentionPrime = verifBool(Bool);}
    public void setDroitPrime(boolean Bool){this.droitPrime = verifBool(Bool);}
    
    /** Test d'égalité de deux peronnes*/
    public boolean equals (Personnel obj){
        if (!(obj instanceof Personnel))
            return false;
        Personnel p = (Personnel) obj;
        return super.equals(obj) && this.salaireFixe == p.salaireFixe;    
    }
    
    /**Redéfinition de toString*/
    public String toString(){
        return super.toString() + "\nLe salaire fixe est de : " + salaireFixe + 
            "\nLe salaire mensuel est de : " + salaireTotalMensuel +
            "\nLe salaire annuel total est de :" + salaireTotalAnnuel;
    }
    
    /**Permet de verifier si l'argument transmis est bien un booléen*/
    public boolean verifBool(boolean Bool){
        if (Bool == true || Bool == false)
            return Bool;
        else
            return false;
    }
    /**Permet de donner l'obtenstion ou non à la Prime*/
    public void setaccesPrime (boolean Bool){
        this.obtentionPrime = verifBool(Bool);
    }
    /**Permet de donner le droit ou non à la Prime*/
    public void setdroitPrime (boolean Bool){
        this.droitPrime = verifBool(Bool);
    }
    
    /**Défini le salaire mensuel du personnel*/
    public void defSalaireMensuel(){
        this.salaireTotalMensuel = this.getSalaireFixe();
    }
    
    /**Défini le salaire annuel du personnel*/
    public void defSalaireAnnuel(){
        this.salaireTotalAnnuel = this.getSalaireFixe()*12;
    }
    
    /**Méthode qui permet d'augmenter le salaire mensuel de la valeure transmise*/
    public void addAtSalaireMensuel(double Val){
        this.salaireTotalMensuel += Val;
    }
    
    /**Méthode qui permet d'augmenter le salaire annuel de la valeure transmise*/
    public void addAtSalaireAnnuel(double Val){
        this.salaireTotalAnnuel += Val;
    }
}
