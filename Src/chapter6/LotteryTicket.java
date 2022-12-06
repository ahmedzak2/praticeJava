package chapter6;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
    private static final int LENGHT=6;


    public static void main(String[] args) {
        int [] ticket = generateNumbers();
        Arrays.sort(ticket);
        printNumbers(ticket);

    }
    public static int[] generateNumbers(){
        int ticket[] = new int[LENGHT];
        Random random =new Random();
        for (int i=0;i<LENGHT;i++){
            int randomNUmber;

            /**
             * to make sure no duplicate number in array by compare
             */
            do {
              randomNUmber=  random.nextInt(69)+1;
            } while (search(ticket,randomNUmber));
            ticket[i]=randomNUmber;
        }
return ticket;
    }

    /**
     * this java doc  to tell you how the method work
     * make a sequential search on array to find value
     * @param array
     * @param numberForSerachFor
     * @return
     *
     */
    public static boolean search(int [] array,int numberForSerachFor)
    {
        // this called enhanced loop .it go through array and each time  assign the current element to value
        for (int value :array){
if ( value == numberForSerachFor){
    return  true;
}
        }
        return false;
        /**
         * if reach this point it mean all array is search for  and nothing found
         */
    }
    public  static  boolean binaryserach( int [] array , int numberSerachFor){
        Arrays.sort(array);
        int index= Arrays.binarySearch(array,numberSerachFor);
        if (index>=0){
            return true;
        }else return false;

    }
public static  void printNumbers(int ticket[]){
        for (int i =0 ;i<LENGHT;i++){
            System.out.println(ticket[i]);
        }
}

}

