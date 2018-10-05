/*
Chloe Arranza
Deck Deck

*/

import java.util.*;

public class Deck{

  ArrayList<String> cards;

  public Deck(){

    cards = new ArrayList<String>();

    for (int d = 2; d <= 10; d++){
      cards.add( d + " Diamonds");
      cards.add ("Ace of Diamonds");
      if(d == 2){
        cards.add ("Ace of Diamonds");
      }
      if(d == 10){
        cards.add ("Jack of Diamonds");
        cards.add ("Queen of Diamonds");
        cards.add ("King of Diamonds");
      }
    }

    for (int c = 2; c <= 10; c++){
      cards.add( c + " Clubs");
      if(c==2){
          cards.add("Ace of Clubs");
      }
      if(c == 10){
        cards.add ("Jack of Clubs");
        cards.add ("Queen of Clubs");
        cards.add ("King of Clubs");
      }
    }

    for (int h = 2; h <= 10; h++){
      cards.add( h + " Hearts");
      if(h==2){
          cards.add("Ace of Hearts");
      }
      if(h == 10){
        cards.add ("Jack of Hearts");
        cards.add ("Queen of Hearts");
        cards.add ("King of Hearts");
      }
    }

    for (int s = 2; s <= 10; s++){
      cards.add( s + " Spades");
      if(s==2){
        cards.add("Ace of Spades");
      }
      if(s == 10){
        cards.add ("Jack of Spades");
        cards.add ("Queen of Spades");
        cards.add ("King of Spades");
      }
    }


  }
}
