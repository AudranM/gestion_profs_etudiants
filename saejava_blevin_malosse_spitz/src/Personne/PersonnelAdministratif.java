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
    
    private Double salaire;
    private Double primeAnnuelle;
    

    public PersonnelAdministratif(String Nom, String Prenom) {
        super(Nom, Prenom);
    }

    @Override
    public void verifAbs() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
