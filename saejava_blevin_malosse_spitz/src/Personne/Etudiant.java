/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personne;

/**
 *
 * @author audranmalosse
 */
public class Etudiant extends Personne implements Util {
    private String numEtudiant;
    
    
    public Etudiant (String Nom, String Prenom){
        super(Nom, Prenom);
        this.numEtudiant = "E" + String.valueOf(getNumPersonne());
        super.incrTab(this);
        
    }
    public boolean anneeValidee () {
         if (getAbsNonJustif()>=5)
            return true;
        else
            return false;
    }

    @Override
    public boolean equals(Personne P) {
        return super.equals(P);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    /**Méthode abstraite qui verifie le nombre d'absence*/
    @Override
    public void verifAbs(){
        if (super.getAbsNonJustif()>=5)
            System.out.print("L'etudiant a trop d'absences pour valider son année");
        else
            System.out.print("L'etudiant a n'a pas de souci d'absence pour valider son année");
    }
}