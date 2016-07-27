package com.leandro.submarine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.google.common.base.Strings;

public class SubmarineConsole {

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to the submarine command terminal.");
        Submarine sub = new Submarine();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The submarine's current position is (" + sub.getCurrentPosition() + ")");
        System.out.println("Type 1 for the 'advanced' console, otherwise, a simpler version will be used");
        String input = in.readLine();
        if (!Strings.isNullOrEmpty(input) && (input.charAt(0) == '1')) {
            advancedConsole(sub, in);
        } else {
            simpleConsole(sub, in);
        }
        System.out.println("The submarine's final position is (" + sub.getCurrentPosition() + ")");
    }

    private static void simpleConsole(Submarine sub, BufferedReader in) throws IOException {
        System.out.println("Please enter the list of commands: ");
        String input = in.readLine();
        try {
            sub.receiveCommands(input);
            sub.executeCommands();
        } catch (RuntimeException e) {
            System.out.println("There was a problem processing your commands: " + e.getCause().getMessage());
        }
        System.out.println(sub.getCurrentPosition());
    }

    /**
     * This method treats console input to the submarine
     * 
     * @param sub
     * @param in
     * @throws IOException
     */
    private static void advancedConsole(Submarine sub, BufferedReader in) throws IOException {
        System.out.println("Please enter the list of commands: ");
        String input = in.readLine();
        try {
            sub.receiveCommands(input);
            sub.executeCommands();
            System.out.println("Executing commands...");
            System.out.println("The submarine's current position is (" + sub.getCurrentPosition() + ")");
        } catch (RuntimeException e) {
            System.out.println("There was a problem processing your commands: " + e.getCause().getMessage());
            System.out.println("Your submarine has been eaten by a grue.");
            System.out.println("Delivering a new submarine...");
            sub = new Submarine();
        }
        System.out.println("Do you wish to execute more commands? (Y to execute, anything else to quit)");
        input = in.readLine();

        if (!Strings.isNullOrEmpty(input) && (input.charAt(0) == 'Y' || input.charAt(0) == 'y')) {
            advancedConsole(sub, in);
        }
    }
}
