import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");//ask for input
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();//while there are less than 10 values, add the next value into the array
      }
      String out="The array ";//start forming the right output statement
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){//if hasDups returns true then
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";//the second statement that has informations about exactly one duplicate
      out+=listArray(num);    
      if(exactlyOneDup(num)){//if exactlyOneDup returns true as well then
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");//ask if user wants to go again
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));//while input is Y, repeat
  }

  public static String listArray(int num[]){//puts the integers entered into array for {1,2}
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
  
  public static boolean hasDups(int num[]) {//checks if there are duplicates
      int count = 0;
      for (int x = 0; x < num.length; x++) {
          for (int y = x+1; y< num.length; y++) {
              if (num[x] == num[y]) {//if there is a duplicate, increase count
                  count++;
              }
              if (count > 0) {//if there is more than 0., return true
                  return true;
              }
          }
      }
      return false;
  }
  
  public static boolean exactlyOneDup(int num[]) {
      int count = 0;
      for (int x = 0; x < num.length; x++) {
          for (int y = x+1; y< num.length; y++) {
              if (num[x] == num[y]) {//if there is a duplicate , count increases by one
                  count++;
              }
              if (count > 1) {//if theres less than one duplicate, return false
                  return false;
              }
          }
      }
      return true;
  }
  
}