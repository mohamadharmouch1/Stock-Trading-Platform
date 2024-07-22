/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.*;

public class Person  {

    private static int num;
    private int id;
    private String nom;
    private HashSet<Shares> shares;
    private double money;

    public Person(String nom, double m) throws CoutException {
        this.id = ++num;
        this.nom = nom;
        this.shares = new HashSet();

        setMoney(m);
    }

    public int getId() {
        return id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setShares(HashSet<Shares> shares) {
        this.shares = shares;
    }

    public void setMoney(double money) throws CoutException {
        if (money < 0) {
            throw new CoutException("Money invalid");
        }
        this.money = money;
    }

    public String getNom() {
        return nom;
    }

    public HashSet<Shares> getShares() {
        return shares;
    }

    public double getMoney() {
        return money;
    }

    public HashSet<Shares> buyShare(Shares a) throws CoutException {
        if (!a.isEtat()) {
            if (a.getCout() > money) {
                System.out.println(nom+" need also " + (a.getCout() - money) + '$');
            } else {
                this.setMoney((money - a.getCout()));
                shares.add(a);
                System.out.println(nom+" buy share "+ a.getNom());
                a.setEtat(true);
            }
        } else {
            System.out.println(" share "+a.getNom()+" has been bought");

        }
        return shares;

    }

    public void sellShare(Shares a) {
        boolean b = false;
        Iterator<Shares> i = shares.iterator();
        while (i.hasNext()) {
            if (i.next().equals(a)) {
                b = true;
                shares.remove(a);
                money += a.getCout();
                a.setEtat(false);
                break;
            }

        }
        if (!b) {
            System.out.println(nom+" need to buy " + a.getNom());
        } else {
            System.out.println(nom+" sell " + a.getNom());
        }

    }

    public void showShares() {
        Iterator<Shares> a = shares.iterator();
        while (a.hasNext()) {
            System.out.println(a.next());
        }

    }

    public void afficheTotal() {
        System.out.println("Nom:" + nom + "\nShares:");
        showShares();
        System.out.println("\nmoney " + money + '$');
    }

 
}
