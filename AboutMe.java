/*
Chloe Arranza
September 13, 2018
AboutMe
*/

/*
When you look at many people's Instagram Bios, many of them are very similar
That's why I wanted to make an "Instant Insta Bio Maker"
Because everyone typically has SOMETHING one this list
*/

import java.util.*;

public class AboutMe{

  //these are the variables
  public static String name;
  public static String sign;
  public String adj;
  public static String place;
  public String quote;
  public static String tvShow;
  public static String animal;

//Julia's info
  public AboutMe() {

    name = "Julia Zhu";
    sign = "*Scorpio*";
    adj = "Chinese//Dog Lover ";
    place = "!Beijing!";
    quote = "~I'm hopelessly awkward and desperate for love~";
    tvShow = "Friends :)";
    animal = "Dog Lover <3";

  }

  public static void main(String[] args) {

//starting point
    AboutMe Julia = new AboutMe();
    System.out.println(" ");
    System.out.println("~*~ Welcome to the Instant Insta Bio Creator! ~*~");
    System.out.println(" ");
    System.out.println("^ - ^  This is your current Insta Bio for: @juliazhu  ^ - ^");
    System.out.println(" ");
    System.out.println(" ");
    //choose which one you would like to see from Julia's Profile
    //also, this line of code is very long, but when i tried to format it, it wouldn't work anymore
    System.out.println("What would you like to view? \n (Name) \n (Sign) \n (2 Words) \n (Place) \n (Social Security Number) \n (Quote) \n (TV Show) \n (Animal)");
    System.out.println("Or you can change these options: \n (Change 2 Words) \n (Change Quote)");
    Scanner newIn = new Scanner(System.in); //scanner for answer

    // all possible outcomes
    String userIn = newIn.nextLine();
    if(userIn.equals("Name")){
      System.out.println("This user's name is " + Julia.name);
    }
    if(userIn.equals("Sign")){
      System.out.println("This user's sign is " + Julia.sign);
    }
    if(userIn.equals("2 Words")){
      System.out.println("The words that best describe this user is " + Julia.adj);
    }
    if(userIn.equals("Place")){
      System.out.println("This user is from " + Julia.place);
    }
    if(userIn.equals("Quote")){
      System.out.println("This user's favorite quote is " + Julia.quote);
    }
    if(userIn.equals("TV Show")){
      System.out.println("This user's favorite TV Show is " + Julia.tvShow);
    }
    if(userIn.equals("Animal")){
      System.out.println("This user's favorite animal is " + Julia.animal);
    }
    //the code for changing the possible variables
    if(userIn.equals("Change 2 Words")){
      System.out.println("I will generate two random words for your bio...");
      System.out.println(" ");
      System.out.println(" ");
      System.out.println("Your two new words are Influencer and Professional BasketBALLER");
    }
    if(userIn.equals("Change Quote")){
      System.out.println("I will generate a new quote for your bio...");
      System.out.println(" ");
      System.out.println(" ");
      System.out.println("Your new quote is !Carnivorous Plants are the best!");
    }
    //just for fun :)
    if(userIn.equals("Social Security Number")){
      System.out.println("I'm sorry, it seems to be that you are not actually @juliazhu.");
      System.out.println("So you do not have permission to access this part of the program.");
      System.out.println("Have a great day!");
    }



    newIn.close();
    }

  }
