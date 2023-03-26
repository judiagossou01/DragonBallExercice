package com.space.warrior.saiyan;

public class SuperSaiyan3 extends SuperSaiyan {
    public SuperSaiyan3(int force, int vitesse) {
        super(force, vitesse);
    }

    @Override
    public void augmenterForce(int force) {
        super.augmenterForce(force);
        this.setVitesse(this.getVitesse()+force);
    }
}
