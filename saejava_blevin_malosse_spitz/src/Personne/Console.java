/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personne;

import static Personne.Application.*;
import static Personne.Personne.*;
import static Personne.Bureau.*;

/**
 *
 * @author fabio
 */
public class Console {

    public static void alouerUnBureauApresCreation() {
        if (Bureau.bureaux.size() < 1) {
            String reponse;
            System.out.println("\nIndiquer si vous voulez creer un bureau et ajouter un occupant? Oui/Non");
            reponse = Clavier.lireString();
            reponse = reponse.toLowerCase();
            if (reponse.equals("oui")) {
                ajouterUnBureau();
                ajouterUnOccupant();
            } else {
                ajoutPersonne();
            }
        } else {
            System.out.println("\nIndiquer si vous voulez ajouter un occupant a un bureau? Oui/Non");
            String reponse;
            reponse = Clavier.lireString();
            reponse = reponse.toLowerCase();
            if (reponse.equals("oui")) {
                ajouterUnOccupant();
            } else {
                ajoutPersonne();
            }
        }

    }

    /**
     * Methode pour afficher les occupants d'un bureau
     */
    public static void afficherLesOccupantsDunBureau() {
        System.out.println("\nindiquer le numero du bureau");
        int numBureau = Clavier.lireInt();
        retourBureauNum(numBureau).getStringOccupants();
    }

    /**
     * Methode pour afficher tous les bureaux et leurs informations
     */
    public static void afficheTousLesBureauxEtInfos() {
        afficheBureaux();
    }

    /**
     * Methode pour afficher toutes les informations d'un bureau en particulier
     */
    public static void afficherToutesLesInfos() {
        System.out.println("\nindiquer le numero du bureau");
        int numBureau = Clavier.lireInt();
        System.out.println(retourBureauNum(numBureau));
    }

    /**
     * Methode pour assigner un personnel à un bureau
     */
    public static void ajouterUnOccupant() {
        System.out.println("\nindiquer le numero de la personne");
        int numPersonne = Clavier.lireInt();
        if (retourPersonneNum(numPersonne) instanceof Personnel) {
            System.out.println("\nindiquer le numero du bureau");
            int numBureau = Clavier.lireInt();
            retourBureauNum(numBureau).setOccupant((Personnel) retourPersonneNum(numPersonne));
        } else {
            System.out.println("Ce n'est pas un Personnel");
        }
    }

    /**
     * Methode pour ajouter un bureau
     */
    public static void ajouterUnBureau() {
        System.out.println("\nindiquer le nombre de place dans le bureau");
        int numPlace = Clavier.lireInt();
        Bureau bureau = new Bureau(numPlace);
    }

    /**
     * Methode pour definir les heures suplementaire du personnel
     */
    public static void definiHeuresSuplementaire() {
        System.out.println("\nIndiquer le numero de la personne");
        int numPersonne = Clavier.lireInt();
        System.out.println("\nIndiquer les heures à suplemantaire effectué");
        double heureAEffectue = Clavier.lireDouble();
        if (retourPersonneNum(numPersonne) instanceof Personnel) {
            //((Personnel) retourPersonneNum(numPersonne)).setVolHoraire(heureAEffectue);
        } else {
            System.out.println("Ce n'est pas un Personnel");
        }
    }

    /**
     * Methode pour definir les heures a effectué par le personnel
     */
    public static void heureAEffectue() {
        System.out.println("\nIndiquer le numero de la personne");
        int numPersonne = Clavier.lireInt();
        System.out.println("\nindiquer les heures à effectué");
        double heureAEffectue = Clavier.lireDouble();
        if (retourPersonneNum(numPersonne) instanceof Personnel) {
            ((Personnel) retourPersonneNum(numPersonne)).setVolHoraire(heureAEffectue);
        } else {
            System.out.println("Ce n'est pas un Personnel");
        }
    }

    /**
     * Methode pour definir la bourse des etudiant boursier
     */
    public static void definiBourseEtudiantboursier() {
        System.out.println("\nIndiquer le numero de la personne");
        int numPersonne = Clavier.lireInt();
        System.out.println("\nIndiquer le montant de la bourse");
        double montantBourse = Clavier.lireDouble();
        if (retourPersonneNum(numPersonne) instanceof EtudiantBoursier) {
            ((EtudiantBoursier) retourPersonneNum(numPersonne)).setBourse(montantBourse);
        } else {
            System.out.println("Ce n'est pas un Personnel");
        }
    }

    /**
     * Methode pour definir la prime des personnel
     */
    public static void definiPrime() {
        System.out.println("\nIndiquer le numero de la personne");
        int numPersonne = Clavier.lireInt();
        boolean choix;
        String reponse;
        System.out.println("\nIndiquer si vous voulez donner la prime Oui/Non");
        reponse = Clavier.lireString();
        reponse = reponse.toLowerCase();
        if (reponse.equals("oui")) {
            choix = true;
        } else {
            choix = false;
        }
        if (retourPersonneNum(numPersonne) instanceof Personnel) {
            ((Personnel) retourPersonneNum(numPersonne)).setObtentionPrime(choix);
        } else {
            System.out.println("Ce n'est pas un Personnel");
        }
    }

    /**
     * Methode pour fixer le salaire Fixe des personnels
     */
    public static void definiSalaireFixe() {
        System.out.println("\nIndiquer le numero de la personne");
        int numPersonne = Clavier.lireInt();
        System.out.println("\nindiquer le nombre d'absence justifie");
        double salaireFixe = Clavier.lireDouble();
        if (retourPersonneNum(numPersonne) instanceof Personnel) {
            ((Personnel) retourPersonneNum(numPersonne)).setSalaireFixe(salaireFixe);
        } else {
            System.out.println("Ce n'est pas un Personnel");
        }
    }

    /**
     * Methode pour retourner les personnels avec plus de 5 absence
     */
    public static void consoleRetourPerPlus5Abs() {
        retourPerPlus5Abs();
    }

    /**
     * Methode pour retourner les etudiants avec plus de 5 absence
     */
    public static void consoleRetourEtuPlus5Abs() {
        retourPerPlus5Abs();
    }

    public static void ajoutDuneAbsenceJustifie() {
        System.out.println("\nindiquer le numero de la personne pour lui ajouter une absence justife");
        int numPersonne = Clavier.lireInt();
        System.out.println("\nIndiquer le nombre d'absence justifie");
        int numAbsenceJusitife = Clavier.lireInt();
        retourPersonneNum(numPersonne).addAbsJustif(numAbsenceJusitife);
        absence();
    }

    public static void ajoutDuneAbsenceinjustifie() {
        System.out.println("\nIndiquer le numero de la personne pour lui ajouter une absence injustife");
        int numPersonne = Clavier.lireInt();
        System.out.println("\nindiquer le nombre d'absence injustifie");
        int numAbsenceJusitife = Clavier.lireInt();
        retourPersonneNum(numPersonne).addAbsNonJustif(numAbsenceJusitife);
        absence();
    }

    /**
     * Méthode pour retourner les personnes du registre en fonction de leur
     * classe
     */
    public static void afficherToutesLesPersonne() {
        int choix = -1;
        System.out.println("\nMerci de faire votre choix");
        System.out.println("--------------------------------------------------\n");
        System.out.println("[1] : Afficher tout les etudiants");
        System.out.println("[2] : Afficher tout les etudiants boursier");
        System.out.println("[3] : Afficher tout les personnel administratif");
        System.out.println("[4] : Afficher tout les enseignant titulaire");
        System.out.println("[5] : Afficher tout les enseignant vacataire");
        choix = Clavier.lireInt();
        switch (choix) {
            case 0:
                menu();
                break;
            case 1:
                System.out.println(retourPersonnesType("Personne.Etudiant"));

                supprimePersonne();
                break;
            case 2:
                System.out.println(retourPersonnesType("Personne.EtudiantBoursier"));
                supprimePersonne();
                break;
            case 3:
                System.out.println(retourPersonnesType("Pesonne.PersonnelAdministratif"));
                supprimePersonne();
                break;
            case 4:
                System.out.println(retourPersonnesType("Personne.PersonnelEnseignantTitulaire"));
                supprimePersonne();
                break;
            case 5:
                System.out.println(retourPersonnesType("Personne.PersonnelEnseignantVacataire"));
                supprimePersonne();
                break;
        }
    }

    /**
     * Méthode pour supprimer un element de Arraylist dans la classe Personne
     *
     * @return
     */
    public static void effacerUnElement() {
        System.out.println("indiquer le Numero de la personne à supprimer du registre : ");
        int idASupprimer = Clavier.lireInt();
        if (recupIndiceRegistre(idASupprimer) < 0) {
            System.out.print("Le numéro de la personne n'a pas été trouvé.");
        } else {
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
        alouerUnBureauApresCreation();
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
        alouerUnBureauApresCreation();
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
        alouerUnBureauApresCreation();
    }

}
