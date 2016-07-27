package com.leandro.submarine.submarine;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import com.leandro.submarine.enums.CommandCatalog;

public class SubmarineMoveUpTest extends SubmarineTest {

    @Test
    public void SubmarineReceivesUpCommandAndMovesInZAxisOnce() {
        createCommandList(CommandCatalog.UP_COMMAND.value);
        submarine.receiveCommands(commandList);
        submarine.executeCommands();
        assertThat(submarine.getCurrentPosition()
                            .toString(),
                   is("0 0 1 NORTE"));
    }

    @Test
    public void SubmarineReceivesFiveUpCommandsAndMovesInZAxisFiveTimes() {
        createCommandList(CommandCatalog.UP_COMMAND.value,
                          CommandCatalog.UP_COMMAND.value,
                          CommandCatalog.UP_COMMAND.value,
                          CommandCatalog.UP_COMMAND.value,
                          CommandCatalog.UP_COMMAND.value);
        submarine.receiveCommands(commandList);
        submarine.executeCommands();
        assertThat(submarine.getCurrentPosition()
                            .toString(),
                   is("0 0 5 NORTE"));
    }
}
