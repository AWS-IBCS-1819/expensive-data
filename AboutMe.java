/*
Chloe Arranza
September 13, 2018
AboutMe
*/

import java.util.*;

public class AboutMe{

  //make the varibles
  public static String username;
  public static String name;
  public static String sign;
  public String adj;
  public String place;
  public String quote;

  public AboutMe() {
    username = "juliazhu"; // name
    name = "Julia Zhu";
    sign = "*Scorpio*";
    adj = "Chinese//Dog Lover ";
    place = "!Beijing!";
    quote = "~I'm hopelessly awkward and desperate for love~";

  }

  public static void main(String[] args) {

    AboutMe Julia = new AboutMe();
    System.out.println(" ");
    System.out.println("~*~ Welcome to the Instant Insta Bio Creator! ~*~");
    System.out.println(" ");
    System.out.println("^ - ^  This is your current Insta Bio for: @juliazhu  ^ - ^");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("What would you like to view? \n (Name) \n (Sign) \n (2 Words) \n (Place) \n (Quote)");
    Scanner newIn = new Scanner(System.in);

    String userIn = newIn.nextLine();
    if (userIn.equals("Name")){
      System.out.println("This user's name is " + Julia.name);
    }
    if (userIn.equals("Sign")){
      System.out.println("This user's sign is " + Julia.sign);
    }
    if (userIn.equals("2 Words")){
      System.out.println("The words that best describe this user is " + Julia.adj);
    }
    if (userIn.equals("Place")){
      System.out.println("This user is from " + Julia.place);
    }
    if(userIn.equals("Quote")){
      System.out.println("This user's favorite quote is " + Julia.quote);
    }

    newIn.close();

    System.out.println(" ");
    System.out.println(" ");
    System.out.println("What would you like to change? \n (Change 2 Words) \n (Change Quote) ");
    Scanner change = new Scanner(System.in);

    String boy = change.nextLine();

    if (boy.equals("Change 2 Words")){
      System.out.println("I will generate two random words for your bio...");
      System.out.println(" ");
      System.out.println(" ");
      System.out.println("Your two new words are Influencer and Professional BasketBALLER");
    }
    if (boy.equals("Change Quote")){
      System.out.println("I will generate a new quote for your bio...");
      System.out.println(" ");
      System.out.println(" ");
      System.out.println("Your new quote is !Carnivorous Plants are the best!");
    }

    change.close();
    }

  }
