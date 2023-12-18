package model.familyTree.tree;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public interface TreeNode<T> extends Serializable {
    void setId(long id);
    long getId();
    T getFather();
    T getMother();
    boolean addChild(T human);
    boolean addParent(T human);
    String getName();
    LocalDate getDDate();
    LocalDate getBDate();
    List<T> getParents();
    List<T> getChildren();
    T getSpouse();
    void setSpouse(T human);



    
}
