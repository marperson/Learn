// Fig. 22.16: PopupTest.java
// Testing PopupFrame.
import javax.swing.JFrame;

public class PopupTest 
{
   public static void main( String args[] )
   { 
      PopupFrame popupFrame = new PopupFrame(); // create PopupFrame 
      popupFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      popupFrame.setSize( 300, 200 ); // set frame size
      popupFrame.setVisible( true ); // display frame
   } // end main
} // end class PopupTest

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
 