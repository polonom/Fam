package presentor;
import java.io.Serializable;
import java.util.logging.FileHandler;

import model.FamTreeService;
import model.familyTree.Human_.Human;
import view.View;

public class Presentor {
    private View view;
    private FamTreeService service;
    private FileHandler fileHandler;


    public Presentor(View view) {
        service = new FamTreeService();
        this.view = view;
    }

    public void addHuman(String name, String gender, String birthDate, long idFather, long idMother){
        String answer = service.addHuman(name, gender, birthDate, idFather, idMother);
        view.printAnswer(answer);
    }

    public void getHumanList1(){
        String answer = service.getHumanList();
        view.printAnswer(answer);
    }

    public void sortByName1(){
        service.sortByName();
    }

    public void sortByBirthDate1(){
        service.sortByBirthDate();
    }

    public void addToParents(String name, String gender, String birthDate){
        service.addToParents(name, gender, birthDate);
    }

    public void addToChildren(String name, String gender, String birthDate){
        service.addToChildren(name, gender, birthDate);
    }

    public void save(Serializable serializable, String filePath){
        service.save(serializable, filePath);
    }
}