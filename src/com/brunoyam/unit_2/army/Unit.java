package com.brunoyam.unit_2.army;

public abstract class Unit {

    private int maxSpeed;
    private int armor;

    public Unit(int maxSpeed, int armor) {
        this.maxSpeed = maxSpeed;
        this.armor = armor;
    }

    public Unit(){}

}
