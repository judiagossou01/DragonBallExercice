package com.space.warrior.saiyan;

public class SuperSaiyan extends Saiyan {
    public SuperSaiyan(int force, int vitesse) {
        super(force, vitesse);
        this.cheveux = "Jaune";
    }

    @Override
    public void augmenterForce(int force) {
        super.augmenterForce(force);
    }
}
