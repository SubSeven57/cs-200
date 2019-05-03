import java.util.Scanner;
public class Count2 {
 public static void main( String[] args) {
    Scanner keyboard = new Scanner( System.in );

    int n;
    int j = 0;
    int i = 0;
    int counter = 0;
    float[] reals;
    float avg = 0f;

    System.out.print("Enter n: ");
    n = keyboard.nextInt();

    System.out.println("Enter " + n + " reals: ");
    reals = new float[n];

    for (i=0; i<reals.length; i++) {
      reals[i] = keyboard.nextFloat();
      avg += reals[i];
    }

    avg /= n;

    for (j=0; j<reals.length; j++) {
      if (reals[j] < avg) {
        counter++;
      }
    }

    System.out.print("\n");
    System.out.println("Avg is " + avg);
    System.out.println("Num values below avg: " + counter);
  }
}
