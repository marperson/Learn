// Fig. 18.8: FullStackException.java
// Indicates a stack is full.
public class FullStackException extends RuntimeException
{
   // no-argument constructor
   public FullStackException()
   {
      this( "Stack is full" );
   } // end no-argument FullStackException constructor

   // one-argument constructor
   public FullStackException( String exception )
   {
      super( exception );
   } // end one-argument FullStackException constructor
} // end class FullStackException


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