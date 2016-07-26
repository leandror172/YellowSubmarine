package com.leandro.submarine.interfaces;

import java.util.stream.Stream;

public interface Position {

    /**
     * This method changes the Direction of this SpatialPosition to the equivalent lft Direction of the
     * current Direction
     */
    public void turnLeft();

    /**
     * This method changes the Direction of this SpatialPosition to the equivalent right Direction of the
     * current Direction
     */
    public void turnRight();
    /**
     * This method takes the coordinates and direction that determines a position, and returns them
     * into a stream
     * 
     * @return Stream<? extends Object>
     */
    public Stream<? extends Object> stream();

    /**
     * Returns the current pointing Direction of this Position
     * @return Direction
     */
    public Direction getDirection();
    
    public void moveInDirection();
    
    public Coordinate getXAxis();
    public Coordinate getYAxis();

    public Coordinate getZAxis();
}
