/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personne;

/**
 *
 * @author audranmalosse
 */
public class PersonnelEnseignantVacataire extends PersonnelEnseignant{
    private int nbHeure;
    
    public PersonnelEnseignantVacataire(String Nom, String Prenom, int nbHeure){
        super(Nom, Prenom);
         this.nbHeure = nbHeure;
        }
    public PersonnelEnseignantVacataire(String Nom, String Prenom){
         this(Nom, Prenom, 0);
        }
    public PersonnelEnseignantVacataire(){
        this("INCONNU", "INCONNU", 0);
        }
}
