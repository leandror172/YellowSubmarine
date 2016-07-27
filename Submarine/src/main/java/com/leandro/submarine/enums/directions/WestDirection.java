package com.leandro.submarine.enums.directions;

import java.util.function.Consumer;

import com.leandro.submarine.interfaces.Direction;
import com.leandro.submarine.interfaces.Position;

public enum WestDirection implements Direction {

    INSTANCE;
    private static final String value = "OESTE";

    @Override
    public String getValue() {
        return value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public NorthDirection turnRightDirection() {
        return NorthDirection.INSTANCE;
    }

    @SuppressWarnings("unchecked")
    @Override
    public SouthDirection turnLeftDirection() {
        return SouthDirection.INSTANCE;
    }

    @Override
    public Consumer<Position> getDirectionConsumer() {
        return directionConsumer;
    }

    private Consumer<Position> directionConsumer = p -> {
        p.getXAxis()
         .decrementValue();
    };
}
