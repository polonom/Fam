package view;

import java.util.Scanner;

import model.familyTree.tree.FamilyTree;
import presentor.Presentor;

public class ConsoleUI implements View {
    private Scanner scanner; 
    private Presentor presentor; 
    private boolean work;
    private Menu menu;


    public ConsoleUI(){
        scanner = new Scanner(System.in);
        presentor = new Presentor(this);
        work = true;
        menu = new Menu(this);
    }

    public void start(){
        System.out.println("Hi.Choose what do u want to do with a family tree");
        System.out.println("1.Add Human");
        System.out.println("2.Sort By Birth Date");
        System.out.println("3.Sort By Name");
        System.out.println("4. Get list of humans");
        System.out.println("5.Add parant");
        System.out.println("6.Add children");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                addParent1();
                break;
            case "2":
                sortByBirthDate();
                break;
            case "3":
                sortByName();
                break;
            case "4":
                getHumanList();
                break;
            case "5":
                addParent1();
                break;
            case "6":
                addChild1();
                break;

            default:
                break;
        }
    }
    
     private void finish() {
        work = false;
    }

    private void printMenu(){
        System.out.println(menu.menu1());
    }


    public void sortByBirthDate() {
        presentor.sortByBirthDate1();
    }

    public void sortByName() {
        presentor.sortByName1();
    }

    public void getHumanList() {
        presentor.getHumanList1();
    }

    public void printAnswer(String answer){
        System.out.println(answer);     
    }

    public void addHuman(){
         System.out.println("Enter name");
                String name = scanner.nextLine();
                System.out.println("Enter birth date");
                String birthDate = scanner.nextLine();
                System.out.println("Enter gender");
                String gender = scanner.nextLine();
                System.out.println("Enter father");
                int idFather = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter mother");
                int idMother = Integer.parseInt(scanner.nextLine());
                presentor.addHuman(name,gender,birthDate,idFather,idMother);
    }

    public void addParent1(){
        System.out.println("Enter name");
                String name = scanner.nextLine();
                System.out.println("Enter birth date");
                String birthDate = scanner.nextLine();
                System.out.println("Enter gender");
                String gender = scanner.nextLine();
                presentor.addToParents(name,gender,birthDate);
    }

    public void addChild1(){
        System.out.println("Enter name");
                String name = scanner.nextLine();
                System.out.println("Enter birth date");
                String birthDate = scanner.nextLine();
                System.out.println("Enter gender");
                String gender = scanner.nextLine();
                presentor.addToChildren(name,gender,birthDate);
    }

    public void save() {
    }


   

}
