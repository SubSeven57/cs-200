/*----------------------------------------------------------------------------------------
   Finish the Super Calculator
   1. Allow user to run/repeat this application as often as they want.
   Hint: need a repetition structure in main method

   2. Complete the getValue method below, then replace the appropriate current code
   with a call to the geValue method instead
   Hint: Can you copy & paste anything to get this one done quick & easy?

   3. Create the methods:
   �uFaD� Output a user friendly application description. What does this program do?
   "3 - Easy Subtract: valA - valB\n"
 +"4 - Easy multiply: valA * valB\n"
 +"5 - Area of a rectangle: length * width\n");
   and call them in the main method per the menu method listing
   Hint: Can you re-use any of these methods? i.e. one method calls another Try it!

   4. Add at least 5, but no more than 7 menu option additional features to your
   very own personal Super Calculator! Create the methods & modify the main method as needed.
   Go Ahead - get creative & have some fun! (but don't borrow ideas from your neighbor)
   Note: These methods must be flowcharted FIRST & approved before they can be implemented.

   Note: All output results should be to the "Run I/O" frame, but user prompts should be dialog boxes
   -----------------------------------------------------------------------------------------*/


import java.util.Scanner;
import javax.swing.JOptionPane;

public class Asst07SuperCalculator {
public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        double value;
        int choice;
        String inputMain;
        double val1;
        double val2;
        double results;

        uFaD(); //User Friendly Application Description
        do {
                choice = menu();
                switch(choice)
                {
                case 1:
                        val1=getValue();
                        val2=getValue();
                        results = easyAdd(val1,val2);
                        System.out.println(val1 + " + " + val2 + " = " + results);
                        break;

                case 2:
                        bigAdd();
                        break;

                case 3:
                        val1=getValue();
                        val2=getValue();
                        results = easySubtract(val1,val2);
                        System.out.println(val1 + " - " + val2 + " = " + results);
                        break;


                case 4:
                        val1=getValue();
                        val2=getValue();
                        results = easyMultiply(val1,val2);
                        System.out.println(val1 + " * " + val2 + " = " + results);
                        break;

                case 5:
                        val1=getValue();
                        val2=getValue();
                        results = easyArea(val1,val2);
                        System.out.println(val1 + " * " + val2 + " = " + results);
                        break;
                        
                        
                case 6:
                        val1=getValue();
                        val2=getValue();
                        results = easyDivide(val1,val2);
                        System.out.println(val1 + " / " + val2 + " = " + results);
                        break;
                        
                case 7:
                        val1=getValue();
                        results = easySquareRoot(val1);
                        System.out.println(" SQRT " + val1 + " = " + results);
                        break;
                        
                case 8:
                        val1=getValue();
                        val2=getValue();
                        results = easyExponent(val1, val2);
                        System.out.println(val1 + " ^ " + val2 + " = " + results);
                        break;                                                   

                
                
                
                
                
                
                }//end of switch
        } while(choice !=0);

}                  //closing main method

public static void uFaD()
{
}

public static int menu()
{
        String input;
        int option;
        boolean inRange = false;
        int minInput=0;
        int maxInput=10;
        do
        {
                input = JOptionPane.showInputDialog("Choose a task for the Super Calculator:\n"
                                                    +"0 - Quit\n"
                                                    +"1 - Easy Add: valA + valB\n"
                                                    +"2 - Big Add: n values summed\n"
                                                    +"3 - Easy Subtract: valA - valB\n"
                                                    +"4 - Easy multiply: valA * valB\n"
                                                    +"5 - Area of a rectangle: length * width\n"
                                                    +"6 - Easy Divide: valA / valB\n" 
                                                    +"7 - Easy Square Root: \n"
                                                    +"8 - Easy Exponent: \n"
                                                    +"9 - \n"
                                                    +"10 - \n");

                option = Integer.parseInt(input);
                inRange = rangeCheck(option,minInput,maxInput);
                if (inRange != true)
                        JOptionPane.showMessageDialog(null, "Error! Please enter a value between "+ minInput + " - " + maxInput);
        } while(inRange != true);

        return option;
}//end of menu

public static boolean rangeCheck(int x, int min, int max)
{
        boolean valid = false;

        if(x>=min && x<=max)
                valid = true;

        return valid;

}//end of rangeCheck

public static double easyAdd(double a, double b)
{
        double resultsEA = a+b;
        return resultsEA;
}//end of easyAdd


public static double easySubtract(double a, double b)
{
        double resultsES = a-b;
        return resultsES;
}//end of easySubtract

public static double easyMultiply(double a, double b)
{
        double resultsEM = a-b;
        return resultsEM;
}//end of easyMultiply

public static double easyArea(double a, double b)
{
        double resultsArea = a*b;
        return resultsArea;
}//end of easyArea

public static double easyDivide(double a, double b)
{
        double resultsArea = a/b;
        return resultsArea;
}//end of easyDivide

public static double easySquareRoot(double a)
{
        double resultsSquareRoot = Math.sqrt(a);
        return resultsSquareRoot;
}//end of easySquareRoot

public static double easyExponent(double a, double b)
{
        double resultsExponent = Math.pow(a,b);
        return resultsExponent;
}//end of easySquareRoot



public static void bigAdd()
{
        double resultsBA=0;
        String inputBA;
        double x;
        inputBA = JOptionPane.showInputDialog("Please enter 1st value: ");
        x =Double.parseDouble(inputBA);
        System.out.print(x);
        resultsBA = easyAdd(resultsBA,x);

        do
        {
                inputBA = JOptionPane.showInputDialog("Please enter another value: ");
                x =Double.parseDouble(inputBA);
                System.out.print(" + " + x);
                resultsBA = easyAdd(resultsBA,x);
                inputBA = JOptionPane.showInputDialog("Do you have another value? Y or N: ");
        } while(inputBA.charAt(0)=='y' || inputBA.charAt(0) =='Y');
        System.out.print(" = " + resultsBA);
}//end of big add

public static double getValue()
{
        double num;
        String inputVal;
        inputVal = JOptionPane.showInputDialog("Enter Value:");
        num = Double.parseDouble(inputVal);
        return num;
}

} //closing class header
