package org.example;

import java.util.Scanner;

public abstract class Commands {
    private final String name;
    private final String[] commands;
    private final Scanner scanner;
    private String nextCommands;

    public Commands(String name, String[] commands, String nextCommands) {
        this.name = name;
        this.commands = commands;
        this.scanner = new Scanner(System.in);
        this.nextCommands = nextCommands;
    }

    abstract public void run();

    public String[] getCommands() {
        return commands;
    }

    public String getNextCommands() {
        return nextCommands;
    }

    public void setNextCommands(String nextCommands) {
        this.nextCommands = nextCommands;
    }

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printGreeting(){
        printMessage("Welcome to the " + name + " commands.");
    }

    public void printCommands(String[] commandsArr){
        for (int i = 0; i < commandsArr.length; i++) {
            printMessage((i + 1) + " : " + commandsArr[i]);
        }
    }

    public void printCommands(){
        printCommands(commands);
    }

    public int getIntegerInput(int rangeLimit){
        int input = 0;
        boolean isActive = true;

        while(isActive){
            printMessage("Enter a number between 1 - " + rangeLimit);
            int userInput = scanner.nextInt();
            if (userInput > 0 && userInput <= rangeLimit) {
                isActive = false;
                input = userInput;
            } else {
                printMessage("invalid input, try again");
            }
        }
        scanner.nextLine();

        return input;
    }

    public int getIntegerInput(){
        return getIntegerInput(commands.length);
    }

}
