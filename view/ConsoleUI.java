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
        String choice = scanner.nextLine();

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


   

}
