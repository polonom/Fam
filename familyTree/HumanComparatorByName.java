package familyTree;

import java.util.Comparator;

import familyTree.Human_.Human;

public class HumanComparatorByName implements Comparator<Human>{

    public int compare(Human n1, Human n2){
        return n1.getName().compareTo(n2.getName());
    }
    
}
