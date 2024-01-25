package view.commands;

import view.ConsoleUI;

public class Save extends Command {

    public Save(String description, ConsoleUI consoleUI) {
        super("Save tree", consoleUI);
       
    }



    @Override
    public void execute() {
       getConsoleUI().save();
    }
   
    
}
