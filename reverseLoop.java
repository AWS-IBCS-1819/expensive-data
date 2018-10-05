/*
Chloe Arranza
October 5, 2018
Reverse (String)

*/

import java.util.*;

public class reverseLoop{

   public static void main(String args[]){

     //created two strings. one that will be used as what the user types
     //the other will be used as what is the reverse of that statement
      String first = "";
      String second = "";
      //scanner to get the user's word of choice to be reversed
      Scanner in = new Scanner(System.in);

      //I just wanted to make it clear that this is the loop method of reversing the string
      System.out.println("This reverse uses the looping method.");
      System.out.println("Please insert what you would like to be reversed: ");
      first = in.nextLine();

      int length = first.length();

      //this is the loop. you take the int length of the statement and minus one until greater/equal to 0
      //i made it go backwards by using -- instead of ++
      for (int i = length - 1 ; i >= 0 ; i--)

      //As i searched, i used charAt meaning it
      //"returns the character located at the String's specified index"
         second = second + first.charAt(i);

         //printed out the statement reversed
      System.out.println("The reverse of the string is: " + second);
   }
}
