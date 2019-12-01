package com.brunoyam.unit_2.army.soldiers;

import com.brunoyam.unit_2.army.Unit;

abstract class Soldier extends Unit {

    int health;

    Soldier(int maxSpeed, int armor, int health){
        super(maxSpeed,armor);
        this.health = health;
    }

}
