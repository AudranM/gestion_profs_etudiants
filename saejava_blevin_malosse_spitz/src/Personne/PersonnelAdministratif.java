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
    

    public PersonnelAdministratif(String Nom, String Prenom, double SalaireFixe, boolean PrimeDispo){
        super(Nom, Prenom);
        this.setSalaireFixe(SalaireFixe);
        this.setPrimeDispo(PrimeDispo);
    }
}
