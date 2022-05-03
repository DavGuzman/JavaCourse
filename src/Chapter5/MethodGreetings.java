package Chapter5;

/*
*OUR FIRST METHOD
* Write a method that asks a user for their name, then greets them by name
 */

import java.util.Scanner;

public class MethodGreetings {
    public  static void main(String[] args){
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        //Llamar al method
        greetUser(name);

    }
    public static void greetUser(String  name){
        System.out.println("Hi there, " + name);
    }
}
