package com.leandro.submarine.directions.impl;

import com.leandro.submarine.interfaces.Direction;

public class EastDirection implements Direction {

    private static final String value = "LESTE";

    @Override
    public String getValue() {
        return value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public SouthDirection turnRightDirection() {
        return new SouthDirection();
    }

    @SuppressWarnings("unchecked")
    @Override
    public NorthDirection turnLeftDirection() {
        return new NorthDirection();
    }

}
