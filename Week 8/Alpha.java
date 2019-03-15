// CS 200
// Daniel Hernandez Monroy

import java.util.Scanner;
public class Alpha {
public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String userChar;
        char convertedChar;
        boolean run = true;

        do {
                System.out.print("Enter a character: ");
                userChar = keyboard.nextLine();
                convertedChar = userChar.charAt(0);

                if (convertedChar >= 'A' && convertedChar <= 'Z') {
                        System.out.println("Uppercase");
                        run = true;
                }
                else if (convertedChar >= 'a' && convertedChar <= 'z') {
                        System.out.println("Lowercase");
                        run=true;
                }
                else {
                        System.out.println("Non-alpha character, ending.");
                        run = false;
                }
        }
        while (run == true);
}
}
