package familyTree.Human_;

import java.util.Comparator;

public class HumanComparatorByBirtyDate implements Comparator<Human>{

    public int compare(Human n1, Human n2){
        return n1.getBDate().compareTo(n2.getBDate());
    }
}