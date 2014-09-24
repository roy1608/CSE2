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
        
        int hours, minutes, x;
        
        hours = (int) (seconds/60/60);
        seconds = seconds - (hours*60*60);
        
        minutes = (int) (seconds/60);
        
        seconds = seconds - (minutes*60);
        
        x = 0;
        if (minutes < 10) {
            x = 1;
        }
        if (seconds < 10) {
            x = 2;
        }
        if ((minutes < 10)&&(seconds < 10)) {
            x = 3;
        }
        
        switch (x) {
            case 1: System.out.println("The time is " +hours+ ":0" +minutes+ ":" +seconds);
            break;
            case 2: System.out.println("The time is " +hours+ ":" +minutes+ ":0" +seconds);
            break;
            case 3: System.out.println("The time is " +hours+ ":0" +minutes+ ":0" +seconds);
            break;
            default: System.out.println("The time is " +hours+ ":" +minutes+ ":" +seconds);
            break;
        }
    }
}