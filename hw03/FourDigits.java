//////////////////////////////////////////
/*
Deepankar Roy
Homework 3
Program #2
09/16/14
Prompt the user to 
    - input a double
print
    -first four digits to the right of the decimal point
*/

//import scanner
import java.util.Scanner;

//define class
public class FourDigits {
    
//addmain method
    public static void main(String[] args)  {
     
     Scanner ask; //declare scanner
     ask = new Scanner (System.in); //construct instance
     
     //input data
     System.out.print("Enter a double and I'll display the first four digits to the right of the decimal point: "); //prompt to enter the double
     double x = ask.nextDouble();
     
     //output data
     int tenths, hundredths, thousandths, tenthousandths;
     
     tenths = (int) (x*10)%10;
     hundredths = (int) (x*100)%10;
     thousandths = (int) (x*1000)%10;
     tenthousandths = (int) (x*10000)%10;
     
     //print
     System.out.println("The four digits are " +tenths+hundredths+thousandths+tenthousandths);
     
    }
    
}