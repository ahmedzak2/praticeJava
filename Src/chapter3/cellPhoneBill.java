package chapter3;

import java.util.Scanner;

public class cellPhoneBill {
static Scanner  scanner= new Scanner(System.in);
static double fee;
static int minutes;
static double subtotal;
static double tax;
static double overFees;
static double total;
public static void main(String[] args) {
    cellPhoneBill bill= new cellPhoneBill();
fee = getFee();
minutes = getOverageMinute();
overFees = getOverageFess(minutes);
    scanner.close();

subtotal=fee+overFees;
tax = getTax(subtotal);
total = getFinalTotal(subtotal,tax);
printBill(total,tax,overFees,fee);
    }
public static double getFee(){
System.out.println("please enter the plan fee");

return scanner.nextDouble();
}
public static int getOverageMinute(){
    System.out.println("please enter the overage minute ");
    return scanner.nextInt();
}
public static double getOverageFess(int minute){
        return (0.25*minute);
}
public static double getTax(double subtotal){
        return (.15*subtotal);
}
public static double getFinalTotal(double subtotal , double tax){
    return (subtotal+tax);
}
    public  static void printBill( double total,double tax,double overFees,double fee ){
        System.out.println("Plan: $ "+ fee);
        System.out.println("Overage: $ "+ overFees);

        System.out.println("Tax: $ "+ tax);
        System.out.println("the bill are : $ "+ total);

    }
}
