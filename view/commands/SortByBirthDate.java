package view.commands;

import view.ConsoleUI;

public class SortByBirthDate extends Command {

    public SortByBirthDate(ConsoleUI consoleUI) {
        super("Sort by birth date", consoleUI);
    }

    @Override
    public void execute() {
       getConsoleUI().sortByBirthDate();
    }
   
    
}
