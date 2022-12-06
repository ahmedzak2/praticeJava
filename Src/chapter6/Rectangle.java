package chapter6;

public class Rectangle {
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
    /*
     * we use the get and setter method to allow any one use this field on this class
     *we use constructor  to set value to field in the class we cna pass value
     * to constructor or make it default by not pass any value and  set the value inside
     * the constructor  .The name of constructor must be as name of class
     * you can have many of constructor  but the name must be as class and the
     * different is the argument which pass
     *  */

    public double getLenght() {
        return lenght;
    }

    /*
    to allow any one to set the length  for external module
     */
    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculatePerimeter() {
        return ((2 * lenght) + (2 * width));
    }

    public double calculateArea() {
        return (lenght * width);
    }
}

