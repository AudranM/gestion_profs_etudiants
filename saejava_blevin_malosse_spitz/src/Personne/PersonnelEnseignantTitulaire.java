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

    public PersonnelEnseignantTitulaire(String Nom, String Prenom) {
        super(Nom, Prenom);
        super.setDroitPrime(true);
        super.setEstTitulaire(true);
    }

    public PersonnelEnseignantTitulaire() {
        this("INCONNU", "INCONNU");
    }

}
