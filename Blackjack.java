/*
Chloe Arranza
Blackjack
*/
import java.util.*;

public class Blackjack {

  Deck d;
  ArrayList<Card> userHand;
  ArrayList<Card> compHand;

  public Blackjack() { //processy
    //create deck

      //create a userHand
      //create a compHand

  }

  //public Integer calculateHand(ArrayList<Card> h) { //mathy
    //return null;
/*
    int a;
     for(int i = 0; i < h.length; i++){
      a = a + i;
    }

    return a;


    if(i == 21){
      System.out.println("Congrats, You won!");
    }

    if(i >= 21){
      System.out.println("Boy, you went over. You lost.");
    }

    return null;
*/
  //}

  public static void main(String[] args) { //wordy
    Blackjack b = new Blackjack();

    System.out.println("Welcome to Blackjack.");
    System.out.println("Here is your hand: ");

    Blackjack c = new Blackjack();
      c.d.drawCard();
      c.userHand.add(c.d.drawCard());

      Blackjack e = new Blackjack();
      e.d.drawCard();
      e.userHand.add(e.d.drawCard());

      Blackjack compy = new Blackjack();
      compy.d.drawCard();
      compy.compHand.add(compy.d.drawCard());


    System.out.println("");
    //System.out.println("Value: " + value);
  //  System.out.println("Your opponent is showing a " + );



}

}
