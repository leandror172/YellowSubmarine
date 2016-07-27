package com.leandro.submarine.enums;

import java.util.LinkedHashMap;
import java.util.Map;

import com.leandro.submarine.commands.impl.DownCommand;
import com.leandro.submarine.commands.impl.MoveCommand;
import com.leandro.submarine.commands.impl.TurnLeftCommand;
import com.leandro.submarine.commands.impl.TurnRightCommand;
import com.leandro.submarine.commands.impl.UpCommand;
import com.leandro.submarine.exception.InvalidCommandException;
import com.leandro.submarine.interfaces.Command;

public enum CommandCatalog {

    TURN_RIGHT_COMMAND('R', new TurnRightCommand()),
    TURN_LEFT_COMMAND('L', new TurnLeftCommand()),
    MOVE_COMMAND('M', new MoveCommand()),
    UP_COMMAND('U', new UpCommand()), 
    DOWN_COMMAND('D', new DownCommand());

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
