// CS 201
// Spring, 2019
// Assignment
// Daniel Hernandez Monroy

import java.util.Scanner;

   public class Dinner {

   public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    float grossTotal;
    float tip;
    float tipTotal;
    float taxTotal;
    final float TAX_RATE= .08F;
    float dinnerTotal;

    System.out.print("What is the dinner gross total? : ");
    grossTotal = keyboard.nextFloat();

    System.out.print("What is the gratuity rate? (in decimals): ");
    tip = keyboard.nextFloat();

    tipTotal = tip * grossTotal;
    taxTotal = TAX_RATE * grossTotal;
    dinnerTotal = tipTotal + taxTotal + grossTotal;

    System.out.println("Your gross total is $" + grossTotal + ".\nYou paid $" + taxTotal + " in taxes.\n" + "And left a $" + tipTotal + " tip." ) ;
    System.out.println("Your grand total is: $" + dinnerTotal);
  }
}
