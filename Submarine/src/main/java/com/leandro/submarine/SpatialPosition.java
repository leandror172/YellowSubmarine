package com.leandro.submarine;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.leandro.submarine.coordinates.CoordinateImpl;
import com.leandro.submarine.coordinates.YAxisCoordinate;
import com.leandro.submarine.directions.impl.NorthDirection;
import com.leandro.submarine.directions.impl.SouthDirection;
import com.leandro.submarine.interfaces.CommandConsumer;
import com.leandro.submarine.interfaces.Coordinate;
import com.leandro.submarine.interfaces.Direction;
import com.leandro.submarine.interfaces.Position;

public class SpatialPosition implements Position {

    private static final String COORDINATES_SEPARATOR = " ";
    private Coordinate xAxis;
    private YAxisCoordinate yAxis;
    private Coordinate zAxis;
    private Direction direction;

    public SpatialPosition() {
        xAxis = new CoordinateImpl();
        yAxis = new YAxisCoordinate();
        zAxis = new CoordinateImpl();
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
        // takes the string value from each coordinate/direction in the stream, and join them using
        // a separator
        return stream().map(p -> p.toString())
                       .collect(Collectors.joining(COORDINATES_SEPARATOR));
    }

    @Override
    public Stream<? extends Object> stream() {
        return Arrays.asList(xAxis,
                             yAxis,
                             zAxis,
                             direction.getValue())
                     .stream();
    }

    @Override
    public void moveInDirection() {
        direction.moveInDirection(this);
    }

}
