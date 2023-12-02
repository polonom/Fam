import java.time.LocalDate;

import Human.Gender;

public class Main {
    public static void main(String[] args){
        FamilyTree tree = testTree();
        System.out.println(tree);
    
    }
    static FamilyTree testTree(){
        FamilyTree tree = new FamilyTree();
    
        Human lina = new Human("Лина", Gender.Female, LocalDate.of(2000, 11, 9));
        return tree;
    }
}

