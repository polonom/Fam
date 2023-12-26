package view.commands;

import view.ConsoleUI;

public class GetHumanListInfo extends Command{

    public GetHumanListInfo(ConsoleUI consoleUI) {
        super("get info", consoleUI);
    }

    @Override
    public void execute() {
       getConsoleUI().getHumanList();
    }
   
    
}
