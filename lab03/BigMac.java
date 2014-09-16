//////////////////////////////////////////
/*
Deepankar Roy
Lab 3
09/12/14
BigMac Java Program
    Compute the cost of buying Big Macs.
    Use Scanner class to obtain inputs:
        -number of Big Macs
        -cost per Big Mac
        -tax (6% PA, 8%MA)
*/

//import scanner
import java.util.Scanner;

//define class
public class BigMac{
    
//addmain method
    public static void main(String[] args)  {
     
     Scanner myScanner; //declare scanner
     myScanner = new Scanner (System.in); //construct instance
     
     //input data
     System.out.print("Enter the number of Big Macs (an integer > 0): ");//prompt for input
     int nBigMacs = myScanner.nextInt();
     
     System.out.print("Enter the cost per Big Mac as" + "a double (in the form xx.xx): ");
     double bigMac$ = myScanner.nextDouble();
     
     System.out.print("Enter the percent tax as a whole number (xx): ");
     double taxRate = myScanner.nextDouble();
     taxRate/=100; //user enters percent, but I want proportion
     
     //output data
     double cost$;
     int dollars, dimes, pennies;
     
     cost$ = nBigMacs*bigMac$*(1 + taxRate);
     
     dollars = (int) cost$; //drop decimals to ge ta whole number
     //get dimes and pennies amount, e.g., 
     // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
     //  where the % (mod) operator returns the remainder
     //  after the division:   583%100 -> 83, 27%5 -> 2 
     dimes = (int) (cost$*10)%10;
     pennies = (int) (cost$*100)%10;
     
     System.out.println("The total cost of " +nBigMacs+ "Big Macs, at $" +bigMac$+
     " per Big Mac, with a sales tax of " +(int) (taxRate*100)+ 
     "%, is $" +dollars+'.'+dimes+pennies); //print statment
        
    }
}