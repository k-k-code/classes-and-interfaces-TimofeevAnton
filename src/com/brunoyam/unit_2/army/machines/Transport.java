package com.brunoyam.unit_2.army.machines;

import com.brunoyam.unit_2.army.Shootable;

public class Transport extends Machines implements Shootable {

    public Transport (int maxSpeed, int armor, int fuel){
        super(maxSpeed, armor, fuel);

    }


    @Override
    public void GetShot(int damage) {
        this.fuel = this.fuel - damage;
    }
}
