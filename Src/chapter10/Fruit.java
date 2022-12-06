package chapter10;

public class Fruit {
    private double calories ;

    public void makeJuiec (){
        System.out.println("juice is made");
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
        System.out.println("calories"+calories);
    }

}
