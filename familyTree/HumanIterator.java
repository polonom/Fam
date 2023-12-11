package familyTree;

import java.util.Iterator;
import java.util.List;

import familyTree.FamilyTree;
import familyTree.Human_.Human;

public class HumanIterator implements Iterator<Human>{
    private int index = 0;
    private List<Human> humanList;

    public HumanIterator(List<Human> humanList){
        this.humanList = humanList;
    }

    public boolean hasNext(){
        return index < humanList.size(); 
    }

    public Human next(){
        return humanList.get(index++);
    }
} 
