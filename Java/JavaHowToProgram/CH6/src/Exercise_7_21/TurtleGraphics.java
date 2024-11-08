/**
 * 
 */
package Exercise_7_21;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author hefang
 *
 */
public class TurtleGraphics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int [][]floor = new int[20][20];
		//Arrays.fill(floor, 0);
		int posX=0;
		int posY=0;
		boolean pen =false;
		int move=0;
		int direction=0;
		int step=0;
		boolean status = true;
		while(status){
			System.out.println("Enter turtle movement:");
			move = s.nextInt();
			switch (move){
			case 1: pen=false;
					break;
			case 2: pen=true;
					floor[posX][posY]=1;
					break;
			case 3: 
				if (direction!=0){
					direction--;
				}
				else{
					direction=3;
				}
				break;
			case 4: 
				if (direction!=3){
					direction++;
				}
				else{
					direction=0;
				}
				break;
			case 5:	
				System.out.println("Enter steps:");
				step=s.nextInt();
				if(direction==0 && (posY+step)<20){
					for(int j=posY;j<=(posY+step);j++){
						if (pen){
							floor[posX][j]=1;
						}
					}
					posY+=step;
				}
				else if(direction==1 && (posX+step)<20){
					for(int j=posX;j<=(posX+step);j++){
						if (pen){
							floor[j][posY]=1;
						}
					}
					posX+=step;
				}
				else if(direction==2 && (posY-step)>=0){
					for(int j=posY;j>=(posY-step);j--){
						if (pen){
							floor[posX][j]=1;
						}
					}
					posY-=step;
				}
				else if(direction==3 && (posX-step)>=0){
					for(int j=posX;j>=(posX-step);j--){
						if (pen){
							floor[j][posY]=1;
						}
					}
					posX-=step;
				}
				else{
					System.out.println("step is out of bound");
				}

				break;

			case 6: 
				for(int []floorRow:floor){
					for(int value: floorRow){
						if (value==0){
							System.out.print("-");
						}
						else if (value==1){
							System.out.print("*");
						}
					}
					System.out.println();
				}
				break;
			case 7:	status=false;
					break;
			default:	System.out.println("Please enter 1 - 7");
						break;
			}
			
			
		}
		

	}

}
