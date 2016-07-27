package com.leandro.submarine.submarine;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.leandro.submarine.enums.CommandCatalog;

public class SubmarineNavigateInXAxisTest extends SubmarineTest {

    @Test
    public void SubmarineNavigatesLeftMoveMoveMoveLeftLeftMoveRightRightMoveMoveLeftLeftMoveMove() {
        createCommandList(CommandCatalog.TURN_LEFT_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.TURN_LEFT_COMMAND.value,
                          CommandCatalog.TURN_LEFT_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.TURN_RIGHT_COMMAND.value,
                          CommandCatalog.TURN_RIGHT_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.TURN_LEFT_COMMAND.value,
                          CommandCatalog.TURN_LEFT_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value);
        submarine.receiveCommands(commandList.toString());
        submarine.executeCommands();
        assertThat(submarine.getCurrentPosition()
                            .toString(),
                   is("-2 0 0 LESTE"));
    }

    @Test
    public void SubmarineNavigatesLeftMoveMoveMoveMoveMoveLeftLeftMoveRightRightMoveMoveRightRight() {
        createCommandList(CommandCatalog.TURN_LEFT_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.TURN_LEFT_COMMAND.value,
                          CommandCatalog.TURN_LEFT_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.TURN_RIGHT_COMMAND.value,
                          CommandCatalog.TURN_RIGHT_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.TURN_RIGHT_COMMAND.value,
                          CommandCatalog.TURN_RIGHT_COMMAND.value);
        submarine.receiveCommands(commandList.toString());
        submarine.executeCommands();
        assertThat(submarine.getCurrentPosition()
                            .toString(),
                   is("-6 0 0 LESTE"));
    }

}
