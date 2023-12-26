package view.commands;

import view.ConsoleUI;

public class AddParents extends Command {

    public AddParents( ConsoleUI consoleUI) {
        super("Add parent", consoleUI);
    }

    @Override
    public void execute() {
       getConsoleUI().addParent1();
    }
   
    
}