package com.leandro.submarine.submarine;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.leandro.submarine.enums.CommandCatalog;


public class SubmarinePositiveMovementInYAxisTest extends SubmarineTest {

    @Test
    public void SubmarineReceivesMoveCommandsAndMovesYAxisOnce() {
        createCommandList(CommandCatalog.MOVE_COMMAND.value);
        submarine.receiveCommands(commandList);
        submarine.executeCommands();
        assertThat(submarine.getCurrentPosition()
                            .toString(),
                   is("0 1 0 NORTE"));
    }
    
    @Test
    public void SubmarineReceivesTwoMoveCommandsAndMovesYAxisTwice() {
        createCommandList(CommandCatalog.MOVE_COMMAND.value, CommandCatalog.MOVE_COMMAND.value);
        submarine.receiveCommands(commandList.toString());
        submarine.executeCommands();
        assertThat(submarine.getCurrentPosition()
                            .toString(),
                   is("0 2 0 NORTE"));
    }

    @Test
    public void SubmarineReceivesThreeMoveCommandsAndMovesYAxisThrice() {
        createCommandList(CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value);
        submarine.receiveCommands(commandList.toString());
        submarine.executeCommands();
        assertThat(submarine.getCurrentPosition()
                            .toString(),
                   is("0 3 0 NORTE"));
    }

    @Test
    public void SubmarineReceivesFourMoveCommandsAndMovesYAxisFourTimes() {
        createCommandList(CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value);
        submarine.receiveCommands(commandList.toString());
        submarine.executeCommands();
        assertThat(submarine.getCurrentPosition()
                            .toString(),
                   is("0 4 0 NORTE"));
    }

    @Test
    public void SubmarineTurnsSouthAndMovesYAxisOnce() {
        createCommandList(CommandCatalog.TURN_LEFT_COMMAND.value,
                          CommandCatalog.TURN_LEFT_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value);
        submarine.receiveCommands(commandList.toString());
        submarine.executeCommands();
        assertThat(submarine.getCurrentPosition()
                            .toString(),
                   is("0 -1 0 SUL"));
    }

    @Test
    public void SubmarineTurnsSouthAndMovesYAxisTwice() {
        createCommandList(CommandCatalog.TURN_LEFT_COMMAND.value,
                          CommandCatalog.TURN_LEFT_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value,
                          CommandCatalog.MOVE_COMMAND.value);
        submarine.receiveCommands(commandList.toString());
        submarine.executeCommands();
        assertThat(submarine.getCurrentPosition()
                            .toString(),
                   is("0 -2 0 SUL"));
    }

    @Test
    public void SubmarineTurnsSouthAndMovesYAxisTwiceThenTurnsNorthAndMovesOnce() {
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
    public void SubmarineTurnsSouthAndMovesYAxisTwiceThenTurnsNorthAndMovesTwice() {
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
}
