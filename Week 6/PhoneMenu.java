// Assignment
// Daniel Hernandez Monroy

import java.util.Scanner;

   public class PhoneMenu {

   public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    
    int dial = 0;
    
    System.out.println("Hello you have reached The Konqr Company. Please pick from the following so we can  better assist you.");
    System.out.println("Please dial 1 if you're a new customer.");
    System.out.println("2 if you want to add someone to your account.");
    System.out.println("3 if you forgot your username.");
    System.out.println("4 if you need to reset your password.");
    System.out.println("5 if you're having issues getting into your online account.");
    System.out.println("6 if you're having issues accessing your account on your mobile app.");
    System.out.println("7 if you need to make a payment arrangement.");
    System.out.println("8 if you are having payment issues.");
    System.out.println("9 if you want to remove someone from your account.");
    System.out.println("0 if you want to cancel your Konqr account.");
    
    dial = keyboard.nextInt();
    
    if (dial < 0 || dial > 9)
    {
      System.out.println("Invalid Selection. please try again and pick a valid option");
    }
      else if (dial == 1 || dial == 2)
    {  
    System.out.println("You are now being transfered to the activations department");
    }
    else if (dial == 3 || dial == 4)
    {  
    System.out.println("You are now being transfered to the account recovery department");
    }
    else if (dial == 5 || dial == 6)
    {  
    System.out.println("You are now being transfered to the account services department");
    }

    else if (dial == 7 || dial == 8)
    {  
    System.out.println("You are now being transfered to the account payments department");
    }
    
    else
    {  
    System.out.println("You are now being transfered to the cancelation department");
    }

    
    
    
    
    
    
    
    }

  
}
