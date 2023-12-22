package view.commands;

import view.ConsoleUI;

public class AddChildren extends Command {

    public AddChildren(String description, ConsoleUI consoleUI) {
        super("Add child", consoleUI);
    }


    @Override
    public void execute() {
       getConsoleUI().addChild1();
    }
   
    
}
