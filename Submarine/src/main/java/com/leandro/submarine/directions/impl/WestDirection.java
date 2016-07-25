package com.leandro.submarine.directions.impl;

import com.leandro.submarine.interfaces.Direction;


public class WestDirection implements Direction {

    private static final String value = "OESTE";
    private static NorthDirection turnRightDirection = new NorthDirection();
    private static SouthDirection turnLeftDirection = new SouthDirection();

    @Override
    public String getValue() {
        return value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public NorthDirection getTurnRightDirection() {
        return  turnRightDirection;
    }

    @SuppressWarnings("unchecked")
    @Override
    public SouthDirection getTurnLeftDirection() {
        return  turnLeftDirection;
    }
}
