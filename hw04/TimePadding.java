///////////////////////////////////////////////////////////////////////////////
/*
Deepankar Roy
Homework 4
09/23/14

Time Padding Program
promt to enter an int for number of seconds
print out time in format 10:39:10
*/

//import scanner
import java.util.Scanner;

//define class
public class TimePadding {
    
    //add main method
    public static void main(String[] args) {
        
        Scanner myScanner; //declare scanner
        myScanner = new Scanner (System.in);
        
        //input data
        System.out.print("Enter the time in seconds: ");
        int seconds = myScanner.nextInt();
        
        int hours, minutes;
        
        hours = (int) (seconds/60/60);
        seconds = seconds - (hours*60*60);
        
        minutes = (int) (seconds/60);
        
        seconds = seconds - (minutes*60);
        
        System.out.println("The time is " +hours+ ":" +minutes+ ":" +seconds);
        
    }
}