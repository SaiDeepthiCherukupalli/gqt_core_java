package gqt_core_java;
import java.util.Scanner;
/* output   5
    1
   2 2
  3   3
 4     4
5       5
 4     4
  3   3
   2 2
    1*/


public class pattern30 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
				
			}
			for(int j=1;j<=2*(i)-1;j++) {
				if(j==1||j==2*(i)-1) {
				System.out.print(i);}
			
			else {
				System.out.print(" ");
			}}
		System.out.println("");
		}
		for(int i=n-1;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
				
			}
			for(int j=1;j<=2*(i)-1;j++) {
				if(j==1||j==2*(i)-1) {
				System.out.print(i);}
			
			else {
				System.out.print(" "); 
			}}
		System.out.println("");
		}

	}

}
