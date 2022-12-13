/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personne;

/**
 *
 * @author audranmalosse
 */
public class Console {
    public static void creatEtudiant (){
        System.out.println("Saisir le Nom");
        String x = Clavier.lireString();
        System.out.println("Saisir le Prénom");
        String y = Clavier.lireString(); 
        Personne Personne = new Etudiant (x,y);
    }
    
    public static void creatPersonnelAdministratif (){
        System.out.println("Saisir le Nom");
        String x = Clavier.lireString();
        System.out.println("Saisir le Prénom");
        String y = Clavier.lireString(); 
        Personne Personne = new PersonnelAdministratif (x,y);
    }
    
    public static void creatPersonnelEnseignantTitulaire (){
        System.out.println("Saisir le Nom");
        String x = Clavier.lireString();
        System.out.println("Saisir le Prénom");
        String y = Clavier.lireString(); 
        Personne Personne = new PersonnelEnseignantTitulaire (x,y);
    }
    public static void creatPersonnelEnseignantVacataire (){
        System.out.println("Saisir le Nom");
        String x = Clavier.lireString();
        System.out.println("Saisir le Prénom");
        String y = Clavier.lireString(); 
        Personne Personne = new PersonnelEnseignantVacataire (x,y);
    }
    
    
}
