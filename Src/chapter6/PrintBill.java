package chapter6;

public class PrintBill {


    public static void main(String[] args) {
        PhoneBillCalculator2 bill = new PhoneBillCalculator2(1,25,40,60);
        PhoneBillCalculator2 bill2 = new PhoneBillCalculator2(1);
        PhoneBillCalculator2 bill3 = new PhoneBillCalculator2();
        bill.printBill();
        System.out.println("this is last of bill 1");
        bill2.printBill();
        System.out.println("this is last of bill 2");
        bill3.printBill();
        System.out.println("this is last of bill 3");

    }
}
