package gqt_core_java;

import java.util.Scanner;
/*  5
     0
    101
   21012
  3210123
 432101234
54321012345 */

public class pattern35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
				
			}
			for(int j=i;j>=0;j--) {
			
		
					System.out.print(j);
					
				}
			for(int k=1;k<=i;k++) {
				System.out.print(k);
			}
			
				
			
				
			
			System.out.println("");
			}

	}

}
