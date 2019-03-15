import java.util.Scanner;

public class ExampleInputScannerDemo 
{  

public static void main(String args[ ]) 
	{
        int number;    
		  Scanner keyboard = new Scanner(System.in);
		  //declare variable(storage) of scanner type
		  //identifier: keyboard (programmer defined)
		  //keyword: new - create an object in memory (instantiate it)of Scanner type
		  //(argument: type of scanner) System.in - standard input device is the keyboard
		  // = assigns the address of the object to keyboard
		  System.out.print("Please enter an integer variable:  "); //This is a user prompt
		  number = keyboard.nextInt(); //nextInt method of Scanner class converts byte values to int data type 
		  System.out.print("Your number was:  " + number);
		  
		  keyboard.nextLine( );

		  
		  String  input;
		  char answer;
		  System.out.print ("Are you having fun, yet? Y=Yes, N=no)");
		  input = keyboard.nextLine( );
		  answer = input.charAt(0);
		  System.out.print(answer);
		  System.out.print("text end");

			  
    } //closing main method
} //closing class header
