package com.leandro.submarine.submarine;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

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
        submarine.receiveCommands(commandList.toString());
        submarine.executeCommands();
        assertThat(STARTING_POSITION, is(submarine.getCurrentPosition().toString()));
    }

    @Test(expected = InvalidCommandException.class)
    public void SubmarineReceivesInvalidCommandExecutesNoMovement() throws Throwable {
        commandList.add('A');
        try {
            submarine.receiveCommands(commandList.toString());
        } catch (Exception e) {
            throw e.getCause();
        }
    }

    @Test
    public void SubmarineReceivesTurnRightCommandAndFacesEast() {
        commandList.add(CommandCatalog.TURN_RIGHT_COMMAND.value);
        submarine.receiveCommands(commandList.toString());
        submarine.executeCommands();
        assertThat("0 0 0 LESTE", is(submarine.getCurrentPosition().toString()));
    }

    @Test
    public void SubmarineReceivesTurnLeftCommandAndFacesWest() {
        commandList.add(CommandCatalog.TURN_LEFT_COMMAND.value);
        submarine.receiveCommands(commandList.toString());
        submarine.executeCommands();
        assertThat("0 0 0 OESTE", is(submarine.getCurrentPosition().toString()));
    }

    @Test
    public void SubmarineReceivesTwoTurnLeftCommandsAndFacesSouth() {
        commandList = Arrays.asList(CommandCatalog.TURN_LEFT_COMMAND.value, CommandCatalog.TURN_LEFT_COMMAND.value);
        submarine.receiveCommands(commandList.toString());
        submarine.executeCommands();
        assertThat("0 0 0 SUL", is(submarine.getCurrentPosition().toString()));
    }

    @Test
    public void SubmarineReceivesTwoTurnRightCommandsAndFacesSouth() {
        commandList = Arrays.asList(CommandCatalog.TURN_RIGHT_COMMAND.value, CommandCatalog.TURN_RIGHT_COMMAND.value);
        submarine.receiveCommands(commandList.toString());
        submarine.executeCommands();
        assertThat("0 0 0 SUL", is(submarine.getCurrentPosition().toString()));
    }

    @Test
    public void SubmarineReceivesTurnRightTurnLeftCommandsAndFacesNorth() {
        commandList = Arrays.asList(CommandCatalog.TURN_RIGHT_COMMAND.value, CommandCatalog.TURN_LEFT_COMMAND.value);
        submarine.receiveCommands(commandList.toString());
        submarine.executeCommands();
        assertThat("0 0 0 NORTE", is(submarine.getCurrentPosition().toString()));
    }

    @Test
    public void SubmarineReceivesFourTurnRightCommandsAndFacesNorth() {
        commandList = Arrays.asList(CommandCatalog.TURN_RIGHT_COMMAND.value,
                                    CommandCatalog.TURN_RIGHT_COMMAND.value,
                                    CommandCatalog.TURN_RIGHT_COMMAND.value,
                                    CommandCatalog.TURN_RIGHT_COMMAND.value);
        submarine.receiveCommands(commandList.toString());
        submarine.executeCommands();
        assertThat("0 0 0 NORTE", is(submarine.getCurrentPosition().toString()));
    }
}
