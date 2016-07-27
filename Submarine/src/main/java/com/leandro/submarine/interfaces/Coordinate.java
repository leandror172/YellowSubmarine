package com.leandro.submarine.interfaces;

public interface Coordinate {
    /**
     * This method increments the value that represents this coordinate,
     * indicating a movement towards the positive side of this axis
     */
    public void incrementValue();

    /**
     * This method decreases the value that represents this coordinate,
     * indicating a movement towards the negative side of this axis
     */
    public void decrementValue();


    public String toString();
}
