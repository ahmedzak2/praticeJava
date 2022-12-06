package chapter3;

import java.util.Scanner;

public class MadLab {
    public static void main (String qrg[]){
        System.out.print("Please Enter the season ");
        Scanner scanner = new Scanner(System.in);
     String  season= scanner.next();

    System.out.print("please enter the number ");
    int number =scanner.nextInt();
    System.out.print("please enter adjective ");
    String adjective =scanner.next();
    System.out.print("on a "+adjective+" "+season+"day,I drink minimum of "+number+"cups of coffee ");

    }
}
