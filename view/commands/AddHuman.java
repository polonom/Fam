package view.commands;

import view.ConsoleUI;

public class AddHuman extends Command {

    public AddHuman( ConsoleUI consoleUI) {
        super("Add human", consoleUI);
    }

    @Override
    public void execute() {
       getConsoleUI().addHuman();
    }
   
    
}
