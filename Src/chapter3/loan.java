package chapter3;

import java.util.Scanner;

public class loan {
     public static void main(String[] args) {
    System.out.println("please enter the amount of money you make in year");
         Scanner scanner = new Scanner(System.in);
         double moeny = scanner.nextDouble();
         int condition = 30000;
         int year =2;
         System.out.println("how much time you spent in your job ");
         double job = scanner.nextDouble();
         scanner.close();
         if (moeny>=condition && job>=year){
             System.out.println("congratulation  you qualified to take loan ");
         } else if (moeny<condition && job>=year){
             System.out.println("sorry you under paid by "+(condition-moeny));
         } else if (job<year && moeny>=condition){
             System.out.println("sorry you don't short of the  year of  work  by "+(year-job));

         }
         else if (moeny <condition && job <year){
             System.out.println("sorry you under paid by "+(condition-moeny)+" and  short of the  year of  work  by "+(year-job));
         }

     }
}
