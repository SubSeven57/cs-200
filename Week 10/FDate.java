// Daniel Hernandez Monroy
// Assignment

import java.util.Scanner;
public class FDate {
public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        final int CURRENT_YEAR = 2019;
        final int CURRENT_MONTH = 3;
        final int CURRENT_DAY = 14;
        int inputYear;
        int inputMonth;
        int inputDay;
        boolean dayValidity = false;
        boolean monthValidity = false;
        boolean validCheck = false;

        System.out.print("Input value for day: ");
        inputDay = keyboard.nextInt();
        System.out.print("Input value for month: ");
        inputMonth = keyboard.nextInt();
        System.out.print("Input value for year: ");
        inputYear = keyboard.nextInt();

        //If previous year
        if (inputYear < CURRENT_YEAR) {
                System.out.println("Invalid values");
        }

        //If future year
        else if (inputYear > CURRENT_YEAR) {
                monthValidity = validMonth(inputMonth);
                dayValidity = validDay(inputMonth, inputDay);
                validCheck = everythingValid (monthValidity, dayValidity);
        }

        // If current year
        else {
                // Less than current month
                if (inputMonth < CURRENT_MONTH) {
                        System.out.println("Invalid values");
                }
                // Greater than current month
                else if (inputMonth > CURRENT_MONTH) {
                        monthValidity = validMonth(inputMonth);
                        dayValidity = validDay(inputMonth, inputDay);
                        validCheck = everythingValid (monthValidity, dayValidity);
                }

                else if (inputMonth == CURRENT_MONTH) {
                        if (inputDay == CURRENT_DAY) {
                                System.out.println("Invalid values");
                        }
                        else {
                                monthValidity = validMonth(inputMonth);
                                dayValidity = validDay(inputMonth, inputDay);
                                validCheck = everythingValid (monthValidity, dayValidity);
                        }
                }
        }
}   //End of Main Method

public static boolean validMonth (int month) {
        boolean valid = false;
        if ((month <= 12) || (month >= 1)) {
                valid = true;
        }
        return valid;
}

public static boolean validDay (int month, int day) {
        boolean valid = false;
        if ((month == 4) || (month == 6) || (month == 8) || (month == 9) || (month == 11)) {
                if ((day >= 1) && (day <= 30)) {
                        valid = true;
                }
        }
        else if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 10) || (month == 12)) {
                if ((day >= 1) && (day <= 31)) {
                        valid = true;
                }
        }
        else if ((month == 2)) {
                if ((day >= 1) && (day <= 28)) {
                        valid = true;
                }
        }
        return valid;
}   // End of validDays Method

public static boolean everythingValid (boolean validDay, boolean validMonth) {
        boolean valid = false;
        if ((validDay == false) || (validMonth == false)) {
                System.out.println("Invalid values");
        }
        else {
                valid = true;
                System.out.println("Valid values");
        }
        return valid;
} //End of everythingValid
}   //End of class
