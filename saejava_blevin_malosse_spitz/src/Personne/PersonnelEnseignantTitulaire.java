/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personne;

/**
 *
 * @author audranmalosse
 */
public class PersonnelEnseignantTitulaire {
        private static double tarifHeureSup;
        
        public double getTarifHeureSup(){return PersonnelEnseignantTitulaire.tarifHeureSup;}
        public void setTarifHeureSup(double Val){PersonnelEnseignantTitulaire.tarifHeureSup = Math.abs(Val);}
    
}
