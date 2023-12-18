package familyTree.Human_;

import java.util.Comparator;

public class HumanComparatorByName implements Comparator<Human>{

    public int compare(Human n1, Human n2){
        return n1.getName().compareTo(n2.getName());
    }
    
}
