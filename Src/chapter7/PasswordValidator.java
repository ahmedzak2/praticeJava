package chapter7;

import java.util.Locale;
import java.util.Scanner;

import static java.util.regex.Pattern.matches;

public class PasswordValidator {
    public static void main(String[] args) {
        System.out.println("please enter you use name");
        Scanner scanner =new Scanner(System.in);
        var name  = scanner.next();
        System.out.println("please enter you use password");
        var oldPass = scanner.next();
        System.out.println("please enter your  new password");
        var psss = scanner.next();
        validatePassword(name,psss,oldPass);

    }
 public static void validatePassword( String text, String password,String oldPass){
        int count=0;
        int upper =0;
        String error ;
boolean valid;
     if (password.equals(text)) {

     System.out.println("the password can't contain the name ");
     }
     for (int i =0;i<password.length();i++) {
         if (Character.isUpperCase(password.charAt(i))) {
             upper++;
         }

     }
     if( upper ==0){
         System.out.println( "password must contain capital letter ");

     }
  if (password.matches("[a-zA-Z0-9 ]*")){

valid = false;
System.out.println( "password must contain special charter ");

  }
  if (password.length()<8){
      System.out.println( "password must at least 8 character  ");
  }
    if (password.equals(oldPass)){
         System.out.println("the password is same as old password");
     }
     if (upper==0){
         System.out.println(" the password must have special letter ");

     }
     if ( count== text.length()){
         System.out.println(" the password can't contian the user name ");
     }
     if (count!= text.length() &&!password.equals(oldPass) && ! (password.length()<8) && !password.matches("[a-zA-Z0-9 ]*") && !password.equals(text) && upper !=0  ){

         System.out.println("the password is saved");
     }

 }
}
