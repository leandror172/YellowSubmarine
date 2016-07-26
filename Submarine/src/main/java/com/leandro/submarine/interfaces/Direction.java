package com.leandro.submarine.interfaces;

public interface Direction {

    /**
     * This method returns the value that describers this direction
     * 
     * @return String
     */
    public String getValue();

    /**
     * This method returns the direction that corresponds to the right direction of this class
     * 
     * @return T extends Direction
     */
    public <T extends Direction> T turnRightDirection();

    /**
     * This method returns the direction that corresponds to the left direction of this class
     * 
     * @return T extends Direction
     */
    public <T extends Direction> T  turnLeftDirection();

    // public void getAxis();

}
