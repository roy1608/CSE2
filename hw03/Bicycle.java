//////////////////////////////////////////
/*
Deepankar Roy
Homework 3
Program #1
09/10/14
Promt the user to input two values
    1) Counts on cyclometer
    2) nuumber of seconds during which the counts occured
Print out
    1) distance traveled in miles
    2) average speed in miles per hour
Assumptions
    1) diameter of the wheel is 27 inches.
*/

//import scanner
import java.util.Scanner;

//define class
public class Bicycle{
    
//add main method
    public static void main(String[] args)  {
        
        Scanner ask; //declare scanner
        ask = new Scanner (System.in); //construct imstance
        
        //input data
        System.out.print("Enter the time in seconds over which the counts occured (integer value): "); //primpt for time input
        int seconds = ask.nextInt();
        
        System.out.print("Enter number of counts on cyclometer (integer value): "); //prompt for counts input
        int counts = ask.nextInt();
        
        //intermediate variables and output data
        double wheelDiameter=27.0; //diameter of wheel
        double PI=3.14159; //value of pi
        int feetPerMile=5280; //feets per mile
        int inchesPerFoot=12; //inches per foot
        int secondsPerMinute=60; //seconds per minute
        int minutesPerHour=60; //minutes per hour
        double distance, minutes, speed; //variables for distance and speed
        
        //calculations
        distance = counts*wheelDiameter*PI/inchesPerFoot/feetPerMile; //gives distance in miles
        double Distance = (int) (distance*100)/(double) 100; //limit to 2 decimals
        minutes = seconds/secondsPerMinute; //time in minutes
        double Minutes = (int) (minutes*100)/(double) 100; //limit to 2 decimals
        speed = distance/seconds*secondsPerMinute*minutesPerHour; //average speed in miles per hour
        double Speed = (int) (speed*100)/(double) 100; //limit to 2 decimals
        
        //print output data
        System.out.println("The distance was " +Distance+ " miles and took " +Minutes+ " minutes. ");
        System.out.println("The average mph was " +Speed );
        
    }
    
}