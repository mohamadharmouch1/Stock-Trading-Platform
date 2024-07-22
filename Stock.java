package task2;



import java.util.*;
import task2.Company;



public class Stock {

String nom;
HashSet <Company>company;

    public Stock(String nom) {
        this.nom = nom;
        company=new HashSet();
    }

    public String getNom() {
        return nom;
    }

    public HashSet<Company> getCompany() {
        return company;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public HashSet <Company>addCompany(Company a){
    company.add(a);
    return company;
   

}
public void removeCompany(Company a){
    boolean b=false;
         Iterator<Company> i= company.iterator();
        while (i.hasNext()) {
            if(i.next().equals(a)){
                b=true;
               company.remove(a);
              
            break;}
              

        }
        if(!b)
            System.out.println("You must sign  a contract with " +a.getNom());
        else{
            System.out.println("You canceled the contract  "+a.getNom());
        }
}
   public void showCompany() {
        Iterator<Company> a = company.iterator();
        while (a.hasNext()) {
            a.next().afficheTotal();
        }
        
    }

   public void afficher(){
       System.out.println("Nom du stock :"+nom);
       showCompany();
   }
   
   


}
