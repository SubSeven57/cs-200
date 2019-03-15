// CS 200
// Spring, 2019
// Assignment 3
// Daniel Hernandez Monroy

import java.util.Scanner;
public class Characters {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    String userChar;
    char convertedChar;
    boolean cond = true;

    System.out.print("Enter a character: ");
    userChar = keyboard.nextLine();
    convertedChar = userChar.charAt(0);

    while (cond == true) {
      if (convertedChar >= 'A' && convertedChar <= 'Z') {
        System.out.println(convertedChar + ", Uppercase");
        System.out.print("Enter a character: ");
        userChar = keyboard.nextLine();
        convertedChar = userChar.charAt(0);
      }

      else if (convertedChar >= 'a' && convertedChar <= 'z') {
        System.out.println(convertedChar + ", Lowercase");
        System.out.print("Enter a character: ");
        userChar = keyboard.nextLine();
        convertedChar = userChar.charAt(0);
      }

      else {
        System.out.println("Non-alpha character, ending.");
        cond = false;
      }
    }
  }
}
  
