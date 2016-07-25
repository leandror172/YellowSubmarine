package com.leandro.submarine.directions.impl;

import com.leandro.submarine.interfaces.Direction;

public class EastDirection implements Direction {

    private static final String value = "LESTE";
    private static SouthDirection turnRightDirection = new SouthDirection();
    private static NorthDirection turnLeftDirection = new NorthDirection();

    @Override
    public String getValue() {
        return value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public SouthDirection getTurnRightDirection() {
        return turnRightDirection;
    }

    @SuppressWarnings("unchecked")
    @Override
    public NorthDirection getTurnLeftDirection() {
        return turnLeftDirection;
    }

}
