package chapter4;

import java.util.Scanner;

public class AddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     // to delracle boolean to use it in while
        boolean again ;
        do {
            System.out.println("please enter the first number ");
       double num1= scanner.nextDouble();

            System.out.println("please enter the second number ");
            double num2= scanner.nextDouble();
       double sum = num1 +num2;
       System.out.println("the sum on the two number is = "+ sum);
        System.out.println("whould you like to start again ");
        again = scanner.nextBoolean();
        } while (again);
    scanner.close();
    }
}

