/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author Abou Taha
 */
public class Task2 {

   
    public static void main(String[] args) throws CoutException {
      Shares a=new Shares ("a",50);
      Shares b=new Shares ("b",70); 
   Shares c=new Shares ("c",100);
   Shares d =new Shares ("d",200);
       Shares e=new Shares ("e",100);
      Shares f=new Shares ("f",70); 
   Shares g=new Shares ("g",100);
   Shares h =new Shares ("h",200);
   Person p1=new Person("p1",300);
     Person p2=new Person("p2",200);
     Person p3 = new Person("p3",400);
     Person p4=new Person("p4",500);
     Person p5=new Person("p5",700);
   
     Company c1 =new Company("c1");
     Stock s= new Stock("s");
   p1.buyShare(a);
   p1.buyShare(b);
   p2.buyShare(c);
   p3.buyShare(d);
   p4.buyShare(e);
   p5.buyShare(f);
   p5.buyShare(g);
    p5.buyShare(h);
    c1.addPerson(p1);
        c1.addPerson(p2);
        c1.addPerson(p3);
        c1.addPerson(p4);
        c1.addPerson(p5);
      
        s.addCompany(c1);
        s.afficher();
}
}