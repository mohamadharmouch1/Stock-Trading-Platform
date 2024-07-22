package task2;

import java.util.*;

public class Company {

    private static int num;
    private int id;
    private String nom;
   
    HashSet<Person> persons;

    public Company(String nom) {
        this.id=++num;
        this.nom = nom;
        persons=new HashSet();
        
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
public HashSet <Person>addPerson(Person a){
    persons.add(a);
    return persons;
   

}
public void removePerson(Person a){
    boolean b=false;
         Iterator<Person> i= persons.iterator();
        while (i.hasNext()) {
            if(i.next().equals(a)){
                b=true;
               persons.remove(a);
              
            break;}
              

        }
        if(!b)
            System.out.println("You need to hire " +a.getNom()+"in your compagny ");
        else{
            System.out.println("You fired  "+a.getNom()+"from the company");
        }
}
   public void showPerson() {
        Iterator<Person> a = persons.iterator();
        while (a.hasNext()) {
            a.next().afficheTotal();
        }
        
    }

    public void afficheTotal() {
        System.out.println("Nom Company:" + nom + "\nPersons:");
        showPerson();
     
    }
}

       
    

