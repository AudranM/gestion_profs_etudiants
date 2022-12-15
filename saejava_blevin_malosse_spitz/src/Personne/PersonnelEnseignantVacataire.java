/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personne;

/**
 *
 * @author audranmalosse
 */
public class PersonnelEnseignantVacataire extends PersonnelEnseignant{
    
    /**
     *  Constructeur prenant en argument un nom et un prenom<br>
     *  Le Constructeur appelle le Constucteur de PersonnelEnseignant
     * @param Nom Nom du PersonnelEnseignantVacataire (String)
     * @param Prenom Prenom du PersonnelEnseignantVacataire (String)
     * @see PersonnelEnseignant#PersonnelEnseignant(java.lang.String, java.lang.String) 
     */
    public PersonnelEnseignantVacataire(String Nom, String Prenom){
        super(Nom, Prenom);
        super.setEstVacataire(true);
        }
    
    /**
     * Constructeur par défaut<br>
     * Le constructeur utilise son Constructeur à deux arguments avec comme 
     * nom et prénom "ICONNU"
     * @see PersonnelEnseignantVacataire#PersonnelEnseignantVacataire() 
     */
    public PersonnelEnseignantVacataire(){
        this("INCONNU", "INCONNU");
        }
}
