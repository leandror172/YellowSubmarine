package com.leandro.submarine.submarine;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import com.leandro.submarine.enums.CommandCatalog;

public class SubmarineBuscapeTest extends SubmarineTest {

    /**
     * This test covers the input exemplified by Buscapé: "RMMLMMMDDLL"
     */
    @Test
    public void SubmarineReceivesBuscapeExampleCommands() {
        submarine.receiveCommands("RMMLMMMDDLL");
        submarine.executeCommands();
        assertThat(submarine.getCurrentPosition()
                            .toString(),
                   is("2 3 -2 SUL"));
    }
    
    /**
     * This test covers the input requested by Buscapé: "LMRDDMMUU"
     */
    @Test
    public void SubmarineReceivesBuscapeTestCommand() {
        submarine.receiveCommands("LMRDDMMUU");
        submarine.executeCommands();
        assertThat(submarine.getCurrentPosition()
                            .toString(),
                   is("-1 2 0 NORTE"));
    }
}
