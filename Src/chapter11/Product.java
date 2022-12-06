package chapter11;

public interface Product {
    double getPrice();
    double setPrice(double price);
    String getName();
    String setName(String name);
    String getColour();
    String setColour(String colour);
 public default void print(double price, String name, String colour){
     System.out.println("the name of bokk "+name +price+colour);
 }
}
