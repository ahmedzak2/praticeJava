package chapter10;

public class Apple extends Fruit{
    public void removeseed(){
        System.out.println("you remove seed");
    }
    public void peel(){
        System.out.println("the apple is peel");
    }
    public Apple(double calories){
        setCalories(calories);
        System.out.println("calories"+calories);
    }
    @Override
    public void makeJuiec (){
        System.out.println("Apple juice is made");
    }
}
