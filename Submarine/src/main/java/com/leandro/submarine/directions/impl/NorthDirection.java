package com.leandro.submarine.directions.impl;

import com.leandro.submarine.coordinates.YAxisCoordinate;
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
    
    @SuppressWarnings("unchecked")
    public Class<YAxisCoordinate> getAxis(){
        return YAxisCoordinate.class;
    }

    @Override
    public void moveInDirection(Position p) {
        p.getYAxis().incrementValue();
    }
    

//    @Override
//    public YAxisCoordinate moveInAxis(YAxisCoordinate coordinate) {
//        position.
//    }

}
