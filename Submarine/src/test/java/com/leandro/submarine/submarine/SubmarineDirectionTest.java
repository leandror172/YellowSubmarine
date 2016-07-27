package com.leandro.submarine.submarine;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.leandro.submarine.enums.CommandCatalog;
import com.leandro.submarine.exception.InvalidCommandException;

/**
 * @author Leandro
 *
 */
public class SubmarineDirectionTest extends SubmarineTest {

    @Test
    public void SubmarineReceivesNoCommandExecutesNoMovement() {
        submarine.receiveCommands(commandList);
        submarine.executeCommands();
        assertThat(STARTING_POSITION, is(submarine.getCurrentPosition()
                                                  .toString()));
    }

    @Test(expected = InvalidCommandException.class)
    public void SubmarineReceivesInvalidCommandExecutesNoMovement() throws Throwable {
        createCommandList('A');
        try {
            submarine.receiveCommands(commandList);
        } catch (Exception e) {
            throw e.getCause();
        }
    }

    @Test
    public void SubmarineReceivesTurnRightCommandAndFacesEast() {
        createCommandList(CommandCatalog.TURN_RIGHT_COMMAND.value);
        submarine.receiveCommands(commandList);
        submarine.executeCommands();
        assertThat("0 0 0 LESTE", is(submarine.getCurrentPosition()
                                              .toString()));
    }

    @Test
    public void SubmarineReceivesTurnLeftCommandAndFacesWest() {
        createCommandList(CommandCatalog.TURN_LEFT_COMMAND.value);
        submarine.receiveCommands(commandList);
        submarine.executeCommands();
        assertThat("0 0 0 OESTE", is(submarine.getCurrentPosition()
                                              .toString()));
    }

    @Test
    public void SubmarineReceivesTwoTurnLeftCommandsAndFacesSouth() {
        createCommandList(CommandCatalog.TURN_LEFT_COMMAND.value,
                          CommandCatalog.TURN_LEFT_COMMAND.value);
        submarine.receiveCommands(commandList);
        submarine.executeCommands();
        assertThat("0 0 0 SUL", is(submarine.getCurrentPosition()
                                            .toString()));
    }

    @Test
    public void SubmarineReceivesTwoTurnRightCommandsAndFacesSouth() {
        createCommandList(CommandCatalog.TURN_RIGHT_COMMAND.value,
                          CommandCatalog.TURN_RIGHT_COMMAND.value);
        submarine.receiveCommands(commandList);
        submarine.executeCommands();
        assertThat("0 0 0 SUL", is(submarine.getCurrentPosition()
                                            .toString()));
    }

    @Test
    public void SubmarineReceivesTurnRightTurnLeftCommandsAndFacesNorth() {
        createCommandList(CommandCatalog.TURN_RIGHT_COMMAND.value,
                          CommandCatalog.TURN_LEFT_COMMAND.value);
        submarine.receiveCommands(commandList);
        submarine.executeCommands();
        assertThat("0 0 0 NORTE", is(submarine.getCurrentPosition()
                                              .toString()));
    }

    @Test
    public void SubmarineReceivesFourTurnRightCommandsAndFacesNorth() {
        createCommandList(CommandCatalog.TURN_RIGHT_COMMAND.value,
                          CommandCatalog.TURN_RIGHT_COMMAND.value,
                          CommandCatalog.TURN_RIGHT_COMMAND.value,
                          CommandCatalog.TURN_RIGHT_COMMAND.value);
        submarine.receiveCommands(commandList);
        submarine.executeCommands();
        assertThat("0 0 0 NORTE", is(submarine.getCurrentPosition()
                                              .toString()));
    }
}
