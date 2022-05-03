package chapter4;

/*
*FOR LOOP
* Write a cashier program that will scan a give number of items and tally the cost
 */

import java.util.Scanner;

public class ForCashier {
    public static void main(String[] args){

        //Get number of items to scan
        System.out.println("Enter the number of items you would you like to scan: ");
        Scanner s = new Scanner(System.in);
        int quantity = s.nextInt();


        double total = 0;

        //Create a loop to iterate through all of the items and acumulate the costs.
        /*
        Primero pondremos el valor en el que empezara a iterar
        Despues pondremos cuando dejara de iterar
         */
        for (int i = 0; i <quantity; i++){
            System.out.println("Enter the cost of item: ");
            double price = s.nextDouble();

            total = total + price;
        }
        s.close();

        System.out.println("Your total is " + total + "€");

    }


}
