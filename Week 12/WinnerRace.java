import java.util.Scanner;
public class WinnerRace
{
   public static void main( String[] args )
   {
      Scanner keyboard = new Scanner( System.in );
      
      String name1;
      String name2;
      String name3;
      float score1;
      float score2;
      float score3;
      String winName;
      String placeName;
      String showName;
      float winScore;
      float placeScore;
      float showScore;
      
      System.out.print( "Enter name1: " );
      name1 = keyboard.nextLine();
      
      System.out.print( "Enter name2: " );
      name2 = keyboard.nextLine();
      
      System.out.print( "Enter name3: " );
      name3 = keyboard.nextLine();
      
      System.out.print( "Enter score for name 1: " );
      score1 = keyboard.nextFloat();
      
      System.out.print( "Enter score for name 2: " );
      score2 = keyboard.nextFloat();
      
      System.out.print( "Enter score for name 3: " );
      score3 = keyboard.nextFloat();
      
      if( score1 < score2 && score2 < score3 )
      {
         winName = name1;
         winScore = score1;
         placeName = name2;
         placeScore = score2;
         showName = name3;
         showScore = score3;
      }
      
      else if( score1 < score3 && score3 < score2 )
      {
         winName = name1;
         winScore = score1;
         placeName = name3;
         placeScore = score3;
         showName = name2;
         showScore = score2;
      }
      
      else if( score2 < score1 && score1 < score3 )
      {
         winName = name2;
         winScore = score2;
         placeName = name1;
         placeScore = score1;
         showName = name3;
         showScore = score3;
      }
      
      else if( score2 < score3 && score3 < score1 )
      {
         winName = name2;
         winScore = score2;
         placeName = name3;
         placeScore = score3;
         showName = name1;
         showScore = score1;
      }
      
      else if( score3 < score1 && score1 < score2 )
      {
         winName = name3;
         winScore = score3;
         placeName = name1;
         placeScore = score1;
         showName = name2;
         showScore = score2;
      }
      
      else
      {
         winName = name3;
         winScore = score3;
         placeName = name2;
         placeScore = score2;
         showName = name1;
         showScore = score1;
      }
      
      System.out.println( "Win: " + winName + ": " + winScore );
      System.out.println( "Place: " + placeName + ": " + placeScore );
      System.out.println( "Show: " + showName + ": " + showScore );
   }
}