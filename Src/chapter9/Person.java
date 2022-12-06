package chapter9;

public class Person {
    public Person(){
        System.out.println("Im person ");
    }
    public Person( String name){
        System.out.println("the second person  why "+name);
    }
    private int age;
    private String name;
    private String gender;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
