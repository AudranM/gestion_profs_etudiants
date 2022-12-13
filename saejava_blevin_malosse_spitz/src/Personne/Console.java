/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personne;

import static Personne.Personne.*;

/**
 *
 * @author fabio
 */
public class Console {

    
    
    
    /**
     * Méthode pour supprimer un element de Arraylist dans la classe Personne
     * @return
     */
    public static void effacerUnElement() {
        System.out.println("indiquer le Numero de la personne à supprimer du registre : ");
        int idASupprimer = Clavier.lireInt();
        if (recupIndiceRegistre(idASupprimer) < 0) {
            System.out.print("Le numéro de la personne n'a pas été trouvé.");
        } 
        else {
            supprimePersonne(recupIndiceRegistre(idASupprimer));
            System.out.print("le numéro " + idASupprimer + "a bien été supprimé");
        }
    }

    /**
     * Méthode pour quitter le programme
     */
    public static int quitterLeProgramme() {
        System.out.println("Merci d'avoir utilisé notre programme");
        return 0;
    }

    /**
     * Méthode de creation d'un etudiant
     */
    public static void creatEtudiant() {
        System.out.println("Saisir le Nom");
        String nom = Clavier.lireString();
        System.out.println("Saisir le Prénom");
        String prenom = Clavier.lireString();
        Personne Personne = new Etudiant(nom, prenom);
    }

    /**
     * Méthode de creation d'un etudiant boursier
     */
    public static void creatEtudiantBoursier() {
        System.out.println("Saisir le Nom");
        String nom = Clavier.lireString();
        System.out.println("Saisir le Prénom");
        String prenom = Clavier.lireString();
        System.out.println("Saisir le montant de la bourse");
        double bourse = Clavier.lireDouble();
        Personne Personne = new EtudiantBoursier(nom, prenom, bourse);
    }

    /**
     * Méthode de creation d'un personnel administratif
     */
    public static void creatPersonnelAdministratif() {
        System.out.println("Saisir le Nom");
        String nom = Clavier.lireString();
        System.out.println("Saisir le Prénom");
        String prenom = Clavier.lireString();
        System.out.println("Saisir le salaire fixe");
        double salaireFixe = Clavier.lireDouble();
        Personne Personne = new PersonnelAdministratif(nom, prenom, salaireFixe);
    }

    /**
     * Méthode de creation d'un personnel enseignant titulaire
     */
    public static void creatPersonnelEnseignantTitulaire() {
        System.out.println("Saisir le Nom");
        String nom = Clavier.lireString();
        System.out.println("Saisir le Prénom");
        String prenom = Clavier.lireString();
        System.out.println("Saisir le salaire fixe");
        double tarifHeureSup = Clavier.lireDouble();
        Personne Personne = new PersonnelEnseignantTitulaire(nom, prenom, tarifHeureSup);
    }

    // a finir
    /**
     * Méthode de creation d'un personnel enseignant vacataire
     */
    public static void creatPersonnelEnseignantVacataire() {
        System.out.println("Saisir le Nom");
        String nom = Clavier.lireString();
        System.out.println("Saisir le Prénom");
        String prenom = Clavier.lireString();
        System.out.println("Saisir le nombre d'heure");
        int nbHeure = Clavier.lireInt();
        Personne Personne = new PersonnelEnseignantVacataire(nom, prenom, nbHeure);
    }
}
