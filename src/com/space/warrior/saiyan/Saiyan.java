package com.space.warrior.saiyan;

public class Saiyan {
    private int force;
    private int vitesse;
    private String cheveux;

    private boolean canFly;

    public Saiyan(int force, int vitesse) {
        this.force = force;
        this.vitesse = vitesse;
        this.cheveux = "Noir";
        this.canFly = true;
    }

    public void augmenterForce(int force) {
        this.force += force;
    }

    public void displayStatus() {
        System.out.println("La vitesse finale du Saiyan est de "+getVitesse());
        System.out.println("La couleur de cheveux du Saiyan est de "+getCheveux());
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public String getCheveux() {
        return cheveux;
    }

    public void setCheveux(String cheveux) {
        this.cheveux = cheveux;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
