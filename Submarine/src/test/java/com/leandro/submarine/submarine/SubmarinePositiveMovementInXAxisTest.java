package com.leandro.submarine.submarine;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.leandro.submarine.enums.CommandCatalog;

public class SubmarinePositiveMovementInXAxisTest extends SubmarineTest {

    @Test
    public void SubmarineReceivesTurnsLeftCommandAndMovesXAxisOnce() {
        createCommandList(CommandCatalog.TURN_LEFT_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value);
        submarine.receiveCommands(commandList);
        submarine.executeCommands();
        assertThat(submarine.getCurrentPosition()
                            .toString(),
                   is("-1 0 0 OESTE"));
    }

    @Test
    public void SubmarineReceivesTurnsLeftCommandAndMovesXAxisTwice() {
        createCommandList(CommandCatalog.TURN_LEFT_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value);
        submarine.receiveCommands(commandList);
        submarine.executeCommands();
        assertThat(submarine.getCurrentPosition()
                            .toString(),
                   is("-2 0 0 OESTE"));
    }

    @Test
    public void SubmarineReceivesTurnsLeftCommandAndMovesXAxisThrice() {
        createCommandList(CommandCatalog.TURN_LEFT_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value);
        submarine.receiveCommands(commandList);
        submarine.executeCommands();
        assertThat(submarine.getCurrentPosition()
                            .toString(),
                   is("-3 0 0 OESTE"));
    }

    @Test
    public void SubmarineReceivesTurnsLeftCommandAndMovesXAxisFourTimes() {
        createCommandList(CommandCatalog.TURN_LEFT_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value);
        submarine.receiveCommands(commandList);
        submarine.executeCommands();
        assertThat(submarine.getCurrentPosition()
                            .toString(),
                   is("-4 0 0 OESTE"));
    }
}
