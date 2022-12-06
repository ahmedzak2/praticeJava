package chapter6;

import java.util.Scanner;

public class PhoneBillCalculator2 {
    private  int  id;
    private double baseCost;
    private int numberOfAllottedMinute;
    private int numberMinuteUsed;

    private double subtotal;
    private double tax;
    private  double overFees;
    private  double total;
    public PhoneBillCalculator2(){

        this.id=1;
        setBaseCost(25);
        setNumberMinuteUsed(50);
        setNumberOfAllottedMinute(40);

    };
    public PhoneBillCalculator2(int id ){
        this.id=id;
        setBaseCost(30);
        setNumberMinuteUsed(60);
        setNumberOfAllottedMinute(40);

    };
    public PhoneBillCalculator2(int id, double baseCost, int numberOfAllottedMinute, int numberMinuteUsed){
        setBaseCost(baseCost);
        setNumberMinuteUsed(numberMinuteUsed);
        setNumberOfAllottedMinute(numberOfAllottedMinute);
    };

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public void setNumberOfAllottedMinute(int numberOfAllottedMinute) {
        this.numberOfAllottedMinute = numberOfAllottedMinute;
    }

    public void setNumberMinuteUsed(int numberMinuteUsed) {
        this.numberMinuteUsed = numberMinuteUsed;
    }
    public  double getOverageFess() {
        if ((numberMinuteUsed-numberOfAllottedMinute) < 0) {
            return 0;
          } else {
            return (0.25 * (numberMinuteUsed-numberOfAllottedMinute));
          }
        }

        public double getTax ( ){
            return (.15 * (baseCost+overFees));
        }
        public double getFinalTotal ( ){
            return (baseCost + getTax()+getOverageFess());
        }
        /*
        public void printBill2 ( double total, double tax, double overFees, double fee ){

                System.out.println("Plan: $ " + baseCost);
                System.out.println("Overage: $ " + overFees);

                System.out.println("Tax: $ " + tax);
                System.out.println("the bill are : $ " + total);

            }
*/
            public void printBill (  ){

                System.out.println("Plan: $ " + baseCost);
            System.out.println("Overage: $ " + getOverageFess());

            System.out.println("Tax: $ " +getTax());
            System.out.println("the bill are : $ " + getFinalTotal());

        }
    }
