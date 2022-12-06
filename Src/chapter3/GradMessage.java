package chapter3;

import java.util.Scanner;

public class GradMessage {
     public static void main(String[] args) {
    System.out.println("please enter your grade ");
         Scanner scanner = new Scanner(System.in);
         double grade = scanner.nextDouble();
String message;
         switch ((int) grade){
             case (85) :
                 message="execlent";
                break;
             case 75:
                 message = "very good";
                 break;
             case 60:
                 message="good";
                 break;
             case 50:
                 message = "pass";
                 break;
             case 40:
                 message ="fail";
                 break;
         }
     }
}
