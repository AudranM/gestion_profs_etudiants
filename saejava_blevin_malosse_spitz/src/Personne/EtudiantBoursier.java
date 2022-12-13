/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personne;

/**
 *
 * @author audranmalosse
 */
public class EtudiantBoursier extends Etudiant {

    private double bourse;

    public EtudiantBoursier(String Nom, String Prenom, double Bourse) {
        super(Nom, Prenom);
        setBourse(Bourse);
    }

    public EtudiantBoursier() {
      this("INCONNU","INCONNU",0);
    }

    /**
     * Verifie et incrémente la Bourse
     */
    public void setBourse(double Val) {
        if (Val > 0) {
            this.bourse = Val;
        } else {
            this.bourse = 0.;
        }
    }

    /**
     * Méthode qui retourne si oui ou non cest un étudiant Boursier.
     */
    public boolean estEtudiant(Object O) {
        return O instanceof EtudiantBoursier;
    }

}
