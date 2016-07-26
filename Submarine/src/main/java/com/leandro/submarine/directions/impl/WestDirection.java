package com.leandro.submarine.directions.impl;

import com.leandro.submarine.interfaces.Direction;

public class WestDirection implements Direction {

    private static final String value = "OESTE";

    @Override
    public String getValue() {
        return value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public NorthDirection turnRightDirection() {
        return new NorthDirection();
    }

    @SuppressWarnings("unchecked")
    @Override
    public SouthDirection turnLeftDirection() {
        return new SouthDirection();
    }
}
