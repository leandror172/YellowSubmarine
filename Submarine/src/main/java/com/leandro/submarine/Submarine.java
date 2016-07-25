package com.leandro.submarine;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.leandro.submarine.interfaces.Command;

/**
 * Class used to describe the submarine
 * 
 * @author Leandro
 */
public class Submarine {

    private Position currentPosition;
    private List<Command> commandList;

    public Submarine() {
        currentPosition = new Position();
        commandList = new ArrayList<>();
    }

    /**
     * This method receives a list of commands to the submarine. Each command is a single character
     * command. Possible values are
     * <ul>
     * <li><b>'L'</b> - Turn Left</li>
     * <li><b>'R'</b> - Turn Right</li>
     * <li><b>'M'</b> - Move to current pointing direction</li>
     * <li><b>'U'</b> - Go Up</li>
     * <li><b>'D'</b> - Go Down</li>
     * </ul>
     * 
     * @param moveOrders
     */
    public void receiveOrders(List<Character> moveOrders) {
        // System.out.println("moveOrders: " + moveOrders);
        this.commandList = moveOrders.stream()
                                     .map(Command.characterToCommand)
                                     .collect(Collectors.<Command> toList());
    }

    /**
     * This method takes the current list of orders and then executes them, changing the submarine's
     * current position according to them
     */
    public void executeOrders() {
        // System.out.println("commandList: " + commandList);
        commandList.stream()
                   .forEach(c -> c.execute(currentPosition));
        System.out.println("currentPosition: " + currentPosition);
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
