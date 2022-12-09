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
    private static double tarifHeureSup;
    private boolean primeDispo;

    public Personnel (String Nom, String Prenom, double SalaireFixe, boolean PrimeDispo){
        super(Nom, Prenom);
        this.setSalaireFixe(SalaireFixe);
        this.setPrimeDispo(PrimeDispo);
    }
    public Personnel (String Nom, String Prenom, double SalaireFixe){
        super(Nom, Prenom);
        this.setSalaireFixe(SalaireFixe);
    }
    public Personnel (String Nom, String Prenom){
        super(Nom, Prenom);
    }
    
    public double getSalaireFixe(){return this.salaireFixe;}
    public double getPrimeAnnuelle(){return Personnel.primeAnnuelle;}
    public double getTarifHeureSup(){return Personnel.tarifHeureSup;}
    public boolean getPrimeDispo(){return this.primeDispo;}
    
    public void setSalaireFixe(double Val){this.salaireFixe = Math.abs(Val);}
    public void setPrimeAnnuelle(double Val){Personnel.primeAnnuelle = Math.abs(Val);}
    public void setTarifHeureSup(double Val){Personnel.tarifHeureSup = Math.abs(Val);}
    public void setPrimeDispo(boolean Etat){this.primeDispo = Etat;}
}
