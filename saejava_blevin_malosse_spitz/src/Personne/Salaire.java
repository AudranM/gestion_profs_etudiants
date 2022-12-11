/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personne;

/**
 *
 * @author audranmalosse
 */
public class Salaire {

    // attributs de la classe
    private boolean obtentionPrime = false;
    private boolean droitPrime = false;

    private double salaireFixe = 0.;
    private double salaireTotalMensuel = 0.;
    private double salaireTotalAnnuel = 0.;
    
    
    private int nbHeureSupp = 0;
    private int nbHeureATx = 0;
    private static double txHoraire = 0.;
    private static double primeAnnuelle = 0.;
    
    //setter des attributs statics
    public static void setPrimeAnnuelle(double Montant){Salaire.primeAnnuelle = Montant;}
    public static void setTxHoraire (double Montant){Salaire.txHoraire = Montant;}
    
    //setter des attributs des peronnes
    public void setSalaireFixe(double Montant){this.salaireFixe = Montant;}
    
    //setters qui donne ou non la prime annuelle
    public void setObtientPrime(){this.obtentionPrime = true;}
    public void setNObtientPasPrime(){this.obtentionPrime = false;}
    
    //setters du nombre d'heure supp et nombre d'heures des vacataires
    public void setNbHeureSupp(int Heure){this.nbHeureSupp = Heure;}
    public void setNbHeureATx(int Heure){this.nbHeureATx = Heure;}
    
    

        
    //test pour trouver la classe 
    
    private boolean defPersonnelAdministratif (Personnel P){
        Personnel PA = new PersonnelAdministratif();
        if (P.getClass().getName().equals(PA.getClass().getName()))
            return true;
        else
            return false;
    }
    
    private boolean defPersonnelEnseignantTitulaire (Personnel P){
        Personnel PET = new PersonnelEnseignantTitulaire();
        if (P.getClass().getName().equals(PET.getClass().getName()))
            return true;
        else
            return false;
    }
    
    private boolean defPersonnelEnseignantVacataire (Personnel P){
        Personnel PEV = new PersonnelEnseignantVacataire();
        if (P.getClass().getName().equals(PEV.getClass().getName()))
            return true;
        else
            return false;
    }
}
