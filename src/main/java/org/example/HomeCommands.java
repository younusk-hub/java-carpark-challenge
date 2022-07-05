package org.example;

public class HomeCommands extends Commands{
    public HomeCommands() {
        super("Home", new String[]{"Park Vehicle", "Remove Vehicle","Car Park Stats", "Quit" }, "home");
    }

    @Override
    public void run() {
        printGreeting();
        printCommands();

        int userInput = getIntegerInput();

        if (userInput == 1) {
            setNextCommands("park");
        } else if (userInput == 2) {
            setNextCommands("");
        } else if (userInput == 3) {
            setNextCommands("stats");
        } else {
            setNextCommands("");
        }
    }



}
