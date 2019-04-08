// Daniel Hernandez Monroy
// Assignment

public class Craps {
public static void main(String[] args) {

        int diceOne;
        int diceTwo;
        int sum;
        int point;
        boolean play = true;

        diceOne = rollRandom();
        diceTwo = rollRandom();

        sum = diceSum(diceOne, diceTwo);

        if ((sum == 2) || (sum == 3) || (sum == 12)) {
                System.out.println("You lose!");
        }
        else if ((sum == 7) || (sum == 11)) {
                System.out.println("You win!");
        }
        else {

                point = sum;
                System.out.println("Point rolled is " + point);

                do {
                        diceOne = rollRandom();
                        diceTwo = rollRandom();
                        sum = diceSum(diceOne, diceTwo);

                        if (sum == 7) {
                                System.out.println("You lose!");
                                play = false;
                        }

                        else if (sum == point) {
                                System.out.println("You win!");
                                play = false;
                        }
                } while (play == true);
        }

} //End of main

public static int rollRandom() {
        int dice;
        int min = 1;
        int max = 6;
        int range = max - min + 1;

        dice = (int)(Math.random() * range) + min;
        return dice;
} //End of rollRandom

public static int diceSum(int diceOne, int diceTwo) {
        int sum;

        sum = diceOne + diceTwo;

        System.out.println("You rolled a "+ diceOne + " + " + diceTwo + " = " + sum );
        return sum;
} //End of addDice

}   //End of class
