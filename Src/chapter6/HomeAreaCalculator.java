package chapter6;

public class HomeAreaCalculator {
    public static void main(String[] args) {

        /*
        rectangle 1
         */

Rectangle room1 = new Rectangle();
room1.setWidth(25);
room1.setLenght(45);
double areaOfRoom1= room1.calculateArea();
double perimeterOfRoom1= room1.calculatePerimeter();

Rectangle room2 = new Rectangle(25,30);
  double areaOfRoom2= room1.calculateArea();
   double perimeterOfRoom2= room1.calculatePerimeter();

   System.out.println("the area of room1 ="+areaOfRoom1);
   System.out.println("the perimeter of room1 ="+perimeterOfRoom1);
   System.out.println("the area of room2 ="+areaOfRoom2);
   System.out.println("the perimeter of room2 ="+perimeterOfRoom2);

    }
}
