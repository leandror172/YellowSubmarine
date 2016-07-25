package com.leandro.submarine;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.leandro.submarine.directions.impl.NorthDirection;
import com.leandro.submarine.interfaces.Direction;

public class Position {

    private static final String COORDINATES_SEPARATOR = " ";
    private Coordinate xAxis;
    private Coordinate yAxis;
    private Coordinate zAxis;
    private Direction direction;

    public Position() {
        xAxis = new Coordinate();
        yAxis = new Coordinate();
        zAxis = new Coordinate();
        direction = new NorthDirection();
    }

    public Coordinate getxAxis() {
        return xAxis;
    }

    public void setxAxis(Coordinate xAxis) {
        this.xAxis = xAxis;
    }

    public Coordinate getyAxis() {
        return yAxis;
    }

    public void setyAxis(Coordinate yAxis) {
        this.yAxis = yAxis;
    }

    public Coordinate getzAxis() {
        return zAxis;
    }

    public void setzAxis(Coordinate zAxis) {
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
        return Arrays.asList(xAxis.getValue(),
                            yAxis.getValue(),
                            zAxis.getValue(),
                            direction.getValue())
                     .stream();
    }

}
