package com.leandro.submarine.directions.impl;

import com.leandro.submarine.interfaces.Direction;
import com.leandro.submarine.interfaces.Position;

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

    @Override
    public void moveInDirection(Position p) {
        // TODO Auto-generated method stub
        
    }
}
