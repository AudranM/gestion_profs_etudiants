/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personne;
import java.util.ArrayList; 

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

        if (!occupant.getBureauAssigne()){
            occupant.setBureauAssigne(true);
            if (occupants[0] == null && nbPlace >= 1) occupants[0] = occupant;
            else if (occupants[1] == null && nbPlace >= 2) occupants[1] = occupant;
            else if (occupants[2] == null && nbPlace >= 3) occupants[2] = occupant;
            else{
                System.out.println("ERREUR : Il n'y a plus de places dans ce bureau");
                occupant.setBureauAssigne(false);
            }
        } else {
            System.out.println("ERREUR : " + occupant.getNomPrenom() + " a déjà un bureau"); //rajouter de get le num de bureau quand l'att aura été add dans Personnel
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
    
   
}
