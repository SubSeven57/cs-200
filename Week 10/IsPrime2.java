// Daniel Hernandez & David Mata
// Friday Workshop

import java.util.Scanner;

public class IsPrime2 {
public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int userInput;
        boolean prime;
        boolean run = true;
        String userString;

        do {
                System.out.print("Enter a number: ");
                userInput = keyboard.nextInt();
                if (userInput >= 0) {

                        prime = primeTest(userInput);

                        if (prime == true) {
                                System.out.println("This number is prime");
                        }

                        else {
                                System.out.println("This number is not prime");
                        }
                }

                else {
                        System.out.println("This number is invalid");
                }

                keyboard.nextLine(); // Eats the space
                System.out.print("Q to Quit or Press Enter ");
                userString = keyboard.nextLine();

                if (userString.equalsIgnoreCase("q")) {
                        run = false;
                }

        } while (run == true);
}

public static boolean primeTest(int userInput) {
        int i = 2;
        boolean primeCheck = true;

        if ((userInput == 1) || (userInput == 0)) {
                primeCheck = false;
        }

        else {
                for (i = 2; i < userInput; i++) {
                        if (userInput % i == 0) {
                                primeCheck = false;
                        }
                }
        }

        return primeCheck;
}
}
