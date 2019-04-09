import java.util.Scanner;

public class Password {
   public static void main( String[] args ){
     Scanner keyboard = new Scanner(System.in);

     String password;
     int stringLenght;

     boolean uppercase;
     boolean lowercase;
     boolean numeric;
     boolean special;

     System.out.print("Enter your password: ");
     password = keyboard.next();

     stringLenght = password.length();

     if (stringLenght < 8) {
       System.out.println("Password needs to be at least 8 characters");
     }

     else {
       uppercase = hasUppercase(password);
       lowercase = hasLowercase(password);
       numeric = hasNumber(password);
       special = hasSpecial(password);

       if ((uppercase == true) && (lowercase == true) && (numeric == true)) {
         System.out.println("Valid password");
       }

       else if ((uppercase == true) && (lowercase == true) && (special == true)) {
         System.out.println("Valid password");
       }

       else if ((lowercase == true) && (numeric == true) && (special == true)) {
         System.out.println("Valid password");
       }

       else {
         System.out.println("Invalid Password");
       }
     }

   } //End of Main

   public static boolean hasUppercase(String pass) {
     int i = 0;
     char convertedChar;
     boolean status = false;

     for (i=0; i<pass.length(); i++) {
       convertedChar = pass.charAt(i);

       if ((convertedChar >= 'A') && (convertedChar <= 'Z')) {
         status = true;
       }
     }
     return status;
   }

   public static boolean hasLowercase(String pass) {
     int i = 0;
     char convertedChar;
     boolean status = false;

     for (i=0; i<pass.length(); i++) {
       convertedChar = pass.charAt(i);

       if ((convertedChar >= 'a') && (convertedChar <= 'z')) {
         status = true;
       }
     }
     return status;
   }

   public static boolean hasNumber(String pass) {
     int i = 0;
     char convertedChar;
     boolean status = false;

     for (i=0; i<pass.length(); i++) {
       convertedChar = pass.charAt(i);

       if ((convertedChar) >= '0' && (convertedChar <= '9')) {
         status = true;
       }
     }
     return status;

   }

   public static boolean hasSpecial(String pass) {
     int i = 0;
     char convertedChar;
     boolean status = false;

     for (i=0;i<pass.length(); i++) {
       convertedChar = pass.charAt(i);

       if ((convertedChar == '#') || (convertedChar == '$') || (convertedChar == '!') || (convertedChar == '-') || (convertedChar == '_' )) {
         status = true;
       }
     }
     return status;
   }
}
