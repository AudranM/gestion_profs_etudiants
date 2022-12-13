/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personne;

import static Personne.Console.*;

/**
 *
 * @author audranmalosse
 */
public class Application {

    // Menu principale
    public static void menu() {
        int choix = -1;
        System.out.println("\nMenu principale");
        System.out.println("\nMerci de faire votre choix");
        System.out.println("\n0 : Arrêter le programme");
        System.out.println("\n1 : Ajouter au registre");
        System.out.println("\n2 : Effacer du registre");
        System.out.println("\n3 : Les etudiants avec plus de 5 absence injustifié");
        System.out.println("\n4 : Liste des salariés qui ont une retenu sur salaire");
        System.out.println("\n5 : Voir les informations d'une personne dans le registre");
        System.out.println("\n6 : Ajouter une absence");
        choix = Clavier.lireInt();

        switch (choix) {
            case 0:
                quitterLeProgramme();
                break;
            case 1:
                ajoutPersonne();
                break;
            case 2:
                suprimePersonne();
                break;
            case 3:
                ajoutPersonne();
                break;
            case 4:
                ajoutPersonne();
                break;
            case 5:
                ajoutPersonne();
                break;
            case 6:
                absence();
                break;
            default:
                menu();
                break;
        }
    }

    public static void ajoutPersonne() {
        int choix = -1;
        System.out.println("\nMerci de faire votre choix");
        System.out.println("\n0 : Arrêter le programme");
        System.out.println("\n1 : retourner au menu principale");
        System.out.println("\n2 : Ajouter un etudiant");
        System.out.println("\n3 : Ajouter un etudiant boursier");
        System.out.println("\n4 : Ajouter un enseignant titulaire");
        System.out.println("\n5 : Ajouter un enseignant vacataire");
        System.out.println("\n6 : Ajouter un personnel administratif");
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

    public static void suprimePersonne() {
        int choix = -1;
        System.out.println("\nMenu principale");
        System.out.println("\nMerci de faire votre choix");
        System.out.println("\n0 : Menu principale");
        System.out.println("\n1 : Effacer un element du registre");
        System.out.println("\n2 : Voir le registre etudiant");

        switch (choix) {
            case 0:
                menu();
                break;
            case 1:
                effacerUnElement();
                suprimePersonne();
                break;
            case 2:
                ;
                break;
            case 3:
                ;
                break;
        }
    }
    
    public static void absence() {
        int choix = -1;
        System.out.println("\nMenu principale");
        System.out.println("\nMerci de faire votre choix");
        System.out.println("\n0 : Menu principale");
        System.out.println("\n1 : ajouter une absence jusitfié");
        System.out.println("\n2 : ajouter une absence injusitfié");
 

        switch (choix) {
            case 0:
                menu();
                break;
            case 1:

                break;
            case 2:
                ;
                break;
            case 3:
                ;
                break;
        }
    }
    
    
}
