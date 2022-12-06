package chapter10;

public class TestFurits {

    public static void main(String[] args) {
        Fruit fruit =new Fruit();
fruit.setCalories(5);
fruit.getCalories();
    fruit.makeJuiec();
    Fruit apple = new Apple(25);

    apple.makeJuiec();

    Fruit banana = new Banana(30);
    banana.makeJuiec();
    banana.getCalories();
    Apple apple1 = new Apple(75);
    apple1.removeseed();
    ((Apple) apple).removeseed();

    apple1.peel();

    Banana  banana1 = new Banana(75);
    banana1.removeseed();
    banana1.peel();
        Fruit banana2 = new Banana(40);
        ((Banana) banana2).peel();

        Fruit orange = new Fruit();
        squeeze(apple);
        squeeze(banana);
        squeeze(banana2);
        squeeze(orange);

    }
    public static void squeeze(Fruit fruit){
        System.out.print("Squeezing...");
        fruit.makeJuiec();
    }
}
