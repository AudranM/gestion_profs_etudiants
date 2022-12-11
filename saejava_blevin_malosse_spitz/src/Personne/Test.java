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
        Etudiant Test1 = new Etudiant ("test", "test");
        Etudiant Test2 = new Etudiant ("test", "test");
        Etudiant Test3 = new Etudiant ("test", "test");
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
        //comment
        
        Personne.afficheRegistre();
    }
    
}
