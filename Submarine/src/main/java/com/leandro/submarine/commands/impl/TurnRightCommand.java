package com.leandro.submarine.commands.impl;

import com.leandro.submarine.interfaces.Command;
import com.leandro.submarine.interfaces.Position;

public class TurnRightCommand implements Command {

    @Override
    public Position execute(Position p) {
        p.turnRight();
        return p;
    }
}
