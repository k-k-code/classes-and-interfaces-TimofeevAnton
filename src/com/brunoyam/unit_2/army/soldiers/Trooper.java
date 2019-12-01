package com.brunoyam.unit_2.army.soldiers;

import com.brunoyam.unit_2.army.Shootable;
import com.brunoyam.unit_2.army.Shooter;

public class Trooper extends Soldier implements Shootable, Shooter {

    public Trooper (int maxSpeed, int armor, int health){
        super(maxSpeed, armor, health);

    }

    @Override
    public void GetShot(int damage) {
        this.health = this.health - damage;
    }

    @Override
    public void Shoot(Shootable target) {

    }
}
