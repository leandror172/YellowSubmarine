package com.leandro.submarine.enums.directions;

import java.util.function.Consumer;

import com.leandro.submarine.interfaces.Direction;
import com.leandro.submarine.interfaces.Position;

public enum EastDirection implements Direction {

    INSTANCE;
    private static final String value = "LESTE";

    private EastDirection() {
    }

    @Override
    public String getValue() {
        return value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public SouthDirection turnRightDirection() {
        return SouthDirection.INSTANCE;
    }

    @SuppressWarnings("unchecked")
    @Override
    public NorthDirection turnLeftDirection() {
        return NorthDirection.INSTANCE;
    }

    @Override
    public Consumer<Position> getDirectionConsumer() {
        return directionConsumer;
    }

    private Consumer<Position> directionConsumer = p -> {
        p.getXAxis()
         .incrementValue();
    };
    
}
