package model.familyTree.tree;

import java.util.Comparator;



public class FamComparatorByName<E extends TreeNode<E>> implements Comparator<E>{

    public int compare(E n1, E n2){
        return n1.getName().compareTo(n2.getName());
    }
    
}
