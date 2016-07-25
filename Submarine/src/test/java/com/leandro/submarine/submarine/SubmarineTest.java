/**
 * 
 */
package com.leandro.submarine.submarine;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
	submarine.receiveOrders(moveOrders);
	submarine.executeOrders();
	assertEquals(STARTING_POSITION, submarine.getCurrentPosition().toString());
    }

}
