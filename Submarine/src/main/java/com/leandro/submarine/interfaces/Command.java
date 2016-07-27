package com.leandro.submarine.interfaces;

/**
 * This interface represents a single command to be issued to the submarine
 * 
 * @author leandro.c.rocha
 *
 * @param <T>
 */
public interface Command {

    /**
     * This method executes the current command into a position, and returns the
     * changed position
     * 
     * @param position
     * @return Position
     */
    public Position execute(Position p);
}
