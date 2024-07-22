/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

public class Shares {
    private static int num;
    private int id;

  
    
    private String  nom;
   private  double cout;
   private boolean etat;

    public Shares(String nom, double cout) throws CoutException {
        id=++num;
        this.nom = nom;
        setCout(cout);
        etat=false;
    }

    public String getNom() {
        return nom;
    }

    public double getCout() {
        return cout;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCout(double cout) throws CoutException {
        if(cout <0)
            throw new  CoutException("Cout invalide");
        this.cout = cout;
    }
  public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }
    @Override
    public String toString() {
        return nom+','+cout+'$';
    }
    
    
   
    
}
