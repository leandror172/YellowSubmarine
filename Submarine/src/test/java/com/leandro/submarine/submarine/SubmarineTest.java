/**
 * 
 */
package com.leandro.submarine.submarine;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.leandro.submarine.Submarine;
import com.leandro.submarine.exception.InvalidCommandException;

/**
 * @author Leandro
 *
 */
public class SubmarineTest {

    private static final String STARTING_POSITION = "0 0 0 NORTE";
    private List<Character> moveOrders;
    private Submarine submarine;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        moveOrders = new ArrayList<>();
        submarine = new Submarine();
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void SubmarineReceivesNoOrderExecutesNoMovement() {
        submarine.receiveCommands(moveOrders);
        submarine.executeOrders();
        assertEquals(STARTING_POSITION, submarine.getCurrentPosition().toString());
    }

    @Test(expected = InvalidCommandException.class)
    public void SubmarineReceivesInvalidOrderExecutesNoMovement() throws Throwable {
        moveOrders.add('A');
        try {
            submarine.receiveCommands(moveOrders);
        } catch (Exception e) {
            throw e.getCause();
        }
    }
    
    @Test
    public void SubmarineReceivesTurnRightOrderAndFacesEast() {
        moveOrders.add('R');
        submarine.receiveCommands(moveOrders);
        submarine.executeOrders();
        assertEquals("0 0 0 LESTE", submarine.getCurrentPosition().toString());
    }
    
    @Test
    public void SubmarineReceivesTurnLeftOrderAndFacesWest() {
        moveOrders.add('L');
        submarine.receiveCommands(moveOrders);
        submarine.executeOrders();
        assertEquals("0 0 0 OESTE", submarine.getCurrentPosition().toString());
    }

    @Test
    public void SubmarineReceivesTurnLeftTurnLeftOrdersAndFacesSouth() {
        moveOrders = Arrays.asList('L', 'L');
        submarine.receiveCommands(moveOrders);
        submarine.executeOrders();
        assertEquals("0 0 0 SUL", submarine.getCurrentPosition().toString());
    }

    @Test
    public void SubmarineReceivesTurnRightTurnRightOrdersAndFacesSouth() {
        moveOrders = Arrays.asList('R', 'R');
        submarine.receiveCommands(moveOrders);
        submarine.executeOrders();
        assertEquals("0 0 0 SUL", submarine.getCurrentPosition().toString());
    }

    @Test
    public void SubmarineReceivesTurnRightTurnLeftOrdersAndFacesNorth() {
        moveOrders = Arrays.asList('R', 'L');
        submarine.receiveCommands(moveOrders);
        submarine.executeOrders();
        assertEquals("0 0 0 NORTE", submarine.getCurrentPosition().toString());
    }

    @Test
    public void SubmarineReceivesTurnRightTurnRightTurnRightTurnRightOrdersAndFacesNorth() {
        moveOrders = Arrays.asList('R', 'R', 'R', 'R');
        submarine.receiveCommands(moveOrders);
        submarine.executeOrders();
        assertEquals("0 0 0 NORTE", submarine.getCurrentPosition().toString());
    }
    
    @Test
    public void SubmarineReceivesMoveOrderAndMovesXAxis() {
        moveOrders.add('M');
        submarine.receiveCommands(moveOrders);
        submarine.executeOrders();
        assertEquals("0 1 0 NORTE", submarine.getCurrentPosition()
                                             .toString());
    }
}
