package model.familyTree.tree;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;





public class FamilyTree<E extends TreeNode<E>> implements Serializable, Iterable<E>{
    private long humanId;
    public List<E> humanList;

    public FamilyTree() { this(new ArrayList<>());}
    public FamilyTree(List<E> humanList) {this.humanList=humanList;}

    public boolean add(E human){
        if (human==null){
            return false;
        }
        if (!humanList.contains(human)){
            humanList.add(human);
            human.setId(humanId++);

            addToParents(human);
            addToChildren(human);

            return true;
        }
        return false;
    }

    public void addToParents(E human){
        for (E parent: human.getParents()){
            parent.addChild(human);
        }
    }
    public void addToChildren(E human){
        for (E parent: human.getChildren()){
            parent.addParent(human);
        }
    }

    public List<E> getSibling(int id){
        E human = getById(id);
        if (human == null){
            return null;
        }
        List<E> res = new ArrayList<>();
        for (E parent: human.getParents()){
            for( E child: parent.getChildren()){
                if (!child.equals(human)){
                    res.add(child);
                }
            }
        }
        return res;
    }

    public List<E> getByName(String name){
        List<E> res = new ArrayList<>();
        for (E human: humanList){
            if (human.getName().equals(name)){
                    res.add(human);
                }
            }
        return res;
    }

    public boolean setWedding(long humanId1, long humanId2){
        if(checkId(humanId1)&&checkId(humanId2)){
            E human1 = getById(humanId1);
            E human2 = getById(humanId2);
            return setWedding(human1, human2);
        }
        return false;
    }
    public boolean setWedding(E human1, E human2){
        if(human1.getSpouse() == null&&human2.getSpouse() == null){
            human1.setSpouse(human2);;
            human2.setSpouse(human1);;
            return true;
        }else{return false;}
        
    }

    public boolean checkId(long id) {return id< humanId && id>=0;}

    public E getById(long id){
        for (E human: humanList){
            if (human.getId() == id){
                return human;
            }
        }
        return null;
    }

    public String toString() {return getInfo();}

    public String getInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append(" In the tree");
        sb.append(humanList.size());
        sb.append(" objects: ");
        for (E human: humanList){
            sb.append(human);
            sb.append("\n");
        }
        return sb.toString();


    }


    public Iterator<E> iterator(){
        return new HumanIterator(humanList);
    }

    public void sortByName(){
        humanList.sort( new FamComparatorByName());
    }

    public void sortByBirthDate(){
        humanList.sort( new FamComparatorByBirtyDate());
    }


    
    
    
}
