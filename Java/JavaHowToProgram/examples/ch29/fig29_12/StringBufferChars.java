// Fig. 29.12: StringBufferChars.java
// StringBuffer methods charAt, setCharAt, getChars and reverse.

public class StringBufferChars 
{
   public static void main( String args[] )
   {
      StringBuffer buffer = new StringBuffer( "hello there" );

      System.out.printf( "buffer = %s\n", buffer.toString() );
       System.out.printf( "Character at 0: %s\nCharacter at 4: %s\n\n", 
         buffer.charAt( 0 ), buffer.charAt( 4 ) );

      char charArray[] = new char[ buffer.length() ];
      buffer.getChars( 0, buffer.length(), charArray, 0 );
      System.out.print( "The characters are: " );

      for ( char character : charArray )
         System.out.print( character );

      buffer.setCharAt( 0, 'H' );
      buffer.setCharAt( 6, 'T' );
      System.out.printf( "\n\nbuf = %s", buffer.toString() );

      buffer.reverse();
      System.out.printf( "\n\nbuf = %s\n", buffer.toString() );
   } // end main
} // end class StringBufferChars


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
