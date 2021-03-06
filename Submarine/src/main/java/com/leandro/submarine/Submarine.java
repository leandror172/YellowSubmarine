package com.leandro.submarine;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.leandro.submarine.coordinates.SpatialPosition;
import com.leandro.submarine.enums.CommandCatalog;
import com.leandro.submarine.exception.InvalidCommandException;
import com.leandro.submarine.interfaces.Command;
import com.leandro.submarine.interfaces.CommandReader;
import com.leandro.submarine.interfaces.Position;

/**
 * Class used to describe the submarine
 * 
 * @author Leandro
 */
public class Submarine {

    private Position currentPosition;
    private List<Command> commandList;

    public Submarine() {
        currentPosition = new SpatialPosition();
        commandList = new ArrayList<>();
    }

    /**
     * This method receives a list of commands to the submarine, and converts them into Command
     * objects. Each command is a single character command. Possible values are
     * <ul>
     * <li><b>'L'</b> - Turn Left</li>
     * <li><b>'R'</b> - Turn Right</li>
     * <li><b>'M'</b> - Move to current pointing direction</li>
     * <li><b>'U'</b> - Go Up</li>
     * <li><b>'D'</b> - Go Down</li>
     * </ul>
     * 
     * @param commandList
     */
    public void receiveCommands(String commandList) {
        System.out.println("Received the list of commands: " + commandList);
        this.commandList = commandList.chars()
                                      .mapToObj(c -> (char) c)
                                      .map(c -> characterToCommand.apply(c))
                                      .collect(Collectors.<Command> toList());
    }

    /**
     * This Function maps an input Character to an output Command. If the character cannot be mapped
     * to a command, a runtime exception is thrown
     */
    private CommandReader<Character, Command> characterToCommand = c -> {
        Command command = null;
        try {
            command = CommandCatalog.getCommandForValue(c);
        } catch (InvalidCommandException e) {
            throw new RuntimeException(e);
        }
        return command;
    };

    /**
     * This method takes the current list of orders and then executes them, changing the submarine's
     * current position according to them
     */
    public void executeCommands() {
        commandList.stream()
                   .forEach(c -> c.getCommandConsumer().accept(currentPosition));
    }

    /**
     * This method returns the submarine's current position
     * 
     * @return Position
     */
    public Position getCurrentPosition() {
        return currentPosition;
    }
}
