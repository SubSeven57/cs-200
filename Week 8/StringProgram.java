import java.util.Scanner;

public class StringProgram {
      public static void main(String [] args) {

         Scanner kbd = new Scanner(System.in);

         String word;
         char letter;
         int i;
         int count;

         System.out.print("Enter a string: ");
         word = kbd.nextLine();

         System.out.print("Enter a letter: ");
         letter = kbd.nextLine();
         letter = letter.charAt(0);

         count = 0;
         for (i = 0; i < word.length(); i++) {
            if ( word.charAt(i) == letter ) {
              count++;
              System.out.println("input: " + word + ", " + letter + " " + "output: char " + letter + " " + "found at positions: " + count + ", ");
            }

            else {
              System.out.println("input: " + word + ", " + letter + " " + "output: char " + letter + " " + "not found");
            }
          }
    }
   }
