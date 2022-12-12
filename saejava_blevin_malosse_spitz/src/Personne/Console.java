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
    public static String effacerUnElement() {
        System.out.println("indiquer le Numero de la personne à supprimer du registre : ");
        int idASupprimer = Clavier.lireInt();
        if (idASupprimer < 0 || idASupprimer > tailleRegistre()) {
            return "Le numero indiqué n'est pas dans le registre";
        }
        if (recupIndiceRegistre(idASupprimer) < 0) {
            return "Le numéro de la personne n'a pas été trouvé.";
        }
        supprimePersonne(recupIndiceRegistre(idASupprimer));
        return "le numéro "+idASupprimer+ "a bien été supprimé";
    }

    /**
     * Méthode pour quitter le programme
     */
    public static void quitterLeProgramme() {
        System.out.println("Merci d'avoir utilisé notre programme");
        System.exit(1);
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
        System.out.println("Saisir le salaire fixe");
        Personne Personne = new PersonnelEnseignantVacataire(nom, prenom);
    }
}
