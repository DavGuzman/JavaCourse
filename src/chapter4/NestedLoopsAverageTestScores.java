package chapter4;

/*
*NESTED LOOPS
* Find the average of each student's test scores
 */

import java.util.Scanner;

public class NestedLoopsAverageTestScores {
    public static void main(String[] args){

        //initialize what we know
        int numberOfStudents = 24;
        int numberOfTests = 4;
        Scanner s = new Scanner(System.in);


        //Process the students
        for (int i=0; i<numberOfStudents; i++){

            double total = 0;
            for (int d = 0; d<numberOfTests; d++){
                System.out.println("Enter the score for Test #" + (d+1));
                double score = s.nextDouble();
                total = total + score;
            }
            double average = total/numberOfTests;
            System.out.println("The test average for student #" + (i+1) + " is "
                    + average);
        }
        s.close();
    }
}
