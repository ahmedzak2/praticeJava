package chapter13;

public class DividinByZero {
    public static void main(String[] args) {
        int c = 30;
        int x = 0;
        divideNumber(c,x);
    }
    public static void divideNumber(int c, int x){

        try {
            int y = c/x;
        }catch ( ArithmeticException e){
            System.out.println("you can't divide by zero");
        }
    }
}
