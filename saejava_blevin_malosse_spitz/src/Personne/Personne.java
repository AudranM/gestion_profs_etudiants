/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personne;

/**
 *
 * @author audranmalosse
 */
public abstract class Personne implements Util{

    // attributs 
    private int numPersonne=0;
    private int absJustif= 0;
    private int absNonJustif =0;
    private String nom;
    private String prenom;
    private static int cpt = 0;
    private static Personne []registre = new Personne[0];
    
    
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
    
    /**addAbsNonJustif ajoute une absence injustifiée*/
    public void addAbsNonJustif(){this.absNonJustif++;}
    
    /** addAbsNonJustif ajoute la valeurs transmise en paramètre au nombre d'absences déjà enregistrées*/
    public void addAbsNonJustif(int Nombre){this.absNonJustif+=Math.abs(Nombre);}
    
    /** addAbsJustif transforme une absence injustifiée en absence justifiée 
    si il y en a au moins une.*/
    public void addAbsJustif (){
        if (absNonJustif >= 1){
            this.absJustif += 1;
        }
        else
            System.out.println("ERREUR: Il n'y a pas assez d'absences non justifiée");
    }
    
    /** addAbsJustif transforme le nombre d'absence injustifiée, transmise en paramètre, en absence justifiée*/
    public void addAbsJustif (int Nombre){
        
        if (absNonJustif>=Math.abs(Nombre)){
            this.absJustif-=Math.abs(Nombre);
            this.absNonJustif -= 1;
        }
        else
            System.out.println("ERREUR: Il n'y a pas assez d'absences non justifiée"); 
    }
    /** Test d'égalité de deux peronnes*/
    public boolean equals (Personne obj){
        if (!(obj instanceof Personne))
            return false;
        Personne p = (Personne) obj;
        return this.nom.equals(p.nom) && this.prenom.equals(p.prenom) && this.numPersonne == p.numPersonne;
    }
    
    /** Méthode d'incrémentation du tableau*/
    public void incrTab (Personne P){
        Personne[] newTab = new Personne[Personne.registre.length + 1];
        for(int i = 0; i< newTab.length - 1; i++)
        newTab[i] = Personne.registre[i];
        newTab[newTab.length-1] = P;
        Personne.registre = newTab;
    }
    
    public String toString(){
        return "Nom: " + this.nom + "Prenom: " + this.prenom + "id: " + this.numPersonne;
    }
    
    /**Méthode abstraite qui verifie le nombre d'absence*/
    public abstract void verifAbs();
    
}