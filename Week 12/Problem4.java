public class Problem4
{
   public static void main( String[] args )
   {
// FOR   
      int x = 1;
      int y = 5;
      int z = 0;
      
      System.out.print( x );
      z = 1;
      for( x = 1; x < y; x++ )
      {
         System.out.print( " + " + x );
         z = z + x;
      }
      
      System.out.print( " = " + z );
  
  System.out.println();
// WHILE 
  
      x = 1;
      y = 5;
      z = 0;
      
      System.out.print(x);
      z=1;
      while( x < y) { 
      System.out.print(" + " + x);
      
      z = z + x;
      x++;
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      }
      
       System.out.print(" = " + z);
       System.out.println();

  // DO WHILE 
     
      x = 1;
      y = 5;
      z = 0;
      System.out.print(x);
      z=1;
      do {
      System.out.print(" + " + x);
      
      z = z + x;
      x++;
      
      
      }while(x<y);
      System.out.print(" = " + z);
  
   }
   
   
  
}