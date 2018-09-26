/*
Kaitlin Tan
Chloe Arranza
----
Gradebook
*/

import java.util.*;
import java.io.*;

public class Gradebook {

  public static void main(String[] args) {
    System.out.println("Welcome to the Student Gradebook, what would you like to see?");
    System.out.println("1. Mean grade \n 2. Grade Spread \n 3. Top Grade \n 4. Lowest Grade \n 5. Class Subject and Teacher \n 6. Student Roster");

    //scans the grades doc and prints it our in a line
  /*  StringBuilder myStr = new StringBuilder();
    int count = 0;
    try {
      File grades = new File("grades.txt");
      Scanner sc = new Scanner(grades);


      while (sc.hasNext()) { //checks to see if our file is empty
        myStr.append(sc.next() + " ");
        //count++;
      }
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }
*/

    //System.out.println(myStr);

    StringBuilder className = new StringBuilder();

    try {
      File grades = new File("grades.txt");
      Scanner bc = new Scanner(grades);
        className.append(bc.next() + " ");
        className.append(bc.next() + " ");
        className.append(bc.next() + " ");
        className.append(bc.next() + " ");
        className.append(bc.next() + " ");
      }

    catch (FileNotFoundException c) {
      c.printStackTrace();
    }
    System.out.println(className);
  }
}



    //asfd



/*
    int numG = 0;
    for (int i = 0; i < myStr.length() - 12; i++) {
      if (myStr.substring(i, i + 12).equals("Dr. Anderson")) {
        numG++;
      }
      else if (myStr.substring(i, i + 12).equals("Dr. Anderson")) {
        numG++;
      }
    }
    System.out.println("The professor's name is: " + numG);

//grade spread
try{

  for (int j = 0; j < grades.length() - 5; j++) {
      if (grades.substring(j, j + 5).equals(>= 90.0)) {
          grade = 'A';
      } else if (grades.substring(j, j + 5).equals(>= 80.0)) {
          grade = 'B';
      } else if (grades.substring(j, j + 5).equals(>= 70.0)) {
          grade = 'C';
      } else if (grades.substring(j, j + 5).equals(>= 60.0)) {
          grade = 'D';
      } else {
          grade = 'F';
      }
    System.out.println("The grades of the studnets are " + grade);

}
}
*/


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
