/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personne;

import static Personne.Console.*;

/**
 *
 * @author fabio
 */
public class Application {

    /**
     * Methode du menu principale
     *
     * @see Console#quitterLeProgramme()
     * @see Console#consoleRetourEtuPlus5Abs()
     * @see Console#consoleRetourPerPlus5Abs()
     */
    public static void menu() {
        int choix = -1;
        System.out.println("\nMenu principal");
        System.out.println("\nMerci de faire votre choix");
        System.out.println("--------------------------------------------------\n");
        System.out.println("[0] : Arreter le programme");
        System.out.println("[1] : Ajouter au registre");
        System.out.println("[2] : Effacer du registre");
        System.out.println("[3] : Les etudiants avec plus de 5 absence injustifié");
        System.out.println("[4] : Liste des salaries qui ont une retenue sur salaire");
        System.out.println("[5] : Modifier les personnes dans le registre");
        System.out.println("[6] : Ajouter une absence");
        System.out.println("[7] : Gestion des bureaux");
        System.out.println("[8] : Gestion des salaires");
        System.out.println("[9] : Voir tout le registre");
        choix = Clavier.lireInt();

        switch (choix) {
            case 0:
                quitterLeProgramme();
                break;
            case 1:
                ajoutPersonne();
                break;
            case 2:
                supprimePersonne();
                break;
            case 3:
                consoleRetourEtuPlus5Abs();
                menu();
                break;
            case 4:
                consoleRetourPerPlus5Abs();
                menu();
                break;
            case 5:
                modifierLeRegistre();
                menu();
                break;
            case 6:
                absence();
                break;
            case 7:
                gestionDesBureaux();
                break;
            case 8:
                gestionDesSalaire();
                break;
            case 9: // en attente de la function d'Audran
                menu();
                break;
            default:
                menu();
                break;
        }
    }

    /**
     * Menu d'ajout d'une personne
     *
     * @see Console#creatEtudiant()
     * @see Console#creatEtudiantBoursier()
     * @see Console#creatPersonnelEnseignantTitulaire()
     * @see Console#creatPersonnelEnseignantVacataire()
     * @see Console#creatPersonnelAdministratif()
     */
    public static void ajoutPersonne() {
        int choix = -1;
        System.out.println("\nMenu d'Ajout des Personnes");
        System.out.println("\nMerci de faire votre choix");
        System.out.println("--------------------------------------------------\n");
        System.out.println("[0] : Arreter le programme");
        System.out.println("[1]: Retour au menu principal");
        System.out.println("[2] : Ajouter un etudiant");
        System.out.println("[3] : Ajouter un etudiant boursier");
        System.out.println("[4] : Ajouter un enseignant titulaire");
        System.out.println("[5] : Ajouter un enseignant vacataire");
        System.out.println("[6] : Ajouter un personnel administratif");
        choix = Clavier.lireInt();

        switch (choix) {
            case 0:
                quitterLeProgramme();
                break;
            case 1:
                menu();
                break;
            case 2:
                creatEtudiant();
                ajoutPersonne();
                break;
            case 3:
                creatEtudiantBoursier();
                ajoutPersonne();
                break;
            case 4:
                creatPersonnelEnseignantTitulaire();
                ajoutPersonne();
                break;
            case 5:
                creatPersonnelEnseignantVacataire();
                ajoutPersonne();
                break;
            case 6:
                creatPersonnelAdministratif();
                ajoutPersonne();
                break;
            default:
                menu();
                break;

        }
    }

    /**
     * Menu pour supprimer une personne
     *
     * @see Console#quitterLeProgramme()
     * @see Console#effacerUnElement()
     * @see Console#afficherToutesLesPersonne()
     */
    public static void supprimePersonne() {
        int choix = -1;
        System.out.println("\nMenu de Supression des Personnes");
        System.out.println("\nMerci de faire votre choix");
        System.out.println("--------------------------------------------------\n");
        System.out.println("[0] : Arreter le programme");
        System.out.println("[1] : Retour au menu principal");
        System.out.println("[2] : Effacer un element du registre");
        System.out.println("[3] : Voir les elements du registre");
        choix = Clavier.lireInt();
        switch (choix) {

            case 0:
                quitterLeProgramme();
                break;
            case 1:
                menu();
                break;
            case 2:
                effacerUnElement();
                supprimePersonne();
                break;
            case 3:
                afficherToutesLesPersonne();
                break;
            default:
                menu();
                break;
        }
    }

    /**
     * Menu pour gerer les absences
     *
     * @see Console#quitterLeProgramme()
     * @see Console#ajoutDuneAbsenceJustifie()
     * @see Console#ajoutDuneAbsenceinjustifie()
     */
    public static void absence() {
        int choix = -1;
        System.out.println("\nMenu Gestion des Absences");
        System.out.println("\nMerci de faire votre choix");
        System.out.println("--------------------------------------------------\n");
        System.out.println("[0] : Arreter le programme");
        System.out.println("[1] : Retour au menu principal");
        System.out.println("[2] : ajouter une absence jusitfie");
        System.out.println("[3] : ajouter une absence injusitfie");
        choix = Clavier.lireInt();

        switch (choix) {
            case 0:
                quitterLeProgramme();
                break;
            case 1:
                menu();
                break;
            case 2:
                ajoutDuneAbsenceJustifie();
                break;
            case 3:
                ajoutDuneAbsenceinjustifie();
                break;
            default:
                menu();
                break;
        }
    }

    /**
     * Menu pour les modifier elements du registre ( Arraylist de personne )
     *
     * @see Console#quitterLeProgramme()
     * @see Console#definiBourseEtudiantboursier()
     */
    public static void modifierLeRegistre() {
        int choix = -1;
        System.out.println("\nMenu pour modifier les elements du registre");
        System.out.println("\nMerci de faire votre choix");
        System.out.println("--------------------------------------------------\n");
        System.out.println("[0] : Arreter le programme");
        System.out.println("[1] : Retour au menu principal");
        System.out.println("[2] : Personnel Administratif");
        System.out.println("[3] : Personnel Enseignant Titulaire");
        System.out.println("[4] : Personnel Enseignant Vacataire");
        System.out.println("[5] : Ajouter une bouse a un Etudiant Boursier");

        choix = Clavier.lireInt();

        switch (choix) {
            case 0:
                quitterLeProgramme();
                break;
            case 1:
                menu();
                break;
            case 2:
                menuPersonnelAdministratif();
                modifierLeRegistre();
                break;
            case 3:
                menuPersonnelEnseignantTitulaire();
                modifierLeRegistre();
                break;
            case 4:
                menuPersonnelEnseignantVacataire();
                modifierLeRegistre();
                break;
            case 5:
                definiBourseEtudiantboursier();
                modifierLeRegistre();
                break;
            default:
                menu();
                break;
        }
    }

    /**
     * Menu pour modfier les Personnel Adminstratif
     *
     * @see Console#quitterLeProgramme()
     * @see Console#definiSalaireFixe()
     * @see Console#definiPrime()
     * @see Console#retourPersonneTypeAdministratif()
     */
    public static void menuPersonnelAdministratif() {
        int choix = -1;
        System.out.println("\nMenu pour modifier les elements des Personnels Administratifs");
        System.out.println("\nMerci de faire votre choix");
        System.out.println("--------------------------------------------------\n");
        System.out.println("[0] : Arreter le programme");
        System.out.println("[1] : Retour au menu principal");
        System.out.println("[2] : Modifier le Salaire Fixe");
        System.out.println("[3] : Obtient la prime");
        System.out.println("[4] : afficher les Personnels Admistratif");
        choix = Clavier.lireInt();

        switch (choix) {
            case 0:
                quitterLeProgramme();
                break;
            case 1:
                menu();
                break;
            case 2:
                definiSalaireFixe();
                menuPersonnelAdministratif();
                break;
            case 3:
                definiPrime();
                menuPersonnelAdministratif();
                break;
            case 4:
                retourPersonneTypeAdministratif();
                menuPersonnelAdministratif();
                break;
            default:
                menu();
                break;

        }

    }

    /**
     * Menu pour gerer les enseignant titulaire
     *
     * @see Console#quitterLeProgramme()
     * @see Console#definiSalaireFixe()
     * @see Console#heureAEffectue()
     * @see Console#definiPrime()
     * @see Console#retourPersonneTypeEnseignantsTitulaires()
     */
    public static void menuPersonnelEnseignantTitulaire() {
        int choix = -1;
        System.out.println("\nMenu pour modifier les elements des Enseignants Titulaires");
        System.out.println("\nMerci de faire votre choix");
        System.out.println("--------------------------------------------------\n");
        System.out.println("[0] : Arreter le programme");
        System.out.println("[1] : Retour au menu principal");
        System.out.println("[2] : Modifier le Salaire Fixe");
        System.out.println("[3] : Modifier les Heure  Effectué");
        System.out.println("[4] : Obtient la prime");
        System.out.println("[5] : Afficher les Enseignants Titulaires");
        choix = Clavier.lireInt();

        switch (choix) {
            case 0:
                quitterLeProgramme();
                break;
            case 1:
                menu();
                break;
            case 2:
                definiSalaireFixe();
                menuPersonnelEnseignantTitulaire();
                break;
            case 3:
                heureAEffectue();
                menuPersonnelEnseignantTitulaire();
                break;
            case 4:
                definiPrime();
                menuPersonnelEnseignantTitulaire();
                break;
            case 5:
                retourPersonneTypeEnseignantsTitulaires();
                menuPersonnelEnseignantTitulaire();
                break;
            default:
                menu();
                break;
        }

    }

    /**
     * Menu pour gerer les enseignant vacataire
     *
     * @see Console#quitterLeProgramme()
     * @see Console#heureAEffectue()
     * @see Console#retourPersonneTypeEnseignantsVacataire()
     */
    public static void menuPersonnelEnseignantVacataire() {
        int choix = -1;
        System.out.println("\nMenu pour modifier les elements des Enseignants Vacataire");
        System.out.println("\nMerci de faire votre choix");
        System.out.println("--------------------------------------------------\n");
        System.out.println("[0] : Arreter le programme");
        System.out.println("[1] : Retour au menu principal");
        System.out.println("[2] : Modifier les Heure  Effectué");
        System.out.println("[3] : Afficher les Enseignants Vacataire ");
        choix = Clavier.lireInt();

        switch (choix) {
            case 0:
                quitterLeProgramme();
                break;
            case 1:
                menu();
                break;
            case 2:
                heureAEffectue();
                menuPersonnelEnseignantVacataire();
                break;
            case 3:
                retourPersonneTypeEnseignantsVacataire();
                menuPersonnelEnseignantVacataire();
                break;
            default:
                menu();
                break;
        }

    }

    /**
     * Menu pour gerer les bureaux
     *
     * @see Console#quitterLeProgramme()
     * @see Console#ajouterUnBureau()
     * @see Console#ajouterUnOccupant()
     * @see Console#afficherToutesLesInfos()
     * @see Console#afficheTousLesBureauxEtInfos()
     * @see Console#afficherLesOccupantsDunBureau()
     * @see Console#changerLeBureauDunePersonne()
     */
    public static void gestionDesBureaux() {
        int choix = -1;
        System.out.println("\nMenu de gestion des bureaux");
        System.out.println("\nMerci de faire votre choix");
        System.out.println("--------------------------------------------------\n");
        System.out.println("[0] : Arreter le programme");
        System.out.println("[1] : Retour au menu principal");
        System.out.println("[2] : Ajouter un bureau");
        System.out.println("[3] : Ajouter un occupant à un bureau");
        System.out.println("[4] : Afficher toutes les infos d'un Bureau");
        System.out.println("[5] : Affiche tous les bureaux et toutes leurs infos");
        System.out.println("[6] : Afficher les occupants d'un bureau");
        System.out.println("[7] : Changer le bureau d'une personne");
        choix = Clavier.lireInt();

        switch (choix) {
            case 0:
                quitterLeProgramme();
                break;
            case 1:
                menu();
                break;
            case 2:
                ajouterUnBureau();
                gestionDesBureaux();
                break;
            case 3:
                ajouterUnOccupant();
                gestionDesBureaux();
                break;
            case 4:
                afficherToutesLesInfos();
                gestionDesBureaux();
                break;
            case 5:
                afficheTousLesBureauxEtInfos();
                gestionDesBureaux();
                break;
            case 6:
                afficherLesOccupantsDunBureau();
                gestionDesBureaux();
                break;
            case 7:
                changerLeBureauDunePersonne();
                gestionDesBureaux();
                break;
            default:
                menu();
                break;

        }

    }

    /**
     * Methode pour gerer les salaires
     *
     * @see Console#quitterLeProgramme()
     * @see Console#recuperationDuSalaireMensuel()
     * @see Console#recuperationDuSalaireAnnuel()
     */
    public static void gestionDesSalaire() {
        int choix = -1;
        System.out.println("\nMenu de gestion des salaires");
        System.out.println("\nMerci de faire votre choix");
        System.out.println("--------------------------------------------------\n");
        System.out.println("[0] : Arreter le programme");
        System.out.println("[1] : Retour au menu principal");
        System.out.println("[2] : Récuperation du salaire Mensuel");
        System.out.println("[3] : Récuperation du salaire Annuel");
        choix = Clavier.lireInt();

        switch (choix) {
            case 0:
                quitterLeProgramme();
                break;
            case 1:
                menu();
                break;
            case 2:
                recuperationDuSalaireMensuel();
                menu();
                break;
            case 3:
                recuperationDuSalaireAnnuel();
                menu();
                break;
            default:
                menu();
                break;

        }
    }

    /**
     * Menu de demarage de l'application
     *
     * @see Console#consoleSetPrimeAnnuelle()
     */
    public static void debut() {
        System.out.println("Bonjour, Bienvenue sur le prgramme de gestion de l'IUT.");
        System.out.println("Pour commencer merci d'indiquer la prime Annuel");
        System.out.println("----------------------------------------------------------");
        double prime = Clavier.lireDouble();
        consoleSetPrimeAnnuelle(prime);
    }

}
