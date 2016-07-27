package com.leandro.submarine.submarine;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.leandro.submarine.enums.CommandCatalog;

public class SubmarineNavigateInXYAxisTest extends SubmarineTest {

    @Test
    public void SubmarineNavigatesLeftMoveMoveRightMoveLeftLeftMoveRightMoveRightRightRightMoveMove() {
        createCommandList(CommandCatalog.TURN_LEFT_COMMAND.value,
                CommandCatalog.MOVE_COMMAND.value,
                CommandCatalog.MOVE_COMMAND.value,
                CommandCatalog.TURN_RIGHT_COMMAND.value,
                CommandCatalog.MOVE_COMMAND.value,
                CommandCatalog.TURN_LEFT_COMMAND.value,
                CommandCatalog.TURN_LEFT_COMMAND.value,
                CommandCatalog.MOVE_COMMAND.value,
                CommandCatalog.TURN_RIGHT_COMMAND.value,
                CommandCatalog.MOVE_COMMAND.value,
                CommandCatalog.TURN_RIGHT_COMMAND.value,
                CommandCatalog.TURN_RIGHT_COMMAND.value,
                CommandCatalog.TURN_RIGHT_COMMAND.value,
                CommandCatalog.MOVE_COMMAND.value,
                CommandCatalog.MOVE_COMMAND.value);
        submarine.receiveCommands(commandList);
        submarine.executeCommands();
        assertThat(submarine.getCurrentPosition()
                            .toString(),
                   is("-3 -2 0 SUL"));
    }

}
