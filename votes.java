/*
Chloe Arranza
November 2, 2018
Voting
*/


import java.util.*;
import java.io.*;

public class votes{

  public static void main(String[] args) {
    System.out.println("How many times did Mr. Considine type a teacher's name?");
    System.out.println("Let's see!");
    StringBuilder hello = new StringBuilder();
    StringBuilder bye = new StringBuilder();
    StringBuilder ciao = new StringBuilder();


    try{
      File file = new File("votes.txt");
      Scanner m = new Scanner(file);

      for (int i = 0; i < 10;i++){
        hello.append(m.next() + " ");
      }

      while(m.hasNext()) {
        hello.append(m.next() + " ");
        hello.append(m.next() + "\n");
        bye.append(m.next());
        ciao.append(m.next());
      }

    }

    catch (FileNotFoundException e){
      e.printStackTrace();
    }

  }
}
