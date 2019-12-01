package com.brunoyam.unit_2.models.army.machines;

import com.brunoyam.unit_2.models.army.Shootable;
import com.brunoyam.unit_2.models.army.Shooter;

public class Tank extends AbstractMachines implements Shooter {

    private final static int POWER = 1000;


    public Tank (int maxSpeed, int armor, int fuel){
        super(maxSpeed, armor, fuel);
    }



    @Override
    public int getPower() {
        return POWER;
    }

    @Override
    public void shoot(Shootable target) {

    }
}
