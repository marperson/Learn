// Fig. 18.1: OverloadedMethods.java
// Using overloaded methods to print array of different types.

public class OverloadedMethods 
{
   // method printArray to print Integer array
   public static void printArray( Integer[] inputArray )
   {
      // display array elements
      for ( Integer element : inputArray )
         System.out.printf( "%s ", element );

      System.out.println();
   } // end method printArray

   // method printArray to print Double array
   public static void printArray( Double[] inputArray )
   {
      // display array elements
      for ( Double element : inputArray )
         System.out.printf( "%s ", element );

      System.out.println();
   } // end method printArray

   // method printArray to print Character array
   public static void printArray( Character[] inputArray )
   {
      // display array elements
      for ( Character element : inputArray )
         System.out.printf( "%s ", element );

      System.out.println();
   } // end method printArray

   public static void main( String args[] ) 
   {
      // create arrays of Integer, Double and Character
      Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
      Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };

      System.out.println( "Array integerArray contains:" );
      printArray( integerArray ); // pass an Integer array
      System.out.println( "\nArray doubleArray contains:" );
      printArray( doubleArray ); // pass a Double array
      System.out.println( "\nArray characterArray contains:" );
      printArray( characterArray ); // pass a Character array
   } // end main
} // end class OverloadedMethods

/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/