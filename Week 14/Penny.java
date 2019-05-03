import java.util.Scanner;
public class Penny {
 public static void main( String[] args) {
    Scanner keyboard = new Scanner( System.in );

    int days;
    int i;
    float value = 0;

    System.out.print("How many days have you worked? ");
    days = keyboard.nextInt();

    if (days < 0) {
      System.out.println("Invalid input");
    }

    else {
    System.out.print("Salary - \n");
    value = 0.01f;

    for (i=1;i<=days;i++) {
      System.out.print("Day " + i + " " + value + "\n");
      value *= 2f;
    }
      value = value - .01f;
      System.out.println("Your total salary for " + i + " days work is: " + value);
  }
}
}
