package com.leandro.submarine;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.leandro.submarine.directions.impl.NorthDirection;
import com.leandro.submarine.interfaces.CoordinateInterface;
import com.leandro.submarine.interfaces.Direction;

public class Position {

    private static final String COORDINATES_SEPARATOR = " ";
    private CoordinateInterface xAxis;
    private Coordinate yAxis;
    private Coordinate zAxis;
    private Direction direction;

    public Position() {
        xAxis = new Coordinate();
        yAxis = new Coordinate();
        zAxis = new Coordinate();
        direction = new NorthDirection();
    }

    public CoordinateInterface getXAxis() {
        return xAxis;
    }

    public void setXAxis(Coordinate xAxis) {
        this.xAxis = xAxis;
    }

    public Coordinate getYAxis() {
        return yAxis;
    }

    public void setYAxis(Coordinate yAxis) {
        this.yAxis = yAxis;
    }

    public Coordinate getZAxis() {
        return zAxis;
    }

    public void setZAxis(Coordinate zAxis) {
        this.zAxis = zAxis;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public String toString() {
        return stream().map(p -> p.toString())
                       .collect(Collectors.joining(Position.COORDINATES_SEPARATOR));
    }

    /**
     * This method takes the coordinates and direction that determines a position, and returns them
     * into a stream
     * 
     * @return Stream<? extends Object>
     */
    public Stream<? extends Object> stream() {
        return Arrays.asList(xAxis,
                            yAxis.getValue(),
                            zAxis.getValue(),
                            direction.getValue())
                     .stream();
    }

}
