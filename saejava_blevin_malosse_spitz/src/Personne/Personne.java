/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personne;

/**
 *
 * @author audranmalosse
 */
public abstract class Personne {
    // attributs 
    private int numPersonne=0;
    private int absJustif= 0;
    private int absNonJustif =0;
    private String nom;
    private String prenom;
    public static int cpt = 0;
    
    /**Constructeur qui utilise les setters avec Nom et Prenom comme argument*/
    public Personne (String Nom, String Prenom){
            setNom(Nom);
            setPrenom(Prenom);
            this.numPersonne = cpt++;
    }
    /**Constructeur par defaut qui utilise les setters et aucun argument*/
    public Personne (){
            this.nom = "inconnu";
            this.prenom = "inconnu";    
            this.numPersonne = cpt++;
    }
    //getter
    
    public String getNom(){ return this.nom;}
    public String getPrenom(){ return this.prenom;}
    public int getAbsJustif(){ return this.absJustif;}
    public int getAbsNonJustif(){ return this.absNonJustif;}
    public int getNumPersonne(){ return this.numPersonne;}
    
    /**Fonction qui verifie si la chaine de caractère transmise en argument n'est pas null ni vide*/
    public String verifVide(String aVerifier){
        if(aVerifier == null && (!aVerifier.equals("")))
            return aVerifier;
        else
            return "inconnu";
    }
    //setter
    public void setNom(String Nom){ this.nom = verifVide(Nom);}
    public void setPrenom(String Prenom){this.prenom = verifVide(Prenom);}
    
    /** addAbsNonJustif ajoute la valeurs transmise en paramètre au nombre d'absences déjà enregistrées*/
    public void addAbsNonJustif(int Nombre){this.absNonJustif+=Nombre;}
    
    /** addAbsJustif transforme le nombre d'absence injustifiée, transmise en paramètre, en absence justifiée*/
    public void addAbsJustif (int Nombre){
        
        if (absNonJustif>=Nombre)
            this.absJustif-=Nombre;
        else
            System.out.println("ERREUR: Il n'y a pas assez d'absences non justifiée"); 
    }
    public boolean equals (Object obj){
        if (!(obj instanceof Personne))
            return false;
        Personne p = (Personne) obj;
        return this.nom.equals(p.nom) && this.prenom.equals(p.prenom) && this.numPersonne == p.numPersonne;
    }
}