//CS200
//(Spring, 2019)
//Instructor: F.Porps
//Assignment: Friday Code
//Due: 01/21/2019
//File name: Pizza.java
import java.util.Scanner;

public class Labour
{
  public static void main(String args[ ]) {
    Scanner keyboard = new Scanner(System.in);
    float budget;
    int numberOfWorkers;
    int numberOfHours;

    System.out.print("What is your budget? : ");
    budget = keyboard.nextFloat();
    System.out.print("How many workers will you need? : ");
    numberOfWorkers = keyboard.nextInt();
    System.out.print("How many hours do you expect this renovation will take? : ");
    numberOfHours = keyboard.nextInt();

    System.out.println("Your budget is $" + budget + ". You will need " + numberOfWorkers + " worker/s and you predict it'll take " + numberOfHours + " hours to complete." );
        }

}
