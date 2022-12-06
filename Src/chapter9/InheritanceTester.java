package chapter9;

public class InheritanceTester {
    public static void main(String[] args) {
       // Person person = new Person();
        Employee employee = new Employee();
        //employee.setEmpolyeddID("1");
       // employee.setTitle("the tester ");
        Rectangle  rectangle= new Rectangle();
        rectangle.print();
        Square square = new Square();
        square.print("ahmed");
    }
    /**
     * to overwrite the method of parent class
     */

    public static void testSquareOverride() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLenght(4);
        rectangle.setLenght(8);
        System.out.println(rectangle.calculatePerimeter());
        Square square = new Square();
        square.setLenght(4);
        square.setWidth(8);
        System.out.println(square.calculatePerimeter());
    }
    }
