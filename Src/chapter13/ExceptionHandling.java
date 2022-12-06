package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) throws IOException {
        numberRead();
        getFile();
        createNewFIle();
        createNewFIleRethrow();
    }
    public static void createNewFIle(){
        File file = new File("resources/nonexistent.txt");
       try {
           file.createNewFile();
       }catch ( Exception fil){
           System.out.println("the direcotory don't find ");
       fil.printStackTrace();
       }
    }
    public static void createNewFIleRethrow() throws IOException {
        File file = new File("resources/nonexistent.txt");
            file.createNewFile();
    }

    public  static  double getFile(){
        File file = new File("resources/nonexistent.txt");
        Scanner scanner = null;
        try {
        scanner = new Scanner(file);
while (scanner.hasNext()){
    double num = scanner.nextDouble();
  System.out.println(num);
    return num;

}
        }catch ( FileNotFoundException  e ){
            System.out.println("the direcotory don't find ");
            e.printStackTrace();
        }catch (InputMismatchException e ){
e.printStackTrace();
        }catch (Exception e) {
        e.printStackTrace();
        }
        /*
        * we use the finally class to make sure the command is done with or wwithout te catch and try file is done
         */
        finally {
            scanner.close();        }
    return 0;
    }
public static double numberRead(){

return 0;
    }
}
