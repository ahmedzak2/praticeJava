package chapter11;

public class Duck extends Anmial{

    @Override
    void makeSound(String name) {
System.out.println("duck");
    }

    @Override
    public void eat(String food) {
        super.eat(food);
    System.out.println("full");
    }
}
