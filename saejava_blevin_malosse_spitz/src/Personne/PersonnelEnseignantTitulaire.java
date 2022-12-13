/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personne;

/**
 *
 * @author audranmalosse
 */
public class PersonnelEnseignantTitulaire extends PersonnelEnseignant {
    
        private static double tarifHeureSup;
        private double volHoraire;
        
        
        public PersonnelEnseignantTitulaire(String Nom, String Prenom, double TarifHeureSup){
            super(Nom, Prenom);
            this.tarifHeureSup = TarifHeureSup;
        }
        public PersonnelEnseignantTitulaire(String Nom, String Prenom){
            super(Nom, Prenom);
            this.tarifHeureSup = 0;
        }
        
        public PersonnelEnseignantTitulaire(){
        this("INCONNU","INCONNU");
        }
        
         //getter
        public double getTarifHeureSup(){return PersonnelEnseignantTitulaire.tarifHeureSup;}
        
        //setter
        public void setTarifHeureSup(double Val){PersonnelEnseignantTitulaire.tarifHeureSup = Math.abs(Val);}
        
}
