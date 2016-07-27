package com.leandro.submarine.coordinates;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.leandro.submarine.directions.impl.NorthDirection;
import com.leandro.submarine.interfaces.Coordinate;
import com.leandro.submarine.interfaces.Direction;
import com.leandro.submarine.interfaces.Position;

public class SpatialPosition implements Position {

    private static final String COORDINATES_SEPARATOR = " ";
    private Coordinate xAxis;
    private Coordinate yAxis;
    private Coordinate zAxis;
    private Direction direction;

    public SpatialPosition() {
        xAxis = new SpatialCoordinate();
        yAxis = new SpatialCoordinate();
        zAxis = new SpatialCoordinate();
        direction = new NorthDirection();
    }

    public Coordinate getXAxis() {
        return xAxis;
    }

    public Coordinate getYAxis() {
        return yAxis;
    }

    public Coordinate getZAxis() {
        return zAxis;
    }

    @Override
    public Direction getDirection() {
        return direction;
    }

    @Override
    public void turnLeft() {
        this.direction = this.direction.turnLeftDirection();
    }

    @Override
    public void turnRight() {
        this.direction = this.direction.turnRightDirection();
    }

    public String toString() {
        // takes the string value from each coordinate/direction in the stream,
        // and join them using
        // a separator
        return stream().map(p -> p.toString())
                       .collect(Collectors.joining(COORDINATES_SEPARATOR));
    }

    @Override
    public Stream<? extends Object> stream() {
        return Arrays.asList(xAxis, yAxis, zAxis, direction.getValue())
                     .stream();
    }

    @Override
    public void moveInDirection() {
        direction.moveInDirection(this);
    }

    @Override
    public void goUp() {
        zAxis.incrementValue();
    }

    @Override
    public void goDown() {
        zAxis.decrementValue();
    }

}
