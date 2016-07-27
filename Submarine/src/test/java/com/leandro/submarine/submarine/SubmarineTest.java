package com.leandro.submarine.submarine;

import org.junit.Before;

import com.leandro.submarine.Submarine;

public abstract class SubmarineTest {

    protected static final String STARTING_POSITION = "0 0 0 NORTE";
    protected String commandList;
    protected Submarine submarine;

    public SubmarineTest() {
        super();
    }

    /**
     * This method initializes fields before each test
     * 
     * @throws Exception
     */
    @Before
    public void setUp() {
        commandList = new String();
        submarine = new Submarine();
    }

    /**
     * This method is used to receive an array of characters and create a string
     * containing all characters, to be used as commands
     * 
     * @param characters
     */
    protected void createCommandList(char... characters) {
        commandList = new String(characters);
    }
}