/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personne;

/**
 *
 * @author lucasspitz
 */
public class Bureau {
    
    private static Bureau bureaux[];
    private int nbPlace;
    private final int numero;
    private static int comptNum;
    private Personne occupants[];
    
    
     static {
         
         comptNum = 0;
     }
    
//---- CONSTRUCTEURS ----

    /**
     * Constructeur par défaut
     */
    Bureau(){

        setNumero();
        setNbPlace(3);
        setNbOccupants(this.nbPlace);
        numero = comptNum;
    }
    /**
     * Constructeur sans assigner d'occupants
     * @param nbPlace (int)
     * Il n'y a pas d'autre arguments car le numéro du bureau est déterminé par
     * le compteur (att static) et la taille du tab occupant par nbPlace
     */
    Bureau(int nbPlace){

        setNumero();
        setNbPlace(nbPlace);
        setNbOccupants(this.nbPlace);
        numero = comptNum;

    }

    /**
     * Constructeur avec assignation d'un occupant
     * @param nbPlace (int)
     * @param occupant1 (référence de type Personne)
     * Il n'y a pas d'autre arguments car le numéro du bureau est déterminé par
     * le compteur (att static) et la taille du tab occupant par nbPlace
     */
    Bureau(int nbPlace, Personne occupant1){
        
        this(nbPlace);
        setOccupant(occupant1);
    }

    /**
     * Constructeur avec assignation de deux occupants
     * @param nbPlace (int)
     * @param occupant1 (référence de type Personne)
     * @param occupant2 (référence de type Personne)
     * Il n'y a pas d'autre arguments car le numéro du bureau est déterminé par
     * le compteur (att static) et la taille du tab occupant par nbPlace
     */
    Bureau(int nbPlace, Personne occupant1, Personne occupant2){

        this(nbPlace, occupant1);
        setOccupant(occupant2);
    }

    /**
     * Constructeur avec assignation de deux occupants
     * @param nbPlace (int)
     * @param occupant1 (référence de type Personne)
     * @param occupant2 (référence de type Personne)
     * @param occupant3 (référence de type Personne)
     * Il n'y a pas d'autre arguments car le numéro du bureau est déterminé par
     * le compteur (att static) et la taille du tab occupant par nbPlace
     */
    Bureau(int nbPlace, Personne occupant1, Personne occupant2, Personne occupant3){

        this(nbPlace, occupant1, occupant2);
        setOccupant(occupant3);
    }

//---- SETTERS ----
    public void setNumero(){

        comptNum++; 
        //numero = comptNum;
    }

    public void setNbPlace(int nbPlace){

        if (nbPlace < 0) this.nbPlace = 0;
        else if (nbPlace > 3) this.nbPlace = 3; //Nombre de place max = 3
        else this.nbPlace = nbPlace;

        setNbOccupants(nbPlace);// reste à ajouter qq ch qui gère la réassignation des occupants dans le tableau
    }

    private void setNbOccupants(int nbPlace){

        occupants = new Personne[nbPlace];

    }

    public void setOccupant(Personne occupant){

        if (occupants[0] == null && nbPlace >= 1) occupants[0] = occupant;
        else if (occupants[1] == null && nbPlace >= 2) occupants[1] = occupant;
        else if (occupants[2] == null && nbPlace >= 3) occupants[2] = occupant;
        else System.out.println("ERREUR : Il n'y a plus de places dans ce bureau");

    }
    
//---- GETTERS ----

    public int getNbPlace(){

        return nbPlace;
    }
    
    public int getNumero(){
        
        return numero;
    }

    //public 
    
//---- AFFICHEURS ----

    public void afficheOccupants(){
        
        System.out.println("Occupant(s) du bureau " + getNumero() + " : ");
        for (int i = 0; i < nbPlace; i++ ){
            
            if (occupants[i] != null) System.out.println(occupants[i].getNom());    
        }
    }
}
