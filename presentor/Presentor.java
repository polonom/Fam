package presentor;
import model.FamTreeService;
import view.View;

public class Presentor {
    private View view;
    private FamTreeService service;

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
}