/*
Kaitlin Tan
Chloe Arranza
9/19/2018
Gradebook
*/

import java.util.*;
import java.io.*;

public class Gradebook {

  public static void main(String[] args) {
    System.out.println("Welcome to the Student Gradebook, what would you like to see?");
    System.out.println("1. Mean grade \n 2. Grade Spread \n 3. Top Grade \n 4. Lowest Grade \n 5. Class Subject and Teacher \n 6. Student Roster");
/*
    String userIn = newIn.nextLine();
    Scanner newIn = new Scanner(System.in);

    if(userIn.equals("1")){
      System.out.println("The mean grade is ");
    }
    if(userIn.equals("2")){
      System.out.println("The grade spread is ");
    }
    if(userIn.equals("3")){
      System.out.println("The top grade is ");
    }
    if(userIn.equals("4")){
      System.out.println("The lowest grade is ");
    }
    if(userIn.equals("5")){
      System.out.println("The class subject and Teacher is ");
    }
    if(userIn.equals("6")){
      System.out.println("The student roster consists of ");
    }
*/

  //Mean Grade
  //File grades = new File("grades.txt");
  try {
    File grades = new File("grades.txt");
    Scanner sc = new Scanner(grades);


    while (sc.hasNext()) {
      gears.append(sc.next() + " ");
      count++;
  }

  catch (FileNotFoundException e) {
    e.printStackTrace();
  }
         String line = null;
         int sum = 0;
         int count = 0;
         while ((line = file.nextLine()) != null) {
             String[] vals = line.split(" ");
             for(int i = 0; i < vals.length; i++) {
                 sum += Integer.valueOf(vals[i].trim());
                 count++;
             }
         }
         System.out.println(((double) sum / count));
    }




  //C+P fix later
/*
    StringBuilder gears = new StringBuilder();

   int count = 0;
   try {
     File grades = new File("grades.txt");
     Scanner sc = new Scanner(grades);


     while (sc.hasNext()) {
       gears.append(sc.next() + " ");
       count++;
     }
   }

   catch (FileNotFoundException e) {
     e.printStackTrace();
   }



   int numG = 0;
   for (int i = 0; i < gears.length() - 4; i++) {
     if (gears.substring(i, i + 4).equals("")) {
       numG++;
     }
     else if (gears.substring(i, i + 4).equals("")) {
       numG++;
     }
   }
   //System.out.println(""); print out the value

   File grades = new File("grades.txt");
   String str = "";
        String[] -- = grades.split("%", ":");

        for (String a : grades)
            System.out.println(a);

 } */

  //}
//}
