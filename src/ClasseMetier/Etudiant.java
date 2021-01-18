/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasseMetier;

/**
 *
 * @author pheni
 */
public class Etudiant 
{
    private int numEtudiant;
    private String prenomEtudiant;
    private int ageEtudiant;
    
    public Etudiant (int unNum, String unPrenom, int unAge)
    {
        this.numEtudiant = unNum;
        prenomEtudiant = unPrenom;
        ageEtudiant = unAge;
    }

    /**
     * @return the numEtudiant
     */
    public int getNumEtudiant() {
        return numEtudiant;
    }

    /**
     * @return the prenomEtudiant
     */
    public String getPrenomEtudiant() {
        return prenomEtudiant;
    }

    /**
     * @return the ageEtudiant
     */
    public int getAgeEtudiant() {
        return ageEtudiant;
    }

    /**
     * @param ageEtudiant the ageEtudiant to set
     */
    public void setAgeEtudiant(int ageEtudiant) {
        this.ageEtudiant = ageEtudiant;
    }
    
}
