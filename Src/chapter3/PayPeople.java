package chapter3;

import java.util.Scanner;

public class PayPeople {
    public static void main(String []arg){
        int salary = 10000;
        int bonus = 250;
    System.out.print("please enter  number of sales ");
        Scanner scanner = new Scanner(System.in);
       int sales  =scanner.nextInt();
       int result =salary+bonus;
       scanner.close();
       if (sales>=10){
           System.out.println("congratulation you met your quota ");
           System.out.println("The payment is "+(salary+bonus)+"the additional 250 is bonus ");
   //System.out.println(result);
       }
       else
       {
           int messing = 10-sales;
           System.out.println("you were short by "+messing+" "+"sales good luck in next month ");
       }
    }
}