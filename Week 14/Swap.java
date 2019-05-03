import java.util.Scanner;
public class Swap {
 public static void main( String[] args) {
    Scanner keyboard = new Scanner( System.in );

    int a;
    int b;

    System.out.print("Input a: ");
    a = keyboard.nextInt();
    System.out.print("Input b: ");
    b = keyboard.nextInt();

    a = a + b;
    b = a - b;
    a = a - b;

    System.out.println("\nInput a: " + a + "\nInput b: " + b);
  }
}
