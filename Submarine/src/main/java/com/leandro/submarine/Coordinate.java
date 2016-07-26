package com.leandro.submarine;

import com.leandro.submarine.interfaces.CoordinateInterface;

public class Coordinate implements CoordinateInterface {

    private Long value;

    public Coordinate() {
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
    public void subtractValue() {
        value--;
    }

    public String toString() {
        return String.valueOf(value);
    }

}
