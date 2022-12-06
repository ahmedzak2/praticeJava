package chapter9;

public class Rectangle {
    protected double sides = 4;

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    private double lenght;
    private double width;

    public Rectangle() {
        lenght = 0;
        width = 0;

    }

    public Rectangle(double lenght, double width) {
        setLenght(lenght);
        setWidth(width);

    }


public void print(){
        System.out.println("i'm rectangle");
}

    public double calculatePerimeter() {
        return ((2 * lenght) + (2 * width));

    }
}