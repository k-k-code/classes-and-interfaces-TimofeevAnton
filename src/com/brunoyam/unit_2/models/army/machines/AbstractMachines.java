package com.brunoyam.unit_2.models.army.machines;

import com.brunoyam.unit_2.models.army.AbstractUnit;

abstract class AbstractMachines extends AbstractUnit {

    int fuel;

    AbstractMachines(int maxSpeed, int armor, int fuel) {
        super(maxSpeed, armor);
        this.fuel = fuel;
    }


}
