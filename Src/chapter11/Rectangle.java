package chapter11;

public class Rectangle extends Shape{
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    private  double length;
private double width;
public Rectangle(double length, double width ){

}
    @Override
    double calcualteArea() {
        return length*width;
    }

    @Override
    double calculateRooms() {
        return 0;
    }

}
