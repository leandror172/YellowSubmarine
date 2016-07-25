package com.leandro.submarine.interfaces;

import java.util.function.Function;

import com.leandro.submarine.Position;
import com.leandro.submarine.enums.CommandCatalog;
import com.leandro.submarine.exception.InvalidCommandException;

public interface Command {

    /**
     * This method returns the character corresponding to this command. Possible values are
     * <ul>
     * <li><b>'L'</b> - Turn Left</li>
     * <li><b>'R'</b> - Turn Right</li>
     * <li><b>'M'</b> - Move to current pointing direction</li>
     * <li><b>'U'</b> - Go Up</li>
     * <li><b>'D'</b> - Go Down</li>
     * </ul>
     * 
     * @return Character
     */
//    public Character getValue();

    /**
     * This method executes the current command into a position, and returns the changed position
     * 
     * @param position
     * @return Position
     */
    public Position execute(Position position);

    /**
     * This Function maps an input Character to an output Command. If the character cannot be mapped
     * to a command, a runtime exception is thrown
     */
    Function<Character, Command> characterToCommand = new Function<Character, Command>() {

        public Command apply(Character c) {
            Command command = null;
            try {
                command = CommandCatalog.getCommandForValue(c);
            } catch (InvalidCommandException e) {
                throw new RuntimeException(e);
            }
            return command;
        }
    };

}
