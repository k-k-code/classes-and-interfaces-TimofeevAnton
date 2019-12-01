package com.brunoyam.unit_2.army.machines;

import com.brunoyam.unit_2.army.Unit;

abstract class Machines extends Unit {

    int fuel;

    Machines(int maxSpeed, int armor, int fuel) {
        super(maxSpeed, armor);
        this.fuel = fuel;
    }


}
