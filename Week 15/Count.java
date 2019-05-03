import java.util.Scanner;
public class Count {
 public static void main( String[] args) {
    Scanner keyboard = new Scanner( System.in );

    int i = 1;
    int n;
    int input;
    int count;
    int counter = 0;

    System.out.print("Enter n: ");
    n = keyboard.nextInt();

    System.out.println("Enter 1 to " + n + " in order");

    while (i <= n) {
      count = keyboard.nextInt();

      if (count != i) {
        counter++;
        i = 1;
        count = 0;
        System.out.println("Not in order. Start over.");
      }
      i++;
    }
    System.out.println("You started over " + counter + " times");
  }
}
