///////////////////////////////////////////////////////////////////////////
/*
Deepankar Roy
09/30/14
Homework 5

Burger King Program

prompt to enter a choice of Burger Soda or Fries (B,b,S,s,F,f)
ptompt for details 
    burger - All,cheese,none
    soda - pepsi,coke,sprite,mountain dew
    fries - large, small
print order summary
*/

//import Scanner
import java.util.Scanner;

//make class
public class BurgerKing {
    
    //add main method
    public static void main(String[] args) {
        
        Scanner myScanner; //declare scanner
        myScanner = new Scanner (System.in);
        
        System.out.print("Enter a letter to indicate a choice of Burger (B or b), Soda (S or s), Fries (F or f): ");
        String input = myScanner.next();
        
        if (input.length() != 1) {
            System.out.println("Just one character expected");
        }
        
        else if ((input.charAt(0) != 'B')&&(input.charAt(0) != 'b')&&(input.charAt(0) != 'S')&&(input.charAt(0) != 's')&&(input.charAt(0) != 'F')&&(input.charAt(0) != 'f')) {
            System.out.println("You did not enter one of the options: B,b,S,s,F,f");
        }
        
        else if ((input.charAt(0) == 'B')||(input.charAt(0) == 'b')) {
            System.out.print("Enter A or a for 'all the fixins', C or c for cheese, N or n for none of the above: ");
            String toppings = myScanner.next();
            
            if (toppings.length() != 1) {
                System.out.println("Just one character expected");
            }
            
            else if ((toppings.charAt(0) != 'A')&&(toppings.charAt(0) != 'a')&&(toppings.charAt(0) != 'C')&&(toppings.charAt(0) != 'c')&&(toppings.charAt(0) != 'N')&&(toppings.charAt(0) != 'n')) {
                System.out.println("You did not enter one of the options: A,a,C,c,N,n");
            }
            
            else if ((toppings.charAt(0) == 'A')||(toppings.charAt(0) == 'a')) {
                System.out.println("You ordered a burger with all the fixins");
            }
            
            else if ((toppings.charAt(0) == 'C')||(toppings.charAt(0) == 'c')) {
                System.out.println("You ordered a burger with cheese");
            }
            
            else if ((toppings.charAt(0) == 'N')||(toppings.charAt(0) == 'n')) {
                System.out.println("You ordered a burger with no toppings");
            }
        }
        
        else if ((input.charAt(0) == 'S')||(input.charAt(0) == 's')) {
            System.out.print("Would you like Pepsi (P or p), Coke (C or c), Sprite (S or s), or Mountain Dew (M or m): ");
            String choice = myScanner.next();
            
            if (choice.length() != 1) {
                System.out.println("Just one character expected");
            }
            
            else if ((choice.charAt(0) != 'P')&&(choice.charAt(0) != 'p')&&(choice.charAt(0) != 'C')&&(choice.charAt(0) != 'c')&&(choice.charAt(0) != 'S')&&(choice.charAt(0) != 's')&&(choice.charAt(0) != 'M')&&(choice.charAt(0) != 'm')) {
                System.out.println("You did not enter one of the options: P,p,C,c,S,s,M,m");
            }
            
            else if ((choice.charAt(0) == 'P')||(choice.charAt(0) == 'p')) {
                System.out.println("You ordered a Pepsi");
            }
            
            else if ((choice.charAt(0) == 'C')||(choice.charAt(0) == 'c')) {
                System.out.println("You ordered a Coke");
            }
            
            else if ((choice.charAt(0) == 'S')||(choice.charAt(0) == 's')) {
                System.out.println("You ordered a Sprite");
            }
            
            else if ((choice.charAt(0) == 'M')||(choice.charAt(0) == 'm')) {
                System.out.println("You ordered a Mountain Dew");
            }
        }
        
        else if ((input.charAt(0) == 'F')||(input.charAt(0) == 'f')) {
            System.out.print("Would you like Large (L or l) or Small (S or s) order of fries: ");
            String size = myScanner.next();
            
            if (size.length() != 1) {
                System.out.println("Just one character expected");
            }
            
            else if ((size.charAt(0) != 'L')&&(size.charAt(0) != 'l')&&(size.charAt(0) != 'S')&&(size.charAt(0) != 's')) {
                System.out.println("You did not enter one of the options: L,l,S,s");
            }
            
            else if ((size.charAt(0) == 'L')||(size.charAt(0) == 'l')) {
                System.out.println("You ordered Large fries");
            }
            
            else if ((size.charAt(0) == 'S')||(size.charAt(0) == 's')) {
                System.out.println("You ordered Small fries");
            }
        }
    }
}