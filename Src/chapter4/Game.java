package chapter4;

import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
     int total =0;
        for (int i =0; i<5;i++){
    int die = random.nextInt(6) + 1;
       total= total+die;

  if (total<20 ){
    System.out.println("Roll #"+ (i+1)+"you have rolled  "+die +
            ". You are now on space "+ total +"and have " +(20-total)+" more to go.");

 }
 else if  ( total == 20){
    System.out.println("Roll # "+ (i+1)+"you have rolled  "+die +
            ". You are now on space "+ total +"Congrats, you win! " );

}
  else  if (total>20){
                System.out.println("you lose  you exceed the 20 space by "+ (total-20) );
                break;
            }
  }
        if (total<20  ){
            System.out.println("you lose  finish you roll and less than game board by "+ (20-total) );

    }
     }
}
