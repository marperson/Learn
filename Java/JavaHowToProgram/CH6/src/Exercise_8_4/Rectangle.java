/**
 * 
 */
package Exercise_8_4;

/**
 * @author hefang
 *
 */
public class Rectangle {
	double width;
	double length;

	/**
	 * @param width
	 * @param length
	 */
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		if (width > 0 && width <=20){
			this.width = width;
		}
		else{
			System.out.println("Width out of range");
		}
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		if (length >0 && length <=20){
			this.length = length;
		}
		else {
			System.out.println("Length out of range");
		}

	}
	
	
	

}
