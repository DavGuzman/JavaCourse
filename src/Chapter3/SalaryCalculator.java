package Chapter3;

/*
IF Statement.
All salespersons get a payment of 1000$ a week.
Salesperson who exceed 10 sales get an additional bonus of 250$
 */

import java.util.Scanner;

public class SalaryCalculator {

    public static void main (String args[]){

        //Initializa known values
        int salary = 1000;
        int bonus = 250;

        //Get values for the unknown
        System.out.println("How many sales did the employee make this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quik detour for the bonus earners
        if (sales > 10){
            salary = salary + bonus;
        }

        //Output
        System.out.println("The employees pay is $" + salary);



    }

}
