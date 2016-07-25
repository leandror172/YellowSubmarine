package com.leandro.submarine.submarine;

public class Coordinate {

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
     * This method sets the value that defines this coordinate
     * 
     * @param value
     */
    public void setValue(Long value) {
        this.value = value;
    }

}
