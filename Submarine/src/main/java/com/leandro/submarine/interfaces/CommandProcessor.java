package com.leandro.submarine.interfaces;

@FunctionalInterface
public interface CommandProcessor<T, R> {

    /**
     * This Function maps an input Character to an output Command. If the
     * character cannot be mapped to a command, a runtime exception is thrown
     */
    public Command apply(Character c);
}
