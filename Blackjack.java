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

//if the integer is 21 then the player won
    if(i == 21){
      System.out.println("Congrats, You won!");
    }
//if the integer is over 21, then the play
    if(i >= 21){
      System.out.println("Boy, you went over. You lost.");
    }

    return null;

  }
*/

  public static void main(String[] args) { //wordy


    Blackjack b = new Blackjack();

    System.out.println("Welcome to Blackjack.");
    System.out.println("Here is your hand: ");
  //  System.out.println(userHand);


    //draws the three cards
    //two for the user, one for the computer

      b.d.drawCard();
      b.userHand.add(b.d.drawCard());

      b.d.drawCard();
      b.userHand.add(b.d.drawCard());


    System.out.println(b.userHand.drawCard.get(0).getName);
    System.out.println(" ");
    System.out.println("This is the dealer's hand: ");
    //dealer's hand
      b.d.drawCard();
      b.compHand.add(b.d.drawCard());
    System.out.println(b.compHand.get(0).getName);
    System.out.println(" ");

    System.out.println("What would you like to do?");

    Scanner in = new Scanner (System.in);
    String name = in.nextLine();

    System.out.println("(1) Hit");
    System.out.println("(2) Stay");
    System.out.println("(3) Quit Game");

    //System.out.println("Value: " + value);
  //  System.out.println("Your opponent is showing a " + );

//hit needs a loop


}

}
