package chapter11;

public class Pig extends Anmial{
    @Override
    void makeSound(String name) {
        System.out.println("zzz");
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        System.out.println("full");
    }
}
