// Assignment
// Daniel Hernandez Monroy

import java.util.Scanner;

   public class CallCenter {

   public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int choice = 0;

    System.out.println("Welcome to SubSeven Designs Call Support!");
    System.out.println("Please choose an option: \n Press 1 for design\n Press 2 for development\n Press 3 for invoices\n Press 4 for support\n");
    System.out.print("Dial a number now: ");
    choice = keyboard.nextInt();

    if (choice < 0 || choice > 9) {
      System.out.println("Choice is invalid. Goodbye");
    }

    else if (choice == 1 || choice == 2 ) {
      System.out.println("You have reached the development unit. How can we help?");
    }

    else if (choice == 3 || choice == 4) {
      System.out.println("You have reached customer support. How can we help?");

    }

    else {
      System.out.println("Sorry. All representatives are currently busy. Please try later");
    }



  }
}
