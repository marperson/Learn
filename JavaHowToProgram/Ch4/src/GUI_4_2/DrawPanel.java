package GUI_4_2;

//Fig. 4.19: DrawPanel.java
//Draws two fanning lines on a panel.
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
	// draws an X from the corners of the panel
	public void paintComponent(Graphics g) {
		// call paintComponent to ensure the panel displays correctly
		super.paintComponent(g);

		int width = getWidth(); // total width
		int height = getHeight(); // total height

		int n = 1;
		int widthStep = width / 15;
		int heightStep = height / 15;
		while (n < 16) {

			// draw a line from the upper-left to the lower-right
			//g.drawLine(0, 0, width, height);

			// draw a line from the lower-left to the upper-right
			//g.drawLine(0, height, width, 0);
			
			//Draw one fanning line
			g.drawLine((n-1)*widthStep, (n-1)*heightStep, n*widthStep, height);
			
			//Draw remaining three fanning lines
			//g.drawLine(0, height, widthStep*n, heightStep*n);
			//g.drawLine(width, height, widthStep*n, height-heightStep*n);
			//g.drawLine(width, 0, widthStep*n, heightStep*n);
			n++;
		}
	} // end method paintComponent
} // end class DrawPanel

