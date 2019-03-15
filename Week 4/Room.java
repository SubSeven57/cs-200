//CS200
//(Spring, 2019)
//Instructor: F.Porps
//Assignment: Friday Code
//Due: 01/21/2019
//File name: Pizza.java
import java.util.Scanner;

public class Room
{
  public static void main(String args[ ]) {
    Scanner keyboard = new Scanner(System.in);
    double sizeOfRoom;
    int numberOfWindows;
    int numberOfDoors;

    System.out.print("What is the size of this room? : ");
    sizeOfRoom = keyboard.nextFloat();
    System.out.print("How many windows are in this room? : ");
    numberOfWindows = keyboard.nextInt();
    System.out.print("How many doors are in this room? : ");
    numberOfDoors = keyboard.nextInt();

    System.out.println("Your room is " + sizeOfRoom + " feet long. There are " + numberOfWindows + " windows and " + numberOfDoors + " doors." );
        }

}
