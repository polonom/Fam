package familyTree;

import java.util.Comparator;

import familyTree.Human_.Human;

public class HumanComparatorByBirtyDate implements Comparator<Human>{

    public int compare(Human n1, Human n2){
        return n1.getBDate().compareTo(n2.getBDate());
    }
}