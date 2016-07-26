package com.leandro.submarine.directions.impl;

import com.leandro.submarine.interfaces.Direction;

public class SouthDirection implements Direction {

    private static final String value = "SUL";

    @Override
    public String getValue() {
        return value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public WestDirection turnRightDirection() {
        return new WestDirection();
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public EastDirection turnLeftDirection() {
        return new EastDirection();
    }
}
