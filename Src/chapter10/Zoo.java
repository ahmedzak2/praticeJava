package chapter10;

public class Zoo {
    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        Animal rock = new Dog();
        rock.makeSound();
feed(rock);
        rock = new Cat();
        rock.makeSound();
((Cat) rock).scratch();
feed(rock);
    }
    public static void feed(Animal animal){
        if (animal instanceof Dog){
            System.out.println("you are dog ");
        } else if (animal instanceof Cat) {
            System.out.println("you are cat ");

        }
    }
}
