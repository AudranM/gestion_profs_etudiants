/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personne;

/**
 *
 * @author audranmalosse
 */
public class Test {
    public static void main (String [] args){  
        
        Personnel pers1 = new PersonnelAdministratif("pers1", "pers1", 0., false);
        Personnel pers2 = new PersonnelAdministratif("pers2", "pers2", 0., false);
        Personnel pers3 = new PersonnelAdministratif("pers3", "pers3", 0., false);
        
        Etudiant Test1 = new Etudiant ("test", "test");
        Etudiant Test2 = new Etudiant ("test1", "test1");
        Etudiant Test3 = new Etudiant ("test2", "test2");
        Etudiant Test4 = new Etudiant ("test", "test");
        Etudiant Test5 = new Etudiant ("test", "test");
        System.out.println(Test1);
        System.out.println("");
        
        Test1.addAbsNonJustif(6);
        
        System.out.println(Test1);
        System.out.println("");
        
        Test1.addAbsJustif(2);
        
        System.out.println(Test1);
        System.out.println("");
        
        Personne.afficheRegistre();
        
        Bureau TestB1 = new Bureau(3, pers1, pers2, pers3);
        Bureau TestB2 = new Bureau(3, pers1, pers2, pers3);
        Bureau TestB3 = new Bureau(3, pers1, pers2, pers3);
        Bureau TestB4 = new Bureau();
        TestB1.afficheOccupants();
        Bureau.afficheBureaux();
    }
    
}
