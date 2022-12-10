/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personne;

/**
 *
 * @author audranmalosse
 */
public class PersonnelAdministratif extends Personnel {
    
    
    /**Constructeur qui donne la possibilitée d'ajouter la disponibilitée de la prime*/
    public PersonnelAdministratif (String Nom, String Prenom, Double SalaireFixe, boolean PrimeDispo) {
        super(Nom,Prenom);
    }
}
