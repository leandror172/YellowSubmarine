package com.leandro.submarine.enums.directions;

import java.util.function.Consumer;

import com.leandro.submarine.interfaces.Direction;
import com.leandro.submarine.interfaces.Position;

public enum NorthDirection implements Direction {

    INSTANCE;

    private static final String value = "NORTE";

    @Override
    public String getValue() {
        return value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public EastDirection turnRightDirection() {
        return EastDirection.INSTANCE;
    }

    @SuppressWarnings("unchecked")
    @Override
    public WestDirection turnLeftDirection() {
        return WestDirection.INSTANCE;
    }

    @Override
    public Consumer<Position> getDirectionConsumer() {
        return directionConsumer;
    }

    private Consumer<Position> directionConsumer = p -> {
        p.getYAxis()
         .incrementValue();
    };
}
