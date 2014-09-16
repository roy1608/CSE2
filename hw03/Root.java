//////////////////////////////////////////
/*
Deepankar Roy
Homework 3
Program #2
09/14/14
Prompt user to
    -enter a double
Print
    -a crude estimate
    -the value when the crude estimate is cubed
*/

//import scanner
import java.util.Scanner;

//define class
public class Root{
    
    //add main method
    public static void main(String[] args)  {
        
        Scanner ask; //declare scanner
        ask = new Scanner (System.in); //construct instance
        
        //input data
        System.out.print("Enter a double, I'll print the cube root: "); //prompt for a double
        double x = ask.nextDouble();
        
        //operations
        double guess = x/3;
        double estimate = (2*guess*guess*guess+x)/(3*guess*guess); //improvment 1
       
        guess = estimate;
        estimate = (2*guess*guess*guess+x)/(3*guess*guess); //improvment 2
        
        guess = estimate;
        estimate = (2*guess*guess*guess+x)/(3*guess*guess); //improvment 3
       
        guess = estimate;
        estimate = (2*guess*guess*guess+x)/(3*guess*guess); //improvment 4
       
        guess = estimate;
        estimate = (2*guess*guess*guess+x)/(3*guess*guess); //improvment 5
        
        System.out.println("The cube root is " +estimate+ ":"); //print out cube root
        System.out.println( +estimate+ "*" +estimate+ "*" +estimate+ "=" +estimate*estimate*estimate ); //print cube of the estimate
        
    }
} 