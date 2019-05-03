import java.util.Scanner;
public class BBQ {
 public static void main( String[] args) {
    Scanner keyboard = new Scanner( System.in );

    int guests;
    int small;
    int medium;
    int large;
    float portions = 0f;

    System.out.print("How many guests are coming? : ");
    guests = keyboard.nextInt();
    System.out.print("Small guests? : ");
    small = keyboard.nextInt();
    System.out.print("Medium guests? : ");
    medium = keyboard.nextInt();
    System.out.print("Large guests? : ");
    large = keyboard.nextInt();

    portions = checkPortions(small, medium, large);

    System.out.println("Small portions: " + small + " Medium portions: " + " Large portions" + large);
  }

  public static float checkPortions(int s, int m, int l) {
    float portionTotal = 0f;

    final float SMA_BUR = 0.25f;
    final float SMA_COL = 4f;
    final float SMA_SAL = 3f;
    final float SMA_BUN = 1f;

    final float MED_BUR = 0.5f;
    final float MED_COL = 6f;
    final float MED_SAL = 4f;
    final float MED_BUN = 2f;

    final float LRG_BUR = 1f;
    final float LRG_COL = 6f;
    final float LRG_SAL = 4f;
    final float LRG_BUN = 4f;

    return portionTotal;
  }

}
