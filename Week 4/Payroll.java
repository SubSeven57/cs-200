// CS 200
// Spring, 2019
// Assignment 3
// Daniel Hernandez Monroy

import java.util.Scanner;
public class Payroll {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int hours;
    double grossPay, payRate;

    System.out.print("Please enter the number of hours you work: ");
    hours = keyboard.nextInt();
    System.out.print("Please enter your payrate: ");
    payRate = keyboard.nextInt();

    grossPay = hours * payRate;
    System.out.println("Your gross pay is " + grossPay + ".");
  }
}
