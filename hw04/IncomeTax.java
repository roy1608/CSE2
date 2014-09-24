///////////////////////////////////////////////////////////////////////////////
/*
Deepankar Roy
Homework 4
09/22/14

Income Tax Program:
Prompt user to
    -enter an int value that gives thousands of dollars of income
Print
    -the amount of tax on the income given the following (progressive) schedule:
    <20, 5%;  >=20 and < 40, 7%; >=40 and < 78, 12%; >=78, 14%
*/

//import scanner
import java.util.Scanner;
import java.util.InputMismatchException;

//define class
public class IncomeTax {
    
    //add main method
    public static void main(String[] args)  {
        
        Scanner myScanner; //declare scanner
        myScanner = new Scanner (System.in); //construct scanner
        
        try {
        
        //input data
        System.out.print("Enter an int giving the number of thousands of dollars: ");
        int income = myScanner.nextInt();
        
        //intermediate variables
        double taxPercent, tax, taxFinal;
        
        //operations
        int money = income*1000 ;
        
        //output data
        if ( income < 0 ) {
            System.out.println("You did not enter a positive int");
        }
        if ( income >= 0 ) {
            if ( income < 20 ){
            taxPercent = 5.0 ;
            tax = ((double) money)*(taxPercent/100) ;
            taxFinal = ((double)((int)(tax*10)))/10 ;
            System.out.println("The tax rate on $" +income+ ",000 is " +taxPercent+ "%, and the tax is $" +taxFinal );
        }
        }
        if ( income >= 20 ) {
            if ( income < 40 ){
            taxPercent = 7.0 ;
            tax = ((double) money)*(taxPercent/100) ;
            taxFinal = ((double)((int)(tax*10)))/10 ;
            System.out.println("The tax rate on $" +income+ ",000 is " +taxPercent+ "%, and the tax is $" +taxFinal );
        }
        }
        if ( income >= 40 ) {
            if ( income < 78 ){
            taxPercent = 12.0 ;
            tax = ((double) money)*(taxPercent/100) ;
            taxFinal = ((double)((int)(tax*10)))/10 ;
            System.out.println("The tax rate on $" +income+ ",000 is " +taxPercent+ "%, and the tax is $" +taxFinal );
        }
        }
        if ( income >= 78 ) {
            taxPercent = 14.0 ;
            tax = ((double) money)*(taxPercent/100) ;
            taxFinal = ((double)((int)(tax*10)))/10 ;
            System.out.println("The tax rate on $" +income+ ",000 is " +taxPercent+ "%, and the tax is $" +taxFinal );
        }
        }
        catch (InputMismatchException e) {
            System.out.println("You did not enter an int");
        }
    }
}