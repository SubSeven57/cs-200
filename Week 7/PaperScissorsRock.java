// Spring, 2019
// Daniel Hernandez Monroy

import java.util.Scanner;

public class PaperScissorsRock {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int choice, compChoice;

    System.out.print("Choose one! \n0)Scissors \n1)Rock \n2)Paper\nEnter Choice: ");
    choice = keyboard.nextInt();
    compChoice = (int) (Math.random() * 3);

    if (choice == compChoice) {
      System.out.println("Draw!");
    }

    else {
      if (choice == 0 && compChoice == 2 || choice == 1 && compChoice == 0 || choice == 2 && compChoice == 1) {
          System.out.println("You win!");
      }

      else {
          System.out.println("You lose!");
      }

    }
  }
}
