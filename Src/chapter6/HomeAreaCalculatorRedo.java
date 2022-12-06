package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
 private    Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
        /*
        we create another instant of class  tho call in the method that not static
         */
        HomeAreaCalculatorRedo calculatorRedo =new HomeAreaCalculatorRedo();


        Rectangle kitchen = calculatorRedo.getRoom();
        Rectangle bathroom = calculatorRedo.getRoom();
      calculatorRedo. scanner.close();

        double area =calculatorRedo.calculateTotalArea(kitchen,bathroom);
        System.out.println("the total area is  "+area);

    }
    /*
    use it to get information form user then pass it to claas Rectangle
    to do some process then use it in your class
     */
    public Rectangle getRoom(){
    System.out.println("Enter the lenght");
    double length = scanner.nextDouble();
        System.out.println("Enter the width");
        double width = scanner.nextDouble();
        return new Rectangle(length,width);

    }
    public  double calculateTotalArea(Rectangle kitchen,Rectangle bathroom){
        return kitchen.calculateArea()+bathroom.calculateArea();
    }
}
