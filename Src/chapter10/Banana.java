package chapter10;

public class Banana extends Fruit{
    public void removeseed(){
        System.out.println("you remove seed");
    }
    public void peel(){
        System.out.println("the apple is peel");
    }
public Banana(double calories){
        setCalories(calories);
        System.out.println("calories"+calories);
}
@Override
    public void makeJuiec (){
        System.out.println("Banana juice is made");
    }
}
