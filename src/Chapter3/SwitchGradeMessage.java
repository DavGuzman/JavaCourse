package Chapter3;

import java.util.Scanner;

public class SwitchGradeMessage {

    public  static void main(String args[]){

        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();



        String message;

        switch(grade){
            case "A":
                message = "Excelent job";
                break;
            case "B":
                message = "Great job";
                break;
            case "C":
                message = "Good job";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "oh oh ";
                break;
            default:
                message = "Error, invalid grade";
                break;


        }
        System.out.println(message);



    }


}
