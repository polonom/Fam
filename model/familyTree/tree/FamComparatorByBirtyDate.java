package model.familyTree.tree;

import java.util.Comparator;



public class FamComparatorByBirtyDate<E extends TreeNode<E>> implements Comparator<E>{

    public int compare(E n1, E n2){
        return n1.getBDate().compareTo(n2.getBDate());
    }
}