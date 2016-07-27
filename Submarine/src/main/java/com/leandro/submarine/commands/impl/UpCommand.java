package com.leandro.submarine.commands.impl;

import com.leandro.submarine.interfaces.MovementCommand;
import com.leandro.submarine.interfaces.Position;

public class UpCommand implements MovementCommand {

    @Override
    public Position execute(Position p) {
        p.goUp();
        return p;
    }
}
