package com.leandro.submarine.submarine;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.junit.Test;

import com.leandro.submarine.enums.CommandCatalog;


public class SubmarineMovementInYAxisTest extends SubmarineTest {

    @Test
    public void SubmarineReceivesMoveCommandsAndMovesYAxisOnce() {
        createCommandList(CommandCatalog.MOVE_COMMAND.value);
        submarine.receiveCommands(commandList);
        submarine.executeCommands();
        assertThat("0 1 0 NORTE", is(submarine.getCurrentPosition().toString()));
    }
    
    @Test
    public void SubmarineReceivesTwoMoveCommandssAndMovesYAxisTwice() {
        createCommandList(CommandCatalog.MOVE_COMMAND.value, CommandCatalog.MOVE_COMMAND.value);
        submarine.receiveCommands(commandList.toString());
        submarine.executeCommands();
        assertThat("0 2 0 NORTE", is(submarine.getCurrentPosition().toString()));
    }
}
