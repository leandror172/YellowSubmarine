package com.leandro.submarine.commands.impl;

import com.leandro.submarine.Position;
import com.leandro.submarine.interfaces.Command;

public class TurnRightCommand implements Command<Position> {

    @Override
    public Position execute(Position position) {
        position.setDirection(position.getDirection()
                                      .turnRightDirection());
        return position;
    }

}
