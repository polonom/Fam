package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.logging.FileHandler;

import model.familyTree.Human_.Gender;
import model.familyTree.Human_.Human;
import model.familyTree.tree.FamilyTree;

public class FamTreeService {
    private FamilyTree<Human> activeTree;
    private FileHandler file;

    public String addHuman(String name, String genderString, String birthDate,
                           long idFather, long idMother){
        Human father = activeTree.getById(idFather);
        Human mother = activeTree.getById(idMother);
        Gender gender = Gender.valueOf(genderString);
        LocalDate humanBirthDate = LocalDate.parse(birthDate);
        Human human = new Human(name, gender, humanBirthDate, father, mother);
        activeTree.add(human);
        return "Human is added";
    }

    public void sortByName(){
        activeTree.sortByName();
    }

    public void sortByBirthDate(){
        activeTree.sortByBirthDate();
    }

    public String getHumanList() {
        return activeTree.getInfo();
    }

    public void addToParents(String name, String genderString, String birthDate){
        Gender gender = Gender.valueOf(genderString);
        LocalDate humanBirthDate = LocalDate.parse(birthDate);
        Human human = new Human(name, gender, humanBirthDate);
        activeTree.addToParents(human);
    }

    public void addToChildren(String name, String genderString, String birthDate){
        Gender gender = Gender.valueOf(genderString);
        LocalDate humanBirthDate = LocalDate.parse(birthDate);
        Human human = new Human(name, gender, humanBirthDate);
        activeTree.addToChildren(human);
    }

    public void save(Serializable serializable, String filePath){
         file.save(file, filePath);
    }

}
    

