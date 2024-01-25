import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

import javax.swing.text.View;

import model.familyTree.Human_.Gender;
import model.familyTree.Human_.Human;
import model.familyTree.tree.FamilyTree;
import model.writer.FileHandlere;
import view.ConsoleUI;


public class Main {
    public static void main(String[] args){

        ConsoleUI view= new ConsoleUI();
        view.start();

        FamilyTree tree = testTree();
        System.out.println(tree);

        save(tree);
    
    }
    static FamilyTree testTree(){
        FamilyTree tree = new FamilyTree();
    
        Human lina = new Human("Лина", Gender.Female, LocalDate.of(2000, 11, 9));
        return tree;
    }

    public static FamilyTree load(){
        String filePath = "/Users/polinakivokurtseva/Git/Fam/write /write";
        FileHandlere fileHandler = new FileHandlere();
        return (FamilyTree) fileHandler.read(filePath);
    }

    public static void save(FamilyTree tree){
        String filePath = "/Users/polinakivokurtseva/Git/Fam/write /write";
        FileHandlere fileHandler = new FileHandlere();
        fileHandler.save(tree, filePath);
    }
}


