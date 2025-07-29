package gqt_core_java;
import java.util.Scanner;
/* 5
    1
   121
  12321
 1234321
123454321 */
public class pattern31 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);int s=0;
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
			
					System.out.print(j);
				}
				
			
				
			
				for(int k=i-1;k>=1;k--) {
					System.out.print(k);
				
			}
					
			
			System.out.println("");
			}}


	}

 
