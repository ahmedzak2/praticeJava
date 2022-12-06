package chapter9;

public class Employee extends Person {
    public Employee(){
// we use the super to call the constructor of super class
        super("ahmed");
        System.out.println("Im Employe");
    }
    private  String empolyeddID;
    private  String title;


    public String getEmpolyeddID() {
        return empolyeddID;
    }

    public void setEmpolyeddID(String empolyeddID) {
        this.empolyeddID = empolyeddID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
