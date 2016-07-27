package com.leandro.submarine.submarine;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.leandro.submarine.enums.CommandCatalog;

public class SubmarineNegativeMovementInXAxisTest extends SubmarineTest {

    @Test
    public void SubmarineReceivesTurnsRightCommandAndMovesXAxisOnce() {
        createCommandList(CommandCatalog.TURN_RIGHT_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value);
        submarine.receiveCommands(commandList);
        submarine.executeCommands();
        assertThat(submarine.getCurrentPosition()
                            .toString(),
                   is("1 0 0 LESTE"));
    }

    @Test
    public void SubmarineReceivesTurnsRightCommandAndMovesXAxisTwice() {
        createCommandList(CommandCatalog.TURN_RIGHT_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value);
        submarine.receiveCommands(commandList);
        submarine.executeCommands();
        assertThat(submarine.getCurrentPosition()
                            .toString(),
                   is("2 0 0 LESTE"));
    }

    @Test
    public void SubmarineReceivesTurnsRightCommandAndMovesXAxisThrice() {
        createCommandList(CommandCatalog.TURN_RIGHT_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value);
        submarine.receiveCommands(commandList);
        submarine.executeCommands();
        assertThat(submarine.getCurrentPosition()
                            .toString(),
                   is("3 0 0 LESTE"));
    }

    @Test
    public void SubmarineReceivesTurnsRightCommandAndMovesXAxisFourTimes() {
        createCommandList(CommandCatalog.TURN_RIGHT_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value);
        submarine.receiveCommands(commandList);
        submarine.executeCommands();
        assertThat(submarine.getCurrentPosition()
                            .toString(),
                   is("4 0 0 LESTE"));
    }
}
