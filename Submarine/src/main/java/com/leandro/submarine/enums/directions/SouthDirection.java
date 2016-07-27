package com.leandro.submarine.enums.directions;

import java.util.function.Consumer;

import com.leandro.submarine.interfaces.Direction;
import com.leandro.submarine.interfaces.Position;

public enum SouthDirection implements Direction {

    INSTANCE;
    private static final String value = "SUL";

    @Override
    public String getValue() {
        return value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public WestDirection turnRightDirection() {
        return WestDirection.INSTANCE;
    }

    @SuppressWarnings("unchecked")
    @Override
    public EastDirection turnLeftDirection() {
        return EastDirection.INSTANCE;
    }

    @Override
    public Consumer<Position> getDirectionConsumer() {
        return directionConsumer;
    }

    private Consumer<Position> directionConsumer = p -> {
        p.getYAxis()
         .decrementValue();
    };
}
