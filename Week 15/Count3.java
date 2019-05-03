import java.util.Scanner;
public class Count3 {
 public static void main( String[] args) {
    Scanner keyboard = new Scanner( System.in );

    int a, b, c, d;

    System.out.print("Enter a: ");
    a = keyboard.nextInt();

    System.out.print("Enter b: ");
    b = keyboard.nextInt();

    if (a == b){
      System.out.println("NO PRIZE");
    }

    else {
      System.out.print("Enter c: ");
      c = keyboard.nextInt();

      if ((c>a) && (c<b) || (c<a) && (c>b)) {
        System.out.print("Enter d: ");
        d = keyboard.nextInt();

        if ((d>b) && (d<c) || (d<b) && (d>c)) {
          System.out.println("LARGE PRIZE");
        }

        else {
          System.out.println("MEDIUM PRIZE");
        }
      }

      else {
        System.out.println("SMALL PRIZE");
      }
    }
  }
}
