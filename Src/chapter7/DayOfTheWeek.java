package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {
    private static String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}; ;
    private static int dayNumber;
    private static int weekCount = 7;

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number of week ");
        int number =scanner.nextInt();
        scanner.close();
    getDayOfWeek(number);
    }


    public static void getDayOfWeek(int dayNumber){
System.out.println("the day is "+week[dayNumber-1]);
    }
}
