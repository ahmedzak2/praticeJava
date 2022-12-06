package chapter9;

public class Square extends Rectangle{
    @Override
    public double calculatePerimeter() {
        return ( sides * getWidth());

    }
    public void print(String what){
        System.out.println("I am a " + what);
    }
    }


