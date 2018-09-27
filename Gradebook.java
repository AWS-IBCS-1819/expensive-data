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

//(1) Mean Grade


//(2) Grade Spread
if(something.equals("2")){

  StringBuilder studentGrades = new StringBuilder();
  StringBuilder freeSpace = new StringBuilder();

  try {
    File grades = new File("grades.txt");
    Scanner hey = new Scanner(grades);
      freeSpace.append(hey.next() + " ");
      freeSpace.append(hey.next() + " ");
      freeSpace.append(hey.next() + " ");
      freeSpace.append(hey.next() + " ");
      freeSpace.append(hey.next() + " ");

      while (hey.hasNext()) {
      freeSpace.append (hey.next() + " ");
      freeSpace.append (hey.next() + " " + "\n");
      freeSpace.append(hey.next() + " ");
      studentGrades.append(hey.next() + " ");
    }

  }

  catch (FileNotFoundException maybe){
    maybe.printStackTrace();
  }

  System.out.println("Here are all the grades: \n " + studentGrades);

}

//(3) Top Grade


//(4) Lowest Grade


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


  try {
    File grades = new File("grades.txt");
    Scanner idk = new Scanner(grades);
    spaces.append(idk.next() + " ");
    spaces.append(idk.next() + " ");
    spaces.append(idk.next() + " ");
    spaces.append(idk.next() + " ");
    spaces.append(idk.next() + " ");
    while (idk.hasNext()) {
    studentRoster.append (idk.next() + " ");
    studentRoster.append (idk.next() + " " + "\n");
    spaces.append(idk.next() + " ");
    spaces.append(idk.next() + " ");
  }
}

  catch (FileNotFoundException b){
    b.printStackTrace();
  }
  System.out.println("Here is a list of all the students: \n" + studentRoster);

}





  }
}
