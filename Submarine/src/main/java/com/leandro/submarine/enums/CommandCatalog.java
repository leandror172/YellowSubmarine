package com.leandro.submarine.enums;

import java.util.LinkedHashMap;
import java.util.Map;

import com.leandro.submarine.enums.commands.DownCommand;
import com.leandro.submarine.enums.commands.MoveCommand;
import com.leandro.submarine.enums.commands.TurnLeftCommand;
import com.leandro.submarine.enums.commands.TurnRightCommand;
import com.leandro.submarine.enums.commands.UpCommand;
import com.leandro.submarine.exception.InvalidCommandException;
import com.leandro.submarine.interfaces.Command;

public enum CommandCatalog {

    TURN_RIGHT_COMMAND('R', TurnRightCommand.INSTANCE),
    TURN_LEFT_COMMAND('L', TurnLeftCommand.INSTANCE),
    MOVE_COMMAND('M', MoveCommand.INSTANCE),
    UP_COMMAND('U', UpCommand.INSTANCE), 
    DOWN_COMMAND('D', DownCommand.INSTANCE);

    public Character value;
    public Command commandClass;

    private final static Map<Character, Command> commandCatalogMAP = new LinkedHashMap<>();

    static {
        for (final CommandCatalog padrao : CommandCatalog.values()) {
            commandCatalogMAP.put(padrao.value, padrao.commandClass);
        }
    }

    CommandCatalog(char value, Command command) {
        this.value = value;
        this.commandClass = command;
    }

    /**
     * This method receives a single character and returns the equivalent Command object
     * 
     * @param value
     * @return Command
     * @throws InvalidCommandException 
     */
    public static Command getCommandForValue(Character value) throws InvalidCommandException {
        Command command = commandCatalogMAP.get(value);
        if (command == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unrecognized command <");
            sb.append(String.valueOf(value));
            sb.append(">");
            throw new InvalidCommandException(sb.toString());
        }
        return command;
    }

}
