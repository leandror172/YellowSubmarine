package com.leandro.submarine.directions.impl;

import com.leandro.submarine.interfaces.Direction;

public class NorthDirection implements Direction {

    private static final String value = "NORTE";
    private static EastDirection rightDirection = new EastDirection();
    private static WestDirection leftDirection = new WestDirection();
    
    @Override
    public String getValue() {
        return value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public EastDirection getTurnRightDirection() {
        return  rightDirection;
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public WestDirection getTurnLeftDirection() {
        return  leftDirection;
    }
}
