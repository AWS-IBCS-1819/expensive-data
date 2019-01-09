import java.util.*;

// Recommender.java
// This program holds all of the methods and
// variables for recommending a movie for a friend
// to watch.
// The two approaches here are content-based filtering
// and collaborative filtering. They both read files
// that have respective data in order to score the movies.
// The program outputs a list of the top 3 recommendations
// for that person.

public class Recommender {

  public void collaborative(String movieName) {

    try {
    File file = new File("collab.txt");
    Scanner collabo = new Scanner(file);
    StringBuilder no = new StringBuilder();
    String temp = collabo.next();

    while (collabo.hasNext()){
      no.append(collabo.next() + " ");

      }

    }

    catch (FileNotFoundException collab){
      collab.printStackTrace();
    }

    //print top 3 recommendations
  }

  public void contentBased(String movieName) {
    
    try {
    File file = new File("content.txt");
    Scanner concon = new Scanner(file);
    StringBuilder yes = new StringBuilder();
    String tent = concon.next();

    while (concon.hasNext()){
      yes.append(concon.next() + " ");

      }
    }

    catch (FileNotFoundException content){
      content.printStackTrace();
    }

    //print top 3 recommendations
  }

  public static void main(String[] args) {
    System.out.println("Welcome, please pick a movie you have seen: ");
    System.out.println("Avengers:InfinityWar \n ReadyPlayerOne \n Spiderman:Homecoming \n It \n Room \n Coco \n Up \n TheBigShort \n Arrival \n EdgeofTomorrow \n Zootopia \n Her \n ToyStory3 \n ThePerksOfBeingAWallFlower ");
    System.out.println("Please type the movie here: ");
    Scanner input = new Scanner(System.in);
    //call recommendation methods

    //if possible go again
  }
}
