/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personne;
import java.util.ArrayList; 
import java.util.Arrays;

/**
 *
 * @author lucasspitz
 */
public class Bureau {
    
    /**
     * Attributs statics
     * @param bureaux liste de tous les bureaux créés
     * @param comptNum  compteur du nb de bureaux créés (pour attribuer le num
     * des noveaux bureaux
     */
    private static ArrayList<Bureau>bureaux = new ArrayList<>();
    private static int comptNum;
    
    /**
     * Attributs
     * @param nbPlace nb de places dans le bureau
     * @param numero numero du bureau, définit automatiquement grâce au compteur
     * @param occupants tab de type Personnel contenant les références vers les
     * X (nbPlace) occupants du bureau
     */
    private int nbPlace;
    private final int numero;
    private Personnel occupants[];
    
    
     static {
         
         comptNum = 0;
     }
    
//---- CONSTRUCTEURS ----

    /**
     * Constructeur par défaut
     */
    Bureau(){

        setNbPlace(3);
        setNbOccupants(this.nbPlace);
        incrCompt();
        numero = comptNum;
        incrTab();
    }
    /**
     * Constructeur sans assigner d'occupants
     * @param nbPlace (int)
     * Il n'y a pas d'autre arguments car le numéro du bureau est déterminé par
     * le compteur (att static) et la taille du tab occupant par nbPlace
     */
    Bureau(int nbPlace){


        setNbPlace(nbPlace);
        setNbOccupants(this.nbPlace);
        incrCompt();
        numero = comptNum;
        incrTab();

    }

    /**
     * Constructeur avec assignation d'un occupant
     * @param nbPlace (int)
     * @param occupant1 (référence de type Personne)
     * Il n'y a pas d'autre arguments car le numéro du bureau est déterminé par
     * le compteur (att static) et la taille du tab occupant par nbPlace
     */
    Bureau(int nbPlace, Personnel occupant1){
        
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
    Bureau(int nbPlace, Personnel occupant1, Personnel occupant2){

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
    Bureau(int nbPlace, Personnel occupant1, Personnel occupant2, Personnel occupant3){

        this(nbPlace, occupant1, occupant2);
        setOccupant(occupant3);
    }

//---- SETTERS ----
    
    /**
     * @param nbPlace (min 1, max 3
     */
    public final void setNbPlace(int nbPlace){

        if (nbPlace < 1) this.nbPlace = 1;
        else if (nbPlace > 3) this.nbPlace = 3; //Nombre de place max = 3
        else this.nbPlace = nbPlace;

        setNbOccupants(nbPlace);// reste à ajouter qq ch qui gère la réassignation des occupants dans le tableau
    }

    private void setNbOccupants(int nbPlace){

        occupants = new Personnel[nbPlace];

    }
    
    /**
     * 
     * @param occupant référence vers le Personnel à ajouter au bureau
     */
    public final void setOccupant(Personnel occupant){

        if (occupant.getSonBureau() == null ){
            boolean assigne = false;
            for (int i = 0; i < nbPlace; i++){
                if (Utils.isNull(occupants[i]) && !assigne){
                    occupants[i] = occupant;
                    occupant.setSonBureau(this);
                    assigne = true; 
                }
            }
            if (!assigne) System.out.println("ERREUR : Il n'y a plus de places dans ce bureau");
        } else {
            System.out.println("ERREUR : " + occupant.getNomPrenom() + " est déjà dans le bureau " + occupant.getSonBureau().numero); 
        }

    }
    
    /**
     * 
     * @param occupant reference de type Personnel duquel il faut changer le bureau
     * @param newBureau reference de type Bureau vers lequel il faut déplacer le Personnel
     */
    public void envoieVersNewBureau(Personnel occupant, Bureau newBureau){
        
        for (int i = 0; i <nbPlace; i++){
            
            if (occupants[i].equals(occupant)){
                occupants[i] = null;
                occupants[i].setSonBureau(null);
                newBureau.setOccupant(occupants[i]);
                occupants[i].setSonBureau(newBureau);
            }
            
        }
    }
    
    
//---- GETTERS ----


    public int getNbPlace(){

        return nbPlace;
    }
    
    public int getNumero(){
        
        return numero;
    }
    
    public String getStringOccupants(){
        
        String stringOccupants = "Occupant(s) du bureau " + getNumero() + " : \n";
        for (int i = 0; i < nbPlace; i++ ){
            
            if (occupants[i] != null) stringOccupants += occupants[i].getNomPrenom() + "\n";    
        }
        
        return stringOccupants;
    }

    //public 
    
//---- AFFICHEURS ----

    public void afficheOccupants(){
        
        System.out.println(getStringOccupants());
    }
    
    public static void afficheBureaux(){
        

        int size = bureaux.size();
        for (int i = 0; i < size; i++){
            System.out.println(bureaux.get(i).toString());
        }
        
    } 
    
    @Override
    public String toString(){
    
        return "Numero du bureau : " + numero + "\nNombre de place(s) : " + nbPlace + "\n" + getStringOccupants();
    }

//---- METHODES ---- 
    
    
    private void incrCompt(){
        
        comptNum++;
    }
    
    /**
     * 
     * @param B référence vers le bureau à ajouté à la liste
     */
    private void incrTab (){
        bureaux.add(this);
    }
    
    /**
     * @param o référence de type objet
     * @return vrai si c'est le même bureau, faux sinon
     */
    @Override
    public boolean equals(Object o){
        
        if (this == o) return true;
        if (this == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Bureau b = (Bureau) o;
        return this.nbPlace == b.nbPlace && this.numero == b.nbPlace && this.occupants == b.occupants;
    }
    
    /*Je ne pense pas qu'on va utiliser le hashcode, mais on l'a au cas où et
    ça fait disparaitre le warning */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.nbPlace;
        hash = 47 * hash + this.numero;
        hash = 47 * hash + Arrays.deepHashCode(this.occupants);
        return hash;
    }
    
   
}
