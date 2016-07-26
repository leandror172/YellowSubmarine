package com.leandro.submarine.submarine;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;

import com.google.common.primitives.Chars;
import com.leandro.submarine.Submarine;

public class SubmarineTest {

    protected static final String STARTING_POSITION = "0 0 0 NORTE";
    protected String commandList;
    protected Submarine submarine;

    public SubmarineTest() {
        super();
    }

    @Before
    public void setUp() throws Exception {
        commandList = new String();
        submarine = new Submarine();
    }
    
    protected void createCommandList(char... characters){
        Arrays.asList(characters).stream().
        commandList = Chars.asList(characters).toString();
    }
}