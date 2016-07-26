package com.leandro.submarine.interfaces;

/**
 * This interface represents a processor that maps a Character to a Command
 * 
 * @author leandro.c.rocha
 *
 * @param <T>
 * @param <R>
 */
@FunctionalInterface
public interface CommandReader<T, R> {

    /**
     * This Function maps an input Character to an output Command. If the character cannot be mapped
     * to a command, a runtime exception is thrown
     */
    public Command apply(Character c);
}
