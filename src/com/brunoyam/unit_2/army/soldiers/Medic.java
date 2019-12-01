package com.brunoyam.unit_2.army.soldiers;

import com.brunoyam.unit_2.army.Shootable;

public class Medic extends Soldier implements Shootable {

    public Medic(int maxSpeed, int armor, int health) {
        super(maxSpeed, armor, health);

    }

    @Override
    public void GetShot(int damage) {
        this.health = this.health - damage;
    }

}
