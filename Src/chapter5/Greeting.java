package chapter5;

import java.util.Scanner;
/*
* to call another method than main method by call it inside the main
* the body of method is defined  outside the main
 */
public class Greeting {
    public static void main(String[] args) {
System.out.println("Enter your name ");
        Scanner scanner =new Scanner(System.in);
    String name = scanner.next();
    greetUser(name);
    }
    public static void greetUser ( String name){
        System.out.println( " welcome ya "+name);
    }
}
