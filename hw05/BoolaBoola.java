///////////////////////////////////////////////////////////////////////////
/*
Deepankar Roy
09/30/14
Homework 5

Boola Boola program

3 boolean statement get randomly assigned true or false
then they get randomly grouped with && or ||
then ask user if the statemnt is true or false
print correct or wrong
*/

//import scanner
import java.util.Scanner;

//add class
public class BoolaBoola {
    
    //add main method
    public static void main(String[] args) {
        
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        int x = (int) (Math.random()*2);
        int y = (int) (Math.random()*2);
        int z = (int) (Math.random()*2);
        int q = (int) (Math.random()*2);
        int w = (int) (Math.random()*2);
        
        
        if (x == 0) {
            String A = "False";
        }
        else {
            String A = "True";
        }
        
        if (y == 0) {
            String B = "False";
        }
        else {
            String B = "True";
        }
        
        if (z == 0) {
            String C = "False";
        }
        else {
            String C = "True";
        }
        
        System.out.print("Does " +A+ " " +q+ " " +B+ " " +w+ " " +C+ " have the value true (T/t) or false (F/f): ");
        String input = myScanner.next();
        
        if ((input.charAt(0) == 'T')||(input.charAt(0) == 't')) {
            System.out.println("Correct");
        }
        else {
            System.out.println("Wrong; try again");
        }
    }
} 