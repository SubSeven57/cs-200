// CS 201
// Spring, 2019
// Assignment
// Daniel Hernandez Monroy

import java.util.Scanner;

   public class Menu {

   public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int menuChoice = 0;

    System.out.println("Choice 1: Labour");
    System.out.println("Choice 2: Supplies");

    System.out.println("What number is your choice? : ");
    menuChoice = keyboard.nextInt();

    if (menuChoice < 0 || menuChoice > 2) {
      System.out.println ("Choice is invalid.");
    } 4  e

    else if (menuChoice == 1) {
      System.out.println("You chose labour");

    }


  }
}
