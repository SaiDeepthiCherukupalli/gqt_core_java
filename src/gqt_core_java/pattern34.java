package gqt_core_java;
import java.util.Scanner;
/* output  5
    A
   CBA
  EDCBA
 GFEDCBA
IHGFEDCBA */
public class pattern34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char c='A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=2*(i)-1;j>=1;j--) {
			
		
					System.out.print((char)(64+j));
					
				}
				
			
				
			
			System.out.println("");
			}

	}

}
