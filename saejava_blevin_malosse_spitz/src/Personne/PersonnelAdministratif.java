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
    
    private boolean primeDispo = false;
    
    /**Constructeur qui donne la possibilitée d'ajouter la disponibilitée de la prime*/
    public PersonnelAdministratif (String Nom, String Prenom, Double SalaireFixe, boolean PrimeDispo) {
        super(Nom, Prenom, SalaireFixe);
        if(PrimeAnnuelle == true || PrimeAnnuelle == false)


    }

    /**Méthode qui permet de donner l'acces à la prime ou de le retirer*/
    public void setAccesPrime(boolean Acces) {
        if (Acces == true || Acces == false)
            this.primeDispo = Acces;
        else
            this.primeDispo = false;
    }
    
    /** Test d'égalité de deux peronnes*/
    public boolean equals (PersonnelAdministratif obj){
        if (!(obj instanceof PersonnelAdministratif))
            return false;
        PersonnelAdministratif p = (PersonnelAdministratif) obj;
        return super.equals(obj) && this.primeDispo == p.primeDispo;    
    }
    
    /**Redéfinition de toString*/
    public String toString(){
        return super.toString() + "\nCette personne a accès à la prime : " + this.primeDispo;
    }
    
    
}
