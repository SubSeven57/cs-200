// Daniel Hernandez Monroy
// Assignment

import java.util.Scanner;
public class PhoneConvert {
public static void main(String[] args) {

								Scanner keyboard = new Scanner(System.in);

								String phoneNumber;
								int stringLength;
								int i;

								System.out.print("Enter a string: ");
								phoneNumber = keyboard.nextLine();

								stringLength = phoneNumber.length();

								for (i = 0; i < stringLength; i++) {
																if (Character.isLetter(phoneNumber.charAt(i))) {
																								System.out.print(getNumber(Character.toUpperCase(phoneNumber.charAt(i))));
																}
																else {
																								System.out.print(phoneNumber.charAt(i));
																}
								}
								System.out.println();
}

public static int getNumber(char uppercaseLetter) {
								if (uppercaseLetter >= 'W')
																return 9;
								else if (uppercaseLetter >= 'T')
																return 8;
								else if (uppercaseLetter >= 'P')
																return 7;
								else if (uppercaseLetter >= 'M')
																return 6;
								else if (uppercaseLetter >= 'J')
																return 5;
								else if (uppercaseLetter >= 'G')
																return 4;
								else if (uppercaseLetter >= 'D')
																return 3;
								else
																return 2;
}
}
