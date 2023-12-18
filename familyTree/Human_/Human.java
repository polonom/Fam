package familyTree.Human_;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Human {

    private long id;
    private Gender gender;
    private String name;
    private LocalDate birthDate;
    private LocalDate deathDate;
    private Human mother;
    private Human father;
    private List<Human> children; 
    private Human spouse; 

    public Human(String name, Gender gender, LocalDate birthDate, LocalDate deathDate, Human mother, Human father){
        id=-1;
        this.name=name;
        this.gender=gender;
        this.birthDate=birthDate;
        this.deathDate=deathDate;
        this.father=father;
        this.mother=mother;
        children = new ArrayList<>();
    }
    
    public Human(String name, Gender gender, LocalDate birthDate){
        this(name, gender, birthDate, null, null, null);
    }
    
    public Human(String name, Gender gender, LocalDate birthDate, Human mother, Human father){
        this(name, gender, birthDate, null, mother, father);
    }

    public boolean addChild(Human child){
        if(!children.contains(child)){
            children.add(child);
            return true;
        }
        return false;
    }

    public boolean addParent(Human parent){
        if (parent.getGender().equals(Gender.Male)){
            setFather(parent);
        } else if (parent.getGender().equals(Gender.Female)){
            setMother(parent);
        }
        return true;
    }

    public void setGender(Gender gender) { this.gender=gender;}
    public void setName(String name) { this.name=name;}
    public void setMother(Human mother) { this.mother=mother;}
    public void setFather(Human father) { this.father=father;}
    public void setSpouse(Human spouse) { this.spouse=spouse;}
    public void setId(long id) { this.id=id;}
    public void setBDate(LocalDate birthDate) { this.birthDate=birthDate;}
    public void setDDate(LocalDate deathDate) { this.deathDate=deathDate;}



    public Human getMother(){return mother;}
    public Human getFather(){return father;}
    public Human getSpouse(){return spouse;}
    public Gender getGender(){return gender;}
    public String getName(){return name;}
    public long getId(){return id;}
    public LocalDate getBDate(){return birthDate;}
    public LocalDate getDDate(){return deathDate;}
    public List<Human> getChildren(){return children;}

    public List<Human> getParents(){
        List<Human> list=new ArrayList<>(2);
        if (father!= null){
            list.add(father);
        }
        if (mother!=null){
            list.add(mother);
        }
        return list;
    }

    public int getAge(){
        if(deathDate == null){
            return getPeriod(birthDate, LocalDate.now());
        } else {
            return getPeriod(birthDate, deathDate);
        }
    }

    private int getPeriod(LocalDate birthDate, LocalDate deathDate){
        Period diff= Period.between(birthDate, deathDate);
        return diff.getYears();
    }

    public String toString(){ return getInfo();}

    public String getInfo(){
        StringBuilder sb= new StringBuilder();
        sb.append("id: ");
        sb.append(id);
        sb.append(", name: " );
        sb.append(name);
        sb.append(", gender: ");
        sb.append(gender);
        sb.append(", age: ");
        sb.append(getAge());
        sb.append(",  ");
        sb.append(getMotherInfo());
        sb.append(",  ");
        sb.append(getFatherInfo());
        sb.append(",  ");
        sb.append(getSpouseInfo());
        sb.append(",  ");
        sb.append(getChildrenInfo());
        return sb.toString();
    }

    public String getSpouseInfo(){
        String res = "spouse: ";
        if(spouse == null){
            res += "No";
        } else{ 
            res += spouse.getName();
        }
        return res;
    }
    public String getMotherInfo(){
        String res = "mom: ";
        Human mother = getMother();
        if(mother == null){
            res += "No";
        } else{ 
            res += mother.getName();
        }
        return res;
    }
    public String getFatherInfo(){
        String res = "dad: ";
        if(father == null){
            res += "No";
        } else{ 
            res += father.getName();
        }
        return res;
    }
    public String getChildrenInfo(){
        StringBuilder res = new StringBuilder();
        res.append("children: ");
        if (children.size() != 0){
            res.append(children.get(0).getName());
            for (int i = 1; i < children.size(); i++){
                res.append("; ");
                res.append(children.get(i).getName());
            }
        } else {
            res.append("No");
        }
        return res.toString();

        }
        
        public boolean equals(Object obj){
            if (this == obj){
                return true;
            }
            if(!(obj instanceof Human)){
                return false;
            }
            Human human = (Human) obj;
            return human.getId() == getId();
        }

    }




    



