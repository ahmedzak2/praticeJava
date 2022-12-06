package chapter3;

import java.util.Scanner;

public class changeForDollarCoin {
     public static void main(String[] args) {
         double penny = .01;
         double nickel = .05;
         double dime = .10;
         double quarter = .25;
         int dollar = 1;

    System.out.println("please enter the nickels");
         Scanner scanner = new Scanner(System.in);
         double nickels = scanner.nextDouble();
         System.out.println("please enter the pennies ");
         double pennies = scanner.nextDouble();
         System.out.println("please enter the dimes ");
         double dimes = scanner.nextDouble();
         System.out.println("please enter the quarters");
         double quarters = scanner.nextDouble();
         scanner.close();
         double total =nickels*nickel+pennies*penny+dimes*dime+quarters*quarter;
         if (total==dollar){
             System.out.println("congratulation  you win ");
         } else if (total>dollar){

             System.out.println("you over than dollar by  "+(total-dollar));
         } else if (total<dollar){
             System.out.println("you over than dollar by "+(dollar-total));

         }

     }
}
