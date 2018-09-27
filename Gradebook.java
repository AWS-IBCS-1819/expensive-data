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
    Scanner answer = new Scanner(System.in);
    String something = answer.nextLine();



//(5) Class Subject and Teacher Code
if(something.equals("5")){

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
  System.out.println("The class and teacher is: " + className);

}

//(6) Student Roster
if(something.equals("6")){

  StringBuilder studentRoster = new StringBuilder();
  StringBuilder spaces = new StringBuilder();
  StringBuilder studentGrades = new StringBuilder();

  try {
    File grades = new File("grades.txt");
    Scanner idk = new Scanner(grades);
    spaces.append(idk.next() + " ");
    spaces.append(idk.next() + " ");
    spaces.append(idk.next() + " ");
    spaces.append(idk.next() + " ");
    spaces.append(idk.next() + " ");
    while (idk.hasNext()) {
    studentRoster.append (idk.next() + " ");// append all the names into the StrinngBuilder for names
    studentRoster.append (idk.next() + " " + "\n");
    spaces.append(idk.next() + " ");
    studentGrades.append(idk.next() + " ");
  }
}

  catch (FileNotFoundException b){
    b.printStackTrace();
  }
  System.out.println("Here is a list of all the students: \n" + studentRoster);

}





  }
}

