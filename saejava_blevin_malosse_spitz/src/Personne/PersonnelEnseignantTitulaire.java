/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personne;

/**
 *
 * @author audranmalosse
 */
public class PersonnelEnseignantTitulaire extends PersonnelEnseignant {
    
    /**
     * Constructeur prenant en argument un nom, un prenom, un nb d'heures statutaires et un salaire fixe<br>
     * Le Constructeur appelle le Constucteur de PersonnelEnseignant
     * @param Nom Nom du PersonnelEnseignantTitulaire (String)
     * @param Prenom Prénom du PersonnelEnseignantTitulaire (String)
     * @param NbHeuresStatutaire Nombre d'heures statutaires sur le contrat du PersonnelEnseignantTitulaire (double)
     * @param SalaireFixe Salaire fixe du PersonnelEnseignantTitulaire (double)
     * @see PersonnelEnseignant#PersonnelEnseignant(java.lang.String, java.lang.String) 
     */
    public PersonnelEnseignantTitulaire(String Nom, String Prenom, double NbHeuresStatutaire, double SalaireFixe) {
        super(Nom, Prenom);
        super.setDroitPrime(true);
        super.setEstTitulaire(true);
        super.setNbHeures(NbHeuresStatutaire);
        super.setSalaireFixe(SalaireFixe);
    }
    
    /**
     * Constructeur par défaut de PersonnelEnseignantTitulaire<br>
     * Le constructeur utilise son Constructeur à deux arguments avec comme 
     * nom et prénom "ICONNU"
     * @see PersonnelEnseignantTitulaire#PersonnelEnseignantTitulaire(java.lang.String, java.lang.String, double, double) 
     */
    public PersonnelEnseignantTitulaire() {
        this("INCONNU", "INCONNU",0.,0.);
    }

}
