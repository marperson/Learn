// Fig. 22.5: MenuFrame.java
// Demonstrating menus.
import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;

public class MenuFrame extends JFrame 
{
   private final Color colorValues[] = 
      { Color.BLACK, Color.BLUE, Color.RED, Color.GREEN };   
   private JRadioButtonMenuItem colorItems[]; // color menu items
   private JRadioButtonMenuItem fonts[]; // font menu items
   private JCheckBoxMenuItem styleItems[]; // font style menu items
   private JLabel displayJLabel; // displays sample text
   private ButtonGroup fontButtonGroup; // manages font menu items
   private ButtonGroup colorButtonGroup; // manages color menu items
   private int style; // used to create style for font

   // no-argument constructor set up GUI
   public MenuFrame()
   {
      super( "Using JMenus" );     

      JMenu fileMenu = new JMenu( "File" ); // create file menu
      fileMenu.setMnemonic( 'F' ); // set mnemonic to F

      // create About... menu item
      JMenuItem aboutItem = new JMenuItem( "About..." );
      aboutItem.setMnemonic( 'A' ); // set mnemonic to A
      fileMenu.add( aboutItem ); // add about item to file menu
      aboutItem.addActionListener(

         new ActionListener() // anonymous inner class
         {  
            // display message dialog when user selects About...
            public void actionPerformed( ActionEvent event )
            {
               JOptionPane.showMessageDialog( MenuFrame.this,
                  "This is an example\nof using menus",
                  "About", JOptionPane.PLAIN_MESSAGE );
            } // end method actionPerformed
         } // end anonymous inner class
      ); // end call to addActionListener
 
      JMenuItem exitItem = new JMenuItem( "Exit" ); // create exit item
      exitItem.setMnemonic( 'x' ); // set mnemonic to x
      fileMenu.add( exitItem ); // add exit item to file menu
      exitItem.addActionListener(

         new ActionListener() // anonymous inner class
         {  
            // terminate application when user clicks exitItem
            public void actionPerformed( ActionEvent event )
            {
               System.exit( 0 ); // exit application
            } // end method actionPerformed
         } // end anonymous inner class
      ); // end call to addActionListener

      JMenuBar bar = new JMenuBar(); // create menu bar
      setJMenuBar( bar ); // add menu bar to application
      bar.add( fileMenu ); // add file menu to menu bar

      JMenu formatMenu = new JMenu( "Format" ); // create format menu
      formatMenu.setMnemonic( 'r' ); // set mnemonic to r

      // array listing string colors
      String colors[] = { "Black", "Blue", "Red", "Green" };

      JMenu colorMenu = new JMenu( "Color" ); // create color menu
      colorMenu.setMnemonic( 'C' ); // set mnemonic to C

      // create radiobutton menu items for colors
      colorItems = new JRadioButtonMenuItem[ colors.length ];
      colorButtonGroup = new ButtonGroup(); // manages colors
      ItemHandler itemHandler = new ItemHandler(); // handler for colors

      // create color radio button menu items
      for ( int count = 0; count < colors.length; count++ ) 
      {
         colorItems[ count ] = 
            new JRadioButtonMenuItem( colors[ count ] ); // create item
         colorMenu.add( colorItems[ count ] ); // add item to color menu
         colorButtonGroup.add( colorItems[ count ] ); // add to group
         colorItems[ count ].addActionListener( itemHandler );
      } // end for

      colorItems[ 0 ].setSelected( true ); // select first Color item

      formatMenu.add( colorMenu ); // add color menu to format menu
      formatMenu.addSeparator(); // add separator in menu

      // array listing font names
      String fontNames[] = { "Serif", "Monospaced", "SansSerif" };
      JMenu fontMenu = new JMenu( "Font" ); // create font menu
      fontMenu.setMnemonic( 'n' ); // set mnemonic to n

      // create radiobutton menu items for font names
      fonts = new JRadioButtonMenuItem[ fontNames.length ];
      fontButtonGroup = new ButtonGroup(); // manages font names

      // create Font radio button menu items
      for ( int count = 0; count < fonts.length; count++ ) 
      {
         fonts[ count ] = new JRadioButtonMenuItem( fontNames[ count ] );
         fontMenu.add( fonts[ count ] ); // add font to font menu
         fontButtonGroup.add( fonts[ count ] ); // add to button group
         fonts[ count ].addActionListener( itemHandler ); // add handler
      } // end for

      fonts[ 0 ].setSelected( true ); // select first Font menu item
      fontMenu.addSeparator(); // add separator bar to font menu

      String styleNames[] = { "Bold", "Italic" }; // names of styles
      styleItems = new JCheckBoxMenuItem[ styleNames.length ];
      StyleHandler styleHandler = new StyleHandler(); // style handler

      // create style checkbox menu items
      for ( int count = 0; count < styleNames.length; count++ ) 
      {
         styleItems[ count ] = 
            new JCheckBoxMenuItem( styleNames[ count ] ); // for style
         fontMenu.add( styleItems[ count ] ); // add to font menu
         styleItems[ count ].addItemListener( styleHandler ); // handler
      } // end for

      formatMenu.add( fontMenu ); // add Font menu to Format menu
      bar.add( formatMenu ); // add Format menu to menu bar
     
      // set up label to display text
      displayJLabel = new JLabel( "Sample Text", SwingConstants.CENTER );
      displayJLabel.setForeground( colorValues[ 0 ] );
      displayJLabel.setFont( new Font( "Serif", Font.PLAIN, 72 ) );

      getContentPane().setBackground( Color.CYAN ); // set background
      add( displayJLabel, BorderLayout.CENTER ); // add displayJLabel
   } // end MenuFrame constructor

   // inner class to handle action events from menu items
   private class ItemHandler implements ActionListener 
   {
      // process color and font selections
      public void actionPerformed( ActionEvent event )
      {
         // process color selection
         for ( int count = 0; count < colorItems.length; count++ )
         {
            if ( colorItems[ count ].isSelected() ) 
            {
               displayJLabel.setForeground( colorValues[ count ] );
               break;
            } // end if
         } // end for

         // process font selection
         for ( int count = 0; count < fonts.length; count++ )
         {
            if ( event.getSource() == fonts[ count ] ) 
            {
               displayJLabel.setFont( 
                  new Font( fonts[ count ].getText(), style, 72 ) );
            } // end if
         } // end for

         repaint(); // redraw application
      } // end method actionPerformed
   } // end class ItemHandler

   // inner class to handle item events from check box menu items
   private class StyleHandler implements ItemListener 
   {
      // process font style selections
      public void itemStateChanged( ItemEvent e )
      {
         style = 0; // initialize style

         // check for bold selection
         if ( styleItems[ 0 ].isSelected() )
            style += Font.BOLD; // add bold to style

         // check for italic selection
         if ( styleItems[ 1 ].isSelected() )
            style += Font.ITALIC; // add italic to style

         displayJLabel.setFont( 
            new Font( displayJLabel.getFont().getName(), style, 72 ) );
         repaint(); // redraw application
      } // end method itemStateChanged
   } // end class StyleHandler
} // end class MenuFrame


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

