///////////////////////////////////////////////////////////////////////////////
/*
Deepankar Roy
Homework 4
09/23/14

Course Number Program:
prompt
    enter 6 digit int
    first 4 are year, last 2 are semester
        1865-2014; 10 spring, 20 summer1, 30 summer2, 40 fall
print out 
    the semester and year
*/

//import scanner
import java.util.Scanner;

//define class
public class CourseNumber {
    
    //add main method
    public static void main(String[] args) {
        
        Scanner myScanner; //declare scanner
        myScanner = new Scanner (System.in); //construct scanner
        
        //input data
        System.out.print("Enter a six digit number giving the course semester: ");
        int number = myScanner.nextInt();
        
        if ((number < 186510)||(number > 201440)) {
            System.out.println("The number is outside the range [186510,201440]");
        }
        else {
            int semester = (number % 100);
            int year = (int) (number/100);
            
            switch (semester) {
                case 10: System.out.println("The course was offered in the Spring semester of " +year);
                    break;
                case 20: System.out.println("The course was offered in the Summer 1 semester of " +year);
                    break;
                case 30: System.out.println("The course was offered in the Summer 2 semester of " +year);
                    break;
                case 40: System.out.println("The course was offered in the Fall semester of " +year);
                    break;
                default: System.out.println(+semester+ " is not a legitimate semester");
                    break;
            }
        }
    }
}