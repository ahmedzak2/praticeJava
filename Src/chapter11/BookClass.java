package chapter11;

public class BookClass implements Product{
    private  double price;
    private  String name;
    private  String colour;

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public double setPrice(double price) {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String setName(String name) {
        return null;
    }

    @Override
    public String getColour() {
        return null;
    }

    @Override
    public String setColour(String colour) {
        return null;
    }
}
