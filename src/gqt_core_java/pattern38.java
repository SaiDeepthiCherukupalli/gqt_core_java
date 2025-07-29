/**
 * 
 */
package gqt_core_java;

import java.util.Scanner;

/** 5
# 
# # 
# - # 
# - - # 
# # # # # 

 * 
 */
public class pattern38 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				if(j==0||i==n-1||i==j) {
				System.out.print("# ");}
				else {
					System.out.print("- ");
				}
			}
			System.out.println("");
		}
		

	}

}
