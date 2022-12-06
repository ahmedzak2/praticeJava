package finalPrioject;

import java.util.Random;

public class Coin {

    public String side;

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public static String getHead() {
        return Head;
    }

    public static void setHead(String head) {
        Head = head;
    }

    public static String getTail() {
        return Tail;
    }

    public static void setTail(String tail) {
        Tail = tail;
    }

    public static String Head= "head";
    public static String Tail="tail";


    public String flip(){
        if(new Random().nextBoolean()){
            setSide(Head);
        }
        else{
            setSide(Tail);
        }

        return getSide();
    }
}
