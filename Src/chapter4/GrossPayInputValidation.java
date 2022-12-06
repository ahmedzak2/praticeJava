package chapter4;

import java.util.Scanner;

/*

* while loop
* each store employee make 15
 */
public class GrossPayInputValidation {
    public static void main(String[] args) {
        int rate =15;
        int maxHour = 40;
        System.out.println("How many hours did you in this week" );
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();
        while (hoursWorked>maxHour || hoursWorked<1){
           System.out.println("Invalid entry .your hour must between 1 to 40");
        hoursWorked = scanner.nextDouble();

        }
scanner.close();
        double result = hoursWorked*rate;
        System.out.println(" your salary is "+ result);

    }
}
