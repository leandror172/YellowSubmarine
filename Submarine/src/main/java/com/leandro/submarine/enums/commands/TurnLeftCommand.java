package com.leandro.submarine.enums.commands;

import java.util.function.Consumer;

import com.leandro.submarine.interfaces.Command;
import com.leandro.submarine.interfaces.Position;

public enum TurnLeftCommand implements Command {

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
        p.turnLeft();
    };
}
