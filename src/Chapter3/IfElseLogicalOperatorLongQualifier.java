package Chapter3;

/*
* Logical operators
* To qualify for a loan, a person must make at least $30.000.
* And have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

class LogicalOperatorLongQualifier {

    public static void main(String args[]){

        //Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        // Get what we dont
        System.out.println("Enter your salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer: ");
        double years = scanner.nextDouble();

        scanner.close();
        // Make decision

        if (salary >= requiredSalary && years >= requiredYearsEmployed){
                System.out.println("Congrats! You qualify for the loan");
        }
        else{
            System.out.println("Sorry, you must earn at least $"
            + requiredSalary + " to qualify for the loan");
        }
    }
}
