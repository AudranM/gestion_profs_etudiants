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
    private static int cpt = 0;
    private static Personne registre [];
    
    //Constructeur qui utilise la verif des setters
    public Personne (String Nom, String Prenom){
        if (Nom != null && (!Nom.equals(""))){
            setNom(Nom);
            setPrenom(Prenom);
            this.numPersonne = cpt++;
        }
    }
    //Get
    public String getNom(){ return this.nom;}
    public String getPrenom(){ return this.prenom;}
    public int getAbsJustif(){ return this.absJustif;}
    public int getAbsNonJustif(){ return this.absNonJustif;}
    public int getNumPersonne(){ return this.numPersonne;}
    
    //Set
    public void setNom(String Nom){
        if (Nom != null && (!Nom.equals("")))
            this.nom = Nom;
        else 
            this.nom = "nomInconnu";
    }
    public void setPrenom(String Prenom){
        if (Prenom != null && (!Prenom.equals("")))
            this.prenom = Prenom;
        else
            this.prenom = "prenomInconnu";
    }
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

