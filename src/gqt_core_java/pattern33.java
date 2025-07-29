package gqt_core_java;

import java.util.Scanner;
/* output  5
    A
   ABA
  ABCAB
 ABCDABC
ABCDEABCD */

public class pattern33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='A';
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) { 
				System.out.print(" ");
			}
			c='A';
			for(int j=1;j<=i;j++,c++) {
			
					System.out.print(c);
				}
				
			
				c='A';
				
			
				for(int k=i-1;k>=1;k--,c++) {
					System.out.print(c);
				
			}
					
			
			System.out.println("");
			}

	}

}
