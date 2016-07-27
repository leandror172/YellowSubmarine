package com.leandro.submarine.enums.commands;

import java.util.function.Consumer;

import com.leandro.submarine.interfaces.MovementCommand;
import com.leandro.submarine.interfaces.Position;

public enum MoveCommand implements MovementCommand {

    INSTANCE;

    @Override
    public Consumer<Position> getCommandConsumer() {
        return commandConsumer;
    }

    /**
     * This Consumer takes the input Position and executes the method that corresponds to this
     * Command
     */
    private Consumer<Position> commandConsumer = p -> {
        p.moveInDirection();
    };
}
