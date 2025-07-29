/**
 * 
 */

package gqt_core_java;
import java.util.Scanner;

/**  output 5
# # # # # 
# _ _ _ # 
# _ _ _ # 
# _ _ _ # 
# # # # # 
 * 
 */
public class pattern37 {

	/**
	 * @param args
	 * @description This is a pattern with the help of conditional statments
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||i==n-1||j==0||j==n-1) {
				System.out.print("# ");}
				else {
					System.out.print("_ ");
				}
			}
			System.out.println("");
		}
		

	}

}
