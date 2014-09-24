///////////////////////////////////////////////////////////////////////////////
/*
Deepankar Roy
Homework 4
09/23/14

Month Program:
Promt user to
    -enter int value for the month
    -if 2 then ask the year
print
    -number of days in that month
*/

//import scanner
import java.util.Scanner;

//define class
public class Month {
    
    //add main method
    public static void main(String[] args) {
        
        Scanner myScanner; //declare scanner
        myScanner = new Scanner (System.in); //construct scanner
        
        //input data
        System.out.print("Enter an int giving the number of the month (1-12): ");
        int month = myScanner.nextInt();
        
        int days = 0;
        int year = 0;
        
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                System.out.print("Enter an int giving the year: ");
                year = myScanner.nextInt();
                if (((year % 4 == 0)&&!(year % 100 == 0))||(year % 400 == 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                System.out.println("Please enter an int between 1 and 12");
                break;
        }
        
        System.out.println("The month has " +days+ " days");
        
    }
} 