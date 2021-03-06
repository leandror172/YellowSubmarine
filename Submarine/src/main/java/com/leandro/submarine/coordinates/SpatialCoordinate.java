package com.leandro.submarine.coordinates;

import com.leandro.submarine.interfaces.Coordinate;

public class SpatialCoordinate implements Coordinate {

    private Long value;

    public SpatialCoordinate() {
        value = 0L;
    }

    /**
     * This method returns the value that defines this coordinate
     * 
     * @return Long
     */
    public Long getValue() {
        return value;
    }

    /**
     * This method increments the value that represents this coordinate,
     * indicating a movement towards the positive side of this axis
     */
    public void incrementValue() {
        value++;
    }

    /**
     * This method decreases the value that represents this coordinate,
     * indicating a movement towards the negative side of this axis
     */
    public void decrementValue() {
        value--;
    }

    public String toString() {
        return String.valueOf(value);
    }

}
