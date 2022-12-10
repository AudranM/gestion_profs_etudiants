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
    
    private double salaireFixe;
    private static double primeAnnuelle;
    private boolean primeDispo = false;
    private double salaireTotalMensuel;
    private double salaireTotalAnnuel;
    
    /**Constructeur qui prend le Nom, le Prenom, le Salaire Fixe */
    public Personnel (String Nom, String Prenom, double SalaireFixe){
        super(Nom, Prenom);
        this.setSalaireFixe(SalaireFixe);
    }

    /**Constructeur qui prend le Nom et le Prenom*/
    public Personnel (String Nom, String Prenom){
        super(Nom, Prenom);
    }
    
    //getter
    public double getSalaireFixe(){return this.salaireFixe;}
    public static double getPrimeAnnuelle(){return Personnel.primeAnnuelle;}
    public boolean getPrimeDispo(){return this.primeDispo;}
    
    //setter
    public void setSalaireFixe(double Val){this.salaireFixe = Math.abs(Val);}
    public static void setPrimeAnnuelle(double Val){Personnel.primeAnnuelle = Math.abs(Val);}
    public void setPrimeDispo(boolean Etat){this.primeDispo = Etat;}
    
    /** Test d'égalité de deux peronnes*/
    public boolean equals (Personnel obj){
        if (!(obj instanceof Personnel))
            return false;
        Personnel p = (Personnel) obj;
        return super.equals(obj) && this.salaireFixe == p.salaireFixe && this.primeDispo== p.primeDispo;    
    }
    
    /**Redéfinition de toString*/
    public String toString(){
        return super.toString() + "Le salaire fixe est de : " + salaireFixe + 
                "\nLa personne est éligible à la prime : " + primeDispo + 
                "\nLe salaire mensuel est de : " + salaireTotalMensuel +
                "\nLe salaire annuel total est de :" + salaireTotalAnnuel;
    }
    
    /**Défini le salaire mensuel du personnel avec la gestion de la disponibilitée de la prime ou non*/
    public void defSalaireMensuel(){
        if (primeDispo == true)
            this.salaireTotalMensuel = this.getSalaireFixe() + Personnel.getPrimeAnnuelle();
        else
            this.salaireTotalAnnuel = this.getSalaireFixe();
    }
    
    /**Défini le salaire annuel du personnel avec la gestion de la disponibilitée de la prime ou non*/
    public void defSalaireAnnuel(){
        if (primeDispo == true)
            this.salaireTotalAnnuel = (this.getSalaireFixe() + Personnel.getPrimeAnnuelle())*12;
        else
            this.salaireTotalAnnuel = this.getSalaireFixe()*12;
    }
}
