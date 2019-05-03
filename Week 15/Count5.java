import java.util.Scanner;
public class Count5 {
 public static void main( String[] args) {
    Scanner keyboard = new Scanner( System.in );
    int i;
    double a, b;
    double result = 1;

    System.out.print("Enter a: ");
    a = keyboard.nextFloat();
    System.out.print("Enter b: ");
    b = keyboard.nextFloat();

    for (i=0; i<b;i++) {
      result*=a;
    }

    System.out.println(a + " to the power of " + b + " is " + result);
    }
}
