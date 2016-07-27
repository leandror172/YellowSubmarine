package com.leandro.submarine.commands.impl;

import com.leandro.submarine.interfaces.MovementCommand;
import com.leandro.submarine.interfaces.Position;

public class DownCommand implements MovementCommand {

    @Override
    public Position execute(Position p) {
        p.goDown();
        return p;
    }
}
