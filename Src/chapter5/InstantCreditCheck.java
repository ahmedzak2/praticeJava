package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {
   static int limitMoney=25000;
   static int limitCheck =700;
  static   Scanner scanner =new Scanner(System.in);
   public static void main(String[] args) {
        double money ;
        int  check;
        System.out.println("please enter the money you make");

        money = scanner.nextDouble();
        System.out.println("pleasae tell the credit score");
        check = scanner.nextInt();
        scanner.close();
        checkCredit(money,check);
        System.out.println(isUserQualified(money,check));
    }
    public static void checkCredit(double num, int check){
        if( ( num >limitMoney) &&(check>=limitCheck)){
            System.out.println("you pass");
        }
        else {
            System.out.println("you are not qualified");
        }
    }
public static boolean isUserQualified(double num,int check){
       if (( num >limitMoney) &&(check>=limitCheck)){
           return true;


       }else {
           return false;
       }
}
}
