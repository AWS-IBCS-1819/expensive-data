/*
Chloe Arranza
October 5, 2018
reverseRecursion
*/

import java.util.*;

public class reverseRecursion{


    public static void main(String[] args){


        String reverseString = "";

        System.out.println("This method uses Recursion to reverse the string.");
        System.out.println("Please enter what you want reversed: ");


        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();


        StringBuilder firstString = new StringBuilder(first);


        String secondString = firstString.reverse().toString();


        System.out.println("Your reversed string is: "+secondString);
    }
}
