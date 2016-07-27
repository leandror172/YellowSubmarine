package com.leandro.submarine.submarine;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import com.leandro.submarine.enums.CommandCatalog;

public class SubmarineMoveDownTest extends SubmarineTest {

    @Test
    public void SubmarineReceivesUpCommandAndMovesInZAxisOnce() {
        createCommandList(CommandCatalog.DOWN_COMMAND.value);
        submarine.receiveCommands(commandList);
        submarine.executeCommands();
        assertThat(submarine.getCurrentPosition()
                            .toString(),
                   is("0 0 -1 NORTE"));
    }

    @Test
    public void SubmarineReceivesFiveUpCommandsAndMovesInZAxisFiveTimes() {
        createCommandList(CommandCatalog.DOWN_COMMAND.value,
                          CommandCatalog.DOWN_COMMAND.value,
                          CommandCatalog.DOWN_COMMAND.value,
                          CommandCatalog.DOWN_COMMAND.value,
                          CommandCatalog.DOWN_COMMAND.value);
        submarine.receiveCommands(commandList);
        submarine.executeCommands();
        assertThat(submarine.getCurrentPosition()
                            .toString(),
                   is("0 0 -5 NORTE"));
    }
}
