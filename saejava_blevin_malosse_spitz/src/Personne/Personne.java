/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personne;
import java.util.ArrayList; 
/**
 *
 * @author audranmalosse
 */
public abstract class Personne {

    // attributs 
    private final int numPersonne;
    private int absJustif= 0;
    private int absNonJustif =0;
    private String nom;
    private String prenom;
    private static int cpt = 0;
    private static ArrayList<Personne>registre = new ArrayList<>();
    
    
    /**Constructeur qui utilise les setters avec Nom et Prenom comme argumen
     * @param Nom Nom de la personne
     * @param Prenom Pernom de la personne
     */
    public Personne (String Nom, String Prenom){
            this.setNom(Nom);
            this.setPrenom(Prenom);
            this.numPersonne = cpt++;
            this.ajoutPersonne(this);
            
    }
    
    /**Constructeur par defaut qui utilise les setters et aucun argument*/
    public Personne (){
        this("INCONNU","INCONNU");
    }
    
    //getter
    public String getNom(){ return this.nom;}
    public String getPrenom(){ return this.prenom;}
    //Pour l'affichage, où l'on a souvent besoin de nom + prenom
    public String getNomPrenom(){return this.getNom() + " " + this.getPrenom();}
    public int getAbsJustif(){ return this.absJustif;}
    public int getAbsNonJustif(){ return this.absNonJustif;}
    public int getNumPersonne(){ return this.numPersonne;}
    

    
    //setter
    void setNom(String Nom){this.nom = Utils.verifString(Nom);} 
    void setPrenom(String Prenom){this.prenom = Utils.verifString(Prenom);}
    
    /** addAbsNonJustif ajoute une absence injustifiée*/
    public void addAbsNonJustif(){this.absNonJustif++;}
    
    /** addAbsNonJustif ajoute la valeurs transmise en paramètre au nombre d'absences déjà enregistrée
     * @param Nombre Nombre d'absences injustifiées
     */
    public void addAbsNonJustif(int Nombre){this.absNonJustif+=Math.abs(Nombre);}
    
    /** addAbsJustif transforme une absence injustifiée en absence justifiée 
     * si il y en a au moins une.
     */
    public void addAbsJustif (){
        if (absNonJustif >= 1){
            this.absJustif += 1;
            this.absNonJustif -=1;
        }
        else
            System.out.println("ERREUR: Il n'y a pas assez d'absences non justifiée");
    }
    
    /** addAbsJustif transforme le nombre d'absence injustifiée, transmise en paramètre, en absence justifiée
     * @param Nombre Nombre d'absences injustifiées que l'on veut passer en absence justifiées
     */
    public void addAbsJustif (int Nombre){
        
        if (absNonJustif>=Math.abs(Nombre)){
            this.absNonJustif -= Math.abs(Nombre);
            this.absJustif += Math.abs(Nombre);
        }
        else
            System.out.println("ERREUR: Il n'y a pas assez d'absences non justifiée"); 
    }
    /** Test d'égalité de deux peronne
     * @param obj personne dont on veut tester l'égalitée
     * @return 
     */
    public boolean equals (Personne obj){
        if (obj == null) return false;
        if (obj == this) return true;
        if (!(obj instanceof Personne))
            return false;
        Personne p = (Personne) obj;
        return this.nom.equals(p.nom) && this.prenom.equals(p.prenom) && this.numPersonne == p.numPersonne;
    }
    
    /** Méthode d'incrémentation du tableau
     * @param P Personne qui sera ajouté au registre
     */
    public static void ajoutPersonne (Personne P){registre.add(P);}
    
    /**Méthode qui parcour le registre*/
    public static void supprimePersonne (int i) {registre.remove(i);}
    
    /**Redéfinition de toString*/
    @Override
    public String toString(){
        return "\nNature de la personne : " + this.getClass().getSimpleName() +
               "\nNom : " + this.nom + 
               "\nPrenom : " + this.prenom + 
               "\nid Personne : " + this.numPersonne + 
               "\nNombre d'absences justifié : " + this.absJustif +
               "\nNombre d'absence injustifié : " + this.absNonJustif + "\n";
    }
    /**Affiche le registre*/
    public static void afficheRegistre(){
            System.out.println(registre);
    } 
    
    /**Revoie l'indice de la personne dans le registre en lui transmettant son ID*/
    public static int recupIndiceRegistre(int NumPersonne){
        int i=0;
        while (i<registre.size()){
            if (registre.get(i).getNumPersonne() == NumPersonne )
                return i;
            i++;
        }
        return -1;
    }
    
    /**Retourne la taille actuel du registre*/
    public static int tailleRegistre(){return registre.size();}
        
    /**Retourne un registre de personnes du même types*/
    public static ArrayList<Personne> retourPersonnesType(Personne P){
        ArrayList<Personne>registreTmp = new ArrayList<>();
        for (int i=0; i<registre.size(); i++)
            if (registre.get(i).getClass() == P.getClass())
                registreTmp.add(P);
        return registreTmp;
    }
    
    public static Personne retourPersonneNum (int Num){
        return registre.get(Personne.recupIndiceRegistre(Num));
    }

    /**
     * Retourne un registre de personnes qui ont plus de 5 abs
     */
    public static ArrayList<Personne> retourEtuPlus5Abs() {
        ArrayList<Personne> registreTmp = new ArrayList<>();
        Personne P = new Etudiant();
        for (int i = 0; i < registre.size(); i++) {
            if (registre.get(i).getClass() == P.getClass() && registre.get(i).getAbsNonJustif()>5) {
                registreTmp.add(P);
            }
        }
        return registreTmp;
    }
}
