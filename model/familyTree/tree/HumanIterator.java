package model.familyTree.tree;

import java.util.Iterator;
import java.util.List;

public class HumanIterator<E extends TreeNode<E>> implements Iterator<E>{
    private int index = 0;
    private List<E> humanList;

    public HumanIterator(List<E> humanList){
        this.humanList = humanList;
    }

    public boolean hasNext(){
        return index < humanList.size(); 
    }

    public E next(){
        return humanList.get(index++);
    }
} 
