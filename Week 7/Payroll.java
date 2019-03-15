// CS 200
// Spring, 2019
// Assignment 3
// Daniel Hernandez Monroy

import java.util.Scanner;
public class Payroll {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    float hours, grossPay, payRate = 0f;

    System.out.print("Please enter the number of hours you work: ");
    hours = keyboard.nextFloat();
    System.out.print("Please enter your payrate: ");
    payRate = keyboard.nextFloat();

    grossPay = hours * payRate;
    System.out.printf("Your gross pay is $%.2f", grossPay);
    System.out.println("\nThank you!");
  }
}
