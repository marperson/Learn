// Fig. 29.13: StringBufferAppend.java
// StringBuffer append methods.

public class StringBufferAppend 
{
   public static void main( String args[] )
   {
      Object objectRef = "hello"; 
      String string = "goodbye";  
      char charArray[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
      boolean booleanValue = true;
      char characterValue = 'Z';
      int integerValue = 7;
      long longValue = 10000000000L;
      float floatValue = 2.5f; // f suffix indicates 2.5 is a float
      double doubleValue = 33.333;

      StringBuffer lastBuffer = new StringBuffer( "last StringBuffer" );
      StringBuffer buffer = new StringBuffer();

      buffer.append( objectRef );
      buffer.append( "\n" ); // each of these contains new line
      buffer.append( string );
      buffer.append( "\n" );
      buffer.append( charArray );
      buffer.append( "\n" );
      buffer.append( charArray, 0, 3 );
      buffer.append( "\n" );
      buffer.append( booleanValue );
      buffer.append( "\n" );
      buffer.append( characterValue );
      buffer.append( "\n" );
      buffer.append( integerValue );
      buffer.append( "\n" );
      buffer.append( longValue );
      buffer.append( "\n" );
      buffer.append( floatValue );
      buffer.append( "\n" );
      buffer.append( doubleValue );
      buffer.append( "\n" );
      buffer.append( lastBuffer );

      System.out.printf( "buffer contains %s\n", buffer.toString() );
   } // end main
} // end StringBufferAppend

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
