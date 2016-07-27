package com.leandro.submarine.directions.impl;

import com.leandro.submarine.interfaces.Direction;
import com.leandro.submarine.interfaces.Position;

public class NorthDirection implements Direction {

    private static final String value = "NORTE";

    @Override
    public String getValue() {
        return value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public EastDirection turnRightDirection() {
        return new EastDirection();
    }

    @SuppressWarnings("unchecked")
    @Override
    public WestDirection turnLeftDirection() {
        return new WestDirection();
    }

    @Override
    public void moveInDirection(Position p) {
        p.getYAxis()
         .incrementValue();
    }
}
