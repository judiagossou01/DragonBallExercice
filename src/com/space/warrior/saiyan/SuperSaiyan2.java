package com.space.warrior.saiyan;

public class SuperSaiyan2 extends SuperSaiyan {
    public SuperSaiyan2(int force, int vitesse) {
        super(force, vitesse);
    }

    @Override
    public void augmenterForce(int force) {
        super.augmenterForce(force);
        this.vitesse -= force;
    }
}
