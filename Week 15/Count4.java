import java.util.Scanner;
public class Count4 {
 public static void main( String[] args) {
    Scanner keyboard = new Scanner( System.in );
    int[] a = new int[8];
    int disc;

    System.out.println("Enter values for array: ");
    for (int i = 0; i<a.length; i++) {
      a[i] = keyboard.nextInt();
    }

    disc = howManyDistinctValues(a);

    System.out.println(disc);
  }

  public static int howManyDistinctValues(int[] a) {
    int count = 1;
    int i;
    int j;

    for (i=0; i<a.length-1; i++) {

      if (a[i] != a[i+1]) {
        count++;
      }

    }
    return count;
  }


}
