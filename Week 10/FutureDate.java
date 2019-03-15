// Daniel Hernandez Monroy
// Assignment

import java.util.Scanner;
public class FutureDate {
public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        final int CURRENT_YEAR = 2019;
        final int CURRENT_MONTH = 3;
        final int CURRENT_DAY = 14;

        int inputYear;
        int inputMonth;
        int inputDay;
        int daysInMonth;

        boolean dayValidity = true;
        boolean monthValidity = false;

        System.out.print("Input value for year: ");
        inputYear = keyboard.nextInt();
        System.out.print("Input value for month: ");
        inputMonth = keyboard.nextInt();
        System.out.print("Input value for day: ");
        inputDay = keyboard.nextInt();

        //If previous year
        if (inputYear < CURRENT_YEAR) {
                System.out.println("Invalid value");
        }

        //If future year
        else if (inputYear > CURRENT_YEAR) {
                System.out.println("Valid year value");
                monthValidity = validMonth(inputMonth);
                daysInMonth = getDays(inputMonth);
                dayValidity = validDays(daysInMonth, inputDay);
        }

        // If current year
        else {
                System.out.println("Valid year value");
                if (inputMonth < CURRENT_MONTH) {
                  System.out.println("Invalid month value");
                }
                else if (inputMonth > CURRENT_MONTH) {
                  monthValidity = validMonth(inputMonth);
                  daysInMonth = getDays(inputMonth);
                  dayValidity = validDays(daysInMonth, inputDay);
                }

                else {
                  if (inputDay == CURRENT_DAY) {
                    System.out.println("Cannot equal same day");

                  }
                }

        }

} //End of Main Method

public static int getDays (int month) {
        int days = 31;

        if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
                days = 31;
        }
        else if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 10) || (month == 12)) {
                days = 30;
        }
        else if ((month == 2)) {
                days = 28;
        }
        else {
        }
        return days;
} // End of getDays Method

public static boolean validDays (int totalDays, int iDays) {

        boolean valid = true;

        if ((iDays > totalDays ) || ( iDays < 1)) {
                valid = false;
        }
        else {
                valid = true;
        }
        return valid;
} //End of validDays method


public static boolean validMonth (int month) {

        boolean valid = true;

        if ((month > 12) || (month <1)) {
                valid = false;
        }

        else {
                valid = true;
        }

        return valid;
}

} //End of class
