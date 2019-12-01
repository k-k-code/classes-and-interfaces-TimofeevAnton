package com.brunoyam.unit_2.army.machines;

import com.brunoyam.unit_2.army.Shootable;
import com.brunoyam.unit_2.army.Shooter;

public class Tank extends Machines implements Shooter {

    public Tank (int maxSpeed, int armor, int fuel){
        super(maxSpeed, armor, fuel);
    }

    @Override
    public void Shoot(Shootable target) {

    }
}
