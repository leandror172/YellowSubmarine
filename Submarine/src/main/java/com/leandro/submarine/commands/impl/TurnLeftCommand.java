package com.leandro.submarine.commands.impl;

import com.leandro.submarine.interfaces.Command;
import com.leandro.submarine.interfaces.Position;

public class TurnLeftCommand implements Command {

    @Override
    public Position execute(Position p) {
        p.turnLeft();
        return p;
    }
}
