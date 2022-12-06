package CalculateSalary;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]){

        System.out.println("please enter you number of hours");
        /**
         * To  get the input of system to move
         */
        Scanner scanner= new Scanner(System.in);
        float numberHour= scanner.nextFloat();
       // float NumberHour= scanner;
        System.out.println("please enter employ hour rate");
       double hourPay= scanner.nextDouble();
       scanner.close();

       double result = numberHour *hourPay;
       System.out.print("the money the client should pay is = "+result);



    }
}
