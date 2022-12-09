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
    private double paye;
    private double salaireFixe;
    private double prime;
    
    public Personnel (String Nom, String Prenom, double salaireFixe){
        super(Nom, Prenom);
    }
}
