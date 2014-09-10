//////////////////////////////////////////
/*
Deepankar Roy
Homework 2
09/09/14
Arithmetic Java Program
    computing cost of items bought including the PA sales tax of 6%
*/

//define class
public class Arithmetic{
    
//add main method
    public static void main(String[] args)  {
        
        //input data
        
        int nSocks=3; //number of pairs of socks bought
        double sockCost$=2.58; //cost of a pair of socks ('$' is part of name)
        
        int nGlasses=6; //number of drinking glasses
        double glassCost$=2.29;//cost of a glass ('$' is part of name)

        int nEnvelopes=1; //number of envelopes
        double envelopeCost$=3.25; //cost of envelopes ('$' is part of name)

        double taxPercent=0.06; //tax percentage
        
        /*output data
            Total cost of each kind of item; sales tax for that total cost
            Total cost of purchases (before tax)
            Total actually paid for this transaction, including sales tax.
        */
        
        //runing calculations
        
        double totSocks=nSocks*sockCost$; //total cost of socks
        double taxsocks=totSocks*taxPercent; //tax on socks
        double taxSocks=(int)Math.round(taxsocks*100)/(double)100; //Convert to 2 decimal places
        double totGlasses=nGlasses*glassCost$; //total cost of glasses
        double taxglasses=totGlasses*taxPercent; //tax on glasses
        double taxGlasses=(int)Math.round(taxglasses*100)/(double)100; //Convert to 2 decimal places
        double totEnvelopes=nEnvelopes*envelopeCost$; //total cost of envelopes
        double taxenvelopes=totEnvelopes*taxPercent; //tax on envelopes
        double taxEnvelopes=(int)Math.round(taxenvelopes*100)/(double)100; //Convert to 2 decimal places
        double totCost=totSocks+totGlasses+totEnvelopes; //total cost of purchase before tax
        double tottax=taxSocks+taxGlasses+taxEnvelopes; //total tax on the sale
        double totTax=(int)Math.round(tottax*100)/(double)100; //Convert to 2 decimal places
        double totPaid=totCost+totTax; //total actually paid, inculding sales tax
        
        //print output
        System.out.println("Name of Item:       Socks  |  Drinking Glasses  |  Envelopes"); //printing the item being bought
        System.out.println("Quantity:               "+nSocks+"  |                 "+nGlasses+"  |          "+nEnvelopes+""); //printing the quantity of each item
        System.out.println("Cost per item:      $"+sockCost$+"  |             $"+glassCost$+"  |      $"+envelopeCost$+""); //printing cost per item
        System.out.println("Total Cost:         $"+totSocks+"  |            $"+totGlasses+"  |      $"+totEnvelopes+""); //printing totals before tax
        System.out.println("sales tax (6%):     $"+taxSocks+"  |             $"+taxGlasses+"  |       $"+taxEnvelopes+""); //printing tax for each item
        System.out.println(""); //spacing
        System.out.println("Total Cost of Purchase: $"+totCost+""); //Total before tax
        System.out.println("Total Sales tax (6%):   $"+totTax+""); //total Sales tax
        System.out.println("");
        System.out.println("Grand Total Due: $"+totPaid+""); //total due including tax
        
    } 
}