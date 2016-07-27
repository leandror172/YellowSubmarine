package com.leandro.submarine.interfaces;

import java.util.function.Consumer;

/**
 * This interface represents a single command to be issued to the submarine
 * 
 * @author leandro.c.rocha
 *
 * @param <T>
 */
public interface Command {

    /**
     * This method returns a Consumer of Position. This consumer must implement a lambda that takes
     * Position and call the equivalent method in it
     * 
     * @return Consumer<Position>
     */
    public Consumer<Position> getCommandConsumer();
}
