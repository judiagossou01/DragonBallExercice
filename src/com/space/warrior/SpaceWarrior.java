package com.space.warrior;

import com.space.warrior.saiyan.Saiyan;
import com.space.warrior.saiyan.SuperSaiyan;
import com.space.warrior.saiyan.SuperSaiyan2;
import com.space.warrior.saiyan.SuperSaiyan3;

public class SpaceWarrior {
    public static void main(String[] args) {
        Saiyan goku = new Saiyan(1000,1000);

        SuperSaiyan goku1 = new SuperSaiyan(goku.getForce(), goku.getVitesse());
        goku1.augmenterForce(100);

        SuperSaiyan2 goku2 = new SuperSaiyan2(goku1.getForce(), goku1.getVitesse());
        goku2.augmenterForce(200);

        SuperSaiyan3 goku3 = new SuperSaiyan3(goku2.getForce(), goku2.getVitesse());
        goku3.augmenterForce(300);
        goku3.displayStatus();
    }
}
