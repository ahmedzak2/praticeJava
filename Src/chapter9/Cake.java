package chapter9;

public class Cake {
    private  String flavor;
    private double price;
    public  Cake(){

    }
    public Cake(String name){
        setFlavor(name);
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
