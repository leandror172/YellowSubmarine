package com.leandro.submarine.directions.impl;

import com.leandro.submarine.interfaces.Direction;

public class SouthDirection implements Direction {

    private static final String value = "SUL";
    private static WestDirection turnRightDirection = new WestDirection();
    private static EastDirection turnLeftDirection = new EastDirection();

    @Override
    public String getValue() {
        return value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public WestDirection getTurnRightDirection() {
        return  turnRightDirection;
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public EastDirection getTurnLeftDirection() {
        return  turnLeftDirection;
    }
}
