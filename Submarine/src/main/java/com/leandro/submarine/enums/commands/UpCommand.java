package com.leandro.submarine.enums.commands;

import java.util.function.Consumer;

import com.leandro.submarine.interfaces.MovementCommand;
import com.leandro.submarine.interfaces.Position;

public enum UpCommand implements MovementCommand {
    
    INSTANCE;
    
    @Override
    public Consumer<Position> getCommandConsumer() {
        // TODO Auto-generated method stub
        return commandConsumer;
    }
    
    private Consumer<Position> commandConsumer = p -> {
        p.goUp();
    };
}
