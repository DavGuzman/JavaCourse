package Chapter3;

import java.util.Scanner;

public class MoneyGame {

    public static void main(String args[]){

        // what we know
        int dollar = 100;

        // Questions

        System.out.println("¿Cuántas monedas de 5 centimos quieres introducir");
        Scanner scanner = new Scanner(System.in);
        int monedasCinco = scanner.nextInt();

        System.out.println("¿Cuántas monedas de 10 centimos quieres introducir");
        int monedasDiez = scanner.nextInt();

        System.out.println("¿Cuántas monedas de 50 centimos quieres introducir");
        int monedasCincuenta = scanner.nextInt();
        scanner.close();

        //Summatory
         int suma = (monedasCinco*5) + (monedasDiez*10) + (monedasCincuenta*50);
         int sobrepasar = suma - dollar;
         int debajo = dollar - suma;

         if (suma == dollar){
             System.out.println("Oh, exactamente es un dolar, enhorabuena!");
         } else if (suma > 100) {
             System.out.println("Oh, te has pasado, " + sobrepasar);
         }else {
             System.out.println("Oh, te han faltado " + debajo);
         }
    }
}
