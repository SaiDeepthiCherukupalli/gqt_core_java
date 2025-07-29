package gqt_core_java;
import java.util.Scanner;
/* output  5
    1
   121
  12321
 1234321
123454321
 1234321
  12321
   121
    1*/
public class pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
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
			}
		for(int i=n-1;i>=1;i--) { 
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
			}

	}

}
