package gqt_core_java;

import java.util.Scanner;
/* A
   BAB
  CBABC
 DCBABCD
EDCBABCDE */

public class pattern36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); char c='A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
				
			}
			for(int j=i;j>=1;j--) {
			
		
					System.out.print((char)(64+j));
					
				}
			for(int k=2;k<=i;k++) {
				System.out.print((char)(64+k));
			}
			
				
			
				
			
			System.out.println("");
			}


	}

}
