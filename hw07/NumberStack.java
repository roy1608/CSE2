//////////////////////////////////
/*
Deepankar Roy
Homework 7
Number Stack Program
for, while and do while loops
*/

//import scanner
import java.util.Scanner;

//add class
public class NumberStack {
    
    //main method
    public static void main(String[] args) {
        
        Scanner scan;
        scan = new Scanner (System.in);
        
        int x, y, z;
        String line = "0";
        String dash = "0";
        
        System.out.print("Enter a number between 1 and 9: ");
        int input = scan.nextInt();
        
        if (((input%1)==0)&&(input >= 1)&&(input <= 9)) {
            
            System.out.println("Using for loops:");
            for (x = 1; x <= input; x++) {
                switch (x) {
                    case 1:
                        line = "        1";
                        dash = "        -        ";
                        break;
                    case 2:
                        line = "       222 ";
                        dash = "       ---       ";
                        break;
                    case 3:
                        line = "      33333";
                        dash = "      -----      ";
                        break;
                    case 4:
                        line = "     4444444";
                        dash = "     -------     ";
                        break;
                    case 5:
                        line = "    555555555";
                        dash = "    ---------    ";
                        break;
                    case 6:
                        line = "   66666666666";
                        dash = "   -----------   ";
                        break;
                    case 7:
                        line = "  7777777777777";
                        dash = "  -------------  ";
                        break;
                    case 8:
                        line = " 888888888888888";
                        dash = " --------------- ";
                        break;
                    case 9:
                        line = "99999999999999999";
                        dash = "-----------------";
                        break;
                }
                for (y = x; y > 0; y--) {
                    System.out.println(line);
                }
                System.out.println(dash);
            }
            
            System.out.println("Using while loops");
            x = 0;
            z = input;
            while(z > 0) {
                x++;
                switch (x) {
                    case 1:
                        line = "        1";
                        dash = "        -        ";
                        break;
                    case 2:
                        line = "       222 ";
                        dash = "       ---       ";
                        break;
                    case 3:
                        line = "      33333";
                        dash = "      -----      ";
                        break;
                    case 4:
                        line = "     4444444";
                        dash = "     -------     ";
                        break;
                    case 5:
                        line = "    555555555";
                        dash = "    ---------    ";
                        break;
                    case 6:
                        line = "   66666666666";
                        dash = "   -----------   ";
                        break;
                    case 7:
                        line = "  7777777777777";
                        dash = "  -------------  ";
                        break;
                    case 8:
                        line = " 888888888888888";
                        dash = " --------------- ";
                        break;
                    case 9:
                        line = "99999999999999999";
                        dash = "-----------------";
                        break;
                }
                y = x;
                while (y > 0) {
                    y--;
                    System.out.println(line);
                }
                System.out.println(dash);
                z--;
            }
            
            System.out.println("Using do-while loops");
            x = 0;
            z = input;
            do {
                x++;
                switch (x) {
                    case 1:
                        line = "        1";
                        dash = "        -        ";
                        break;
                    case 2:
                        line = "       222 ";
                        dash = "       ---       ";
                        break;
                    case 3:
                        line = "      33333";
                        dash = "      -----      ";
                        break;
                    case 4:
                        line = "     4444444";
                        dash = "     -------     ";
                        break;
                    case 5:
                        line = "    555555555";
                        dash = "    ---------    ";
                        break;
                    case 6:
                        line = "   66666666666";
                        dash = "   -----------   ";
                        break;
                    case 7:
                        line = "  7777777777777";
                        dash = "  -------------  ";
                        break;
                    case 8:
                        line = " 888888888888888";
                        dash = " --------------- ";
                        break;
                    case 9:
                        line = "99999999999999999";
                        dash = "-----------------";
                        break;
                }
                y = x;
                do {
                    y--;
                    System.out.println(line);
                }
                while (y > 0);
                System.out.println(dash);
                z--;
            }
            while (z > 0);
        }
        else {
            System.out.println("You did not enter an integer within the range 1-9");
        }
    }
}