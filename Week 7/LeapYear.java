// Spring, 2019
// Daniel Hernandez Monroy

import java.util.Scanner;

public class LeapYear {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    int year;

    System.out.println("Enter a year you want to check for leap year");
    year = keyboard.nextInt();

    if (year <= 1481 ) {

      System.out.println("Leap year was not stablished before this year. Please try another number!");
    }

    else {
      if (year % 4 == 0) {
        System.out.println("This is not a leap year!");
      }

      else 
    }


  }
}
