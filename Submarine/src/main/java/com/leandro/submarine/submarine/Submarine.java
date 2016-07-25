package com.leandro.submarine.submarine;

import java.util.ArrayList;
import java.util.List;

/**
 * Class used to describe the submarine
 * 
 * @author Leandro
 */
public class Submarine {

    private List<Character> moveOrders;
    private Position currentPosition;

    public Submarine() {
        moveOrders = new ArrayList<>();
        currentPosition = new Position();
    }

    /**
     * This method receives a list of orders to the submarine. Each order is a
     * single character command. Possible values are
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
        this.moveOrders = moveOrders;
    }

    /**
     * This method takes the current list of orders and then executes them,
     * changing the submarine's current position according to them
     */
    public void executeOrders() {
        // TODO Auto-generated method stub

    }

    /**
     * This method returns the submarine's current position
     * 
     * @return Position
     */
    public Position getCurrentPosition() {
        // TODO Auto-generated method stub
        return currentPosition;
    }

}
