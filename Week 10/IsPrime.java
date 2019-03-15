// Daniel Hernandez Monroy
// Assignment

import java.util.Scanner;
public class IsPrime {
public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int i;
        int userInput;
        boolean isPrime = true;
        boolean run = true;
        String userString;
        do {
                System.out.print("Enter a number: ");
                userInput = keyboard.nextInt();

                if (userInput >= 0) {

                        if ((userInput == 0) || (userInput == 1)) {
                                System.out.println("This number is not prime");
                        }

                        else {
                                for (i = 2; i < userInput; i++) {
                                        if (userInput % i == 0) {
                                                isPrime = false;
                                        }
                                }

                                if ((isPrime == true) || (userInput == 2)) {
                                        System.out.println("This number is prime");
                                }

                                else {
                                        System.out.println("This number is not prime");
                                }
                        }
                }
                else {
                        System.out.println("Invalid number");
                }

                System.out.print("Press Q to Quit or Enter: ");
                keyboard.nextLine();
                userString = keyboard.nextLine();

                if (userString.equalsIgnoreCase("q")) {
                        run = false;
                }
                
                isPrime = true;
        } while (run == true);
}
}
