package finalPrioject;

import java.util.Random;
import java.util.Scanner;

public class CoinToss {
    static Scanner scanner=new Scanner(System.in);
    static Coin coin = new Coin();
    public static String guess1;
    public static String guess2;
    public static void main(String[] args) {
        Scanner name =new Scanner(System.in);
        Player player1 =new Player(askName());
        Player player2 =new Player(askName());
        guess1= player1.getName();
        guess2= player2.getName();
                player1.setGuss(makeGuess());
    player2.setGuss(makeGuess());
    coin.flip();
        getGuess1(player1.getGuss(),player2.getGuss());
    }

    public static void getGuess1(String guess1, String guess2){
        if (guess1 == guess2 && guess1 == coin.getSide()){
            System.out.println("this draw ");
        }
        if (guess1 == coin.getSide() ){
            System.out.println("the player "+guess1+"win");
        }

        else if ((guess2 == coin.getSide())){
            System.out.println("the player "+guess2+"win");
        }else {
            System.out.println("there wrong in steps ");
        }


    }
    public static String   askName(){

    System.out.println("please tell me name ");
    return scanner.next();
    }
    public static String   makeGuess(){
System.out.println("please tell me your guess player ");
return scanner.next();
    }
}
