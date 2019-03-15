// Daniel Hernandez & David Mata
// Friday Workshop

import java.util.Scanner;

public class TriangleArea {
public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        double side1;
        double side2;
        double side3;
        double area;
        boolean validity = false;

        System.out.print("Enter a value for the first side: ");
        side1 = keyboard.nextDouble();

        System.out.print("Enter a value for the second side: ");
        side2 = keyboard.nextDouble();

        System.out.print("Enter a value for the third side: ");
        side3 = keyboard.nextDouble();

        validity = isValid(side1, side2, side3);

        if (validity == true) {
                area = area(side1, side2, side3);
                System.out.println("The area of the triangle is " + area + ".");
        }

        else {
                System.out.println("Input is invalid");
        }

      }

public static double area (double side1, double side2, double side3) {
        double area;
        double s = side1 + side2 + side3;

        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3) );

        return area;
      }

public static boolean isValid(double side1, double side2, double side3) {
        boolean validity = false;

        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side2)) {
                validity = true;
        }

        else {
                validity = false;
        }

        return validity;
      }
}
