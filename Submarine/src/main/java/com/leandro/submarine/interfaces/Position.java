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
    
    /**
     * This method moves a position in it's current facing Direction
     */
    public void moveInDirection();
    
    /**
     * This method returns a Coordinate representing the X axis
     * 
     * @return Coordinate
     */
    public Coordinate getXAxis();

    /**
     * This method returns a Coordinate representing the X axis
     * 
     * @return Coordinate
     */
    public Coordinate getYAxis();

    /**
     * This method returns a Coordinate representing the X axis
     * 
     * @return Coordinate
     */
    public Coordinate getZAxis();

    /**
     * This method executes a positive movement in the Z Axis
     */
    public void goUp();

    /**
     * This method executes a negative movement in the Z Axis
     */
    public void goDown();
}
