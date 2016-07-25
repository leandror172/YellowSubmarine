package com.leandro.submarine.submarine;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.leandro.submarine.submarine.impl.NorthDirection;
import com.leandro.submarine.submarine.interfaces.Direction;

public class Position {

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

    public String toString() {
        return stream().map(p -> p.toString())
                       .collect(Collectors.joining(" "));
    }

    /**
     * This method takes the coordinates and direction that determines a
     * position, and returns them into a stream
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
