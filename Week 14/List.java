import java.util.Scanner;
public class List {
 public static void main( String[] args) {
    Scanner keyboard = new Scanner( System.in );

    int input;
    int max = 0;
    int min = 0;
    int sum = 0;

    System.out.print("Enter a num. Negatives stop the program: ");
    input = keyboard.nextInt();

    max = input;
    min = input;

do {
      if (input % 2 == 0) {
        sum += input;
      }

      System.out.print("Enter a num. Negatives stop the program: ");
      input = keyboard.nextInt();

      if (input > max) {
        max = input;
      }

      else if (input < min) {
        if (input >= 0) {
          min = input;
        }
      }
    } while(input >= 0);
    System.out.println("Max: " + max + " Min: " + min + " Sum of evens: " + sum);
  }
}
