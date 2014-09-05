//////////////////////////////////////////
/*
Deepankar Roy
Lab 2
09/05/14
Cyclometer Java Program
    Keep track of time elapsed in seconds
    and number of rotations of the front wheel in that time
    For two trips, given time and number of rotations,
    Print:
        a)number of minutes each trip
        b)number of counts each trip
        c)distance of each trip in miles
        d)distance for the two trips combined
*/

//define class
public class Cyclometer{
    
//add main method
    public static void main(String[] args)  {
        
        //input data
        int secsTrip1=480; //time in seconds for trip 1
        int secsTrip2=3220; //time in seconds for trip 2
        int countsTrip1=1561; //number of rotations of front wheel during trip 1
        int countsTrip2=9037; //number of rotations of front wheel during trip 2
        
        //our intermediate variables and output data
        double wheelDiameter=27.0; //diameter of wheel
        double PI=3.14159; //value of pi
        int feetPerMile=5280; //feets per mile
        int inchesPerFoot=12; //inches per foot
        int secondsPerMinute=60; //seconds per minute
        double distanceTrip1, distanceTrip2,totalDistance; //variables for distance for trips 1 and 2, and the total distance
        
        //print out the numbers stored as variables
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
        
        //run the calculations; store the values. Document your
        //calculation here. What are you calculating?
        //
        //
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile; // Gives distance in miles for trip 1
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; // Gives distance in miles for trip 2
        totalDistance=distanceTrip1+distanceTrip2; // Gives distance of both trips combined
        
        //Print out the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
        
    }//end main method
}//end class