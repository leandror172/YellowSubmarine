package com.leandro.submarine.directions.impl;

import com.leandro.submarine.interfaces.Direction;
import com.leandro.submarine.interfaces.Position;

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

    @Override
    public void moveInDirection(Position p) {
        p.getYAxis()
         .decrementValue();
    }
}
