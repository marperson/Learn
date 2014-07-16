package GUI_3_8;
import javax.swing.JOptionPane;

public class Dialog1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//JOptionPane.showMessageDialog(null, "Hello!");
		String name = JOptionPane.showInputDialog("What is your name?");
		String message = "Welcome! " + name;
		JOptionPane.showConfirmDialog(null, message);
	}

}
