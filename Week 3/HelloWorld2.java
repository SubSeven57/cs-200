//CS200
//(Spring, 2019)
//Instructor: F.Porps
//Assignment #1 
//Due:  01/17/19
//File name: HelloWorld2.java
import java.util.Scanner;

public class HelloWorld2
{  
        public static void main(String args[ ])
        {
        Scanner keyboard = new Scanner(System.in);
        int age; 
        System.out.println("What is your age? "); 
        age = keyboard.nextInt();
        System.out.println("Hello World! My Name is D. Hernandez Monroy.");
        System.out.println("My age is: " + age); 
        }
}