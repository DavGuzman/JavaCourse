package chapter2;

import java.util.Scanner;

public class SeasonOfTheYear {
    public static void main (String arg[]){

        //1. Preguntar por la estación del año.
        System.out.println("Escriba una estación del año ");
        Scanner scanner = new Scanner(System.in);
        String seasonYear = scanner.nextLine();
        //2. Preguntar un adjetivo en referencia a esa estación.
        System.out.println("Escriba un adjetivo que le recuerde a dicha estación" );
        String adjective = scanner.nextLine();
        //3. Preguntar un numero entero de cafes que toma en dicha estación
        System.out.println("Escriba cuantos cafés se toma en dicha estación al día ");
        int coffes = scanner.nextInt();
        scanner.close();

        //4. Completar la frase
        System.out.println("On a " + adjective + " " +  seasonYear + " day, i drink a minimum of " + coffes + " cups of coffee.");

    }

}
