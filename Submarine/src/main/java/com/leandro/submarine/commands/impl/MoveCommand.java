package com.leandro.submarine.commands.impl;

import com.leandro.submarine.interfaces.MovementCommand;
import com.leandro.submarine.interfaces.Position;

public class MoveCommand implements MovementCommand {

    @Override
    public Position execute(Position p) {
        p.moveInDirection();
        return p;
    }

}
