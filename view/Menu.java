package view;

import java.util.ArrayList;
import java.util.List;

import view.commands.AddChildren;
import view.commands.AddHuman;
import view.commands.AddParents;
import view.commands.Command;
import view.commands.GetHumanListInfo;
import view.commands.SortByBirthDate;
import view.commands.SortByName;

public class Menu {

    private List<Command> commands;
    

    public Menu(ConsoleUI consoleUI){
        commands = new ArrayList<>();
        commands.add(new AddHuman(consoleUI));
        commands.add(new SortByBirthDate(consoleUI));
        commands.add(new SortByName(consoleUI));
        commands.add(new GetHumanListInfo(consoleUI));
        commands.add(new AddParents(consoleUI));
        commands.add(new AddChildren(consoleUI));
        
    }

    public String menu1(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < commands.size(); i++) {
            stringBuilder.append(i + 1);
            stringBuilder.append(". ");
            stringBuilder.append(commands.get(i).getDescription());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void execute(String choice){
        commands.get(Integer.parseInt(choice) - 1).execute();
    }
}
