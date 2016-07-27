package com.leandro.submarine.submarine;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.leandro.submarine.enums.CommandCatalog;

public class SubmarineNavigateInYAxisTest extends SubmarineTest {

    @Test
    public void SubmarineNavigatesLeftLeftMoveMoveLeftLeftMove() {
        createCommandList(CommandCatalog.TURN_LEFT_COMMAND.value,
                          CommandCatalog.TURN_LEFT_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.TURN_LEFT_COMMAND.value,
                          CommandCatalog.TURN_LEFT_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value);
        submarine.receiveCommands(commandList.toString());
        submarine.executeCommands();
        assertThat(submarine.getCurrentPosition()
                            .toString(),
                   is("0 -1 0 NORTE"));
    }

    @Test
    public void SubmarineNavigatesLeftLeftMoveMoveLeftLeftMoveMove() {
        createCommandList(CommandCatalog.TURN_LEFT_COMMAND.value,
                          CommandCatalog.TURN_LEFT_COMMAND.value,
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
                   is("0 0 0 NORTE"));
    }

    @Test
    public void SubmarineNavigatesMoveLeftLeftMoveMoveRightRightMoveMoveMoveRightRight() {
        createCommandList(CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.TURN_LEFT_COMMAND.value,
                          CommandCatalog.TURN_LEFT_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.TURN_RIGHT_COMMAND.value,
                          CommandCatalog.TURN_RIGHT_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.TURN_RIGHT_COMMAND.value,
                          CommandCatalog.TURN_RIGHT_COMMAND.value);
        submarine.receiveCommands(commandList.toString());
        submarine.executeCommands();
        assertThat(submarine.getCurrentPosition()
                            .toString(),
                   is("0 2 0 SUL"));
    }
}
