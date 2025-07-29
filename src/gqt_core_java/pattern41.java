/**
 * 
 */
package gqt_core_java;

import java.util.Scanner;

/**
 * 
 */
public class pattern41 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			//A
			for(int j=0;j<n;j++) {
				if(
				   i+j==n/2||j-i==n/2||(i==n/4) && (j>n/4&&j<3*n/4)) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			//B
			
			for(int j=0;j<n;j++) {
				if(
				   j==0||i==0||i==n-1||j==n-1||i==n/2 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			//c
			
			for(int j=0;j<n;j++) {
				if(
				   j==0||i==0||i==n-1 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			//D
			
			for(int j=0;j<n;j++) {
				if(
				   j==0||i==0||i==n-1||j==n-1 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			//E
			
			for(int j=0;j<n;j++) {
				if(
				   j==0||i==0||i==n-1||i==n/2 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			//F
			
			for(int j=0;j<n;j++) {
				if(
				   j==0||i==0||i==n/2 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			
			//G
			
			for(int j=0;j<n;j++) {
				if(
				   j==0||i==0||(i==n-1&&j<=n/2)||(j==n/2&&i>n/2)||(j==n-1&&i>n/2)||(i==n/2&&j>=n/2) ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			//H
			
			for(int j=0;j<n;j++) {
				if(
				   j==0||i==n/2||j==n-1 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");

	    //I
			
			for(int j=0;j<n;j++) {
				if(
				   j==n/2||i==0||i==n-1 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			
		//J	
			for(int j=0;j<n;j++) {
				if(
				   j==n/2||i==0||(i==n-1&&j<=n/2) ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
		//k	
			
			for(int j=0;j<n;j++) {
				if(
				   j==0||i+j==n/2||i-j==n/2 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
		//L	
			
			for(int j=0;j<n;j++) {
				if(
				   j==0||i==n-1 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			
		//M	
			for(int j=0;j<n;j++) {
				if(
				   j==0||(i<=n/2&&i==j)||(i+j==n-1&&j>n/2)||j==n-1 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
		//N
			for(int j=0;j<n;j++) {
				if(
				   j==0||i==j||j==n-1 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
		//O	
			for(int j=0;j<n;j++) {
				if(
				   j==0||i==0||i==n-1||j==n-1 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
		//P	
			for(int j=0;j<n;j++) {
				if(
				   j==0||i==0||(i==n/2)||(j==n-1&&i<=n/2) ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			//Q 
			for(int j=0;j<n;j++) {
				if(
				   j==0||i==0||i==n-1||j==n-1||(i>=n/2&&i==j) ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
	//R		
			for(int j=0;j<n;j++) {
				if(
				   j==0||i==0||(j==n-1&&i<=n/2)||i-j==n/2||i==n/2 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			
	//S		
			for(int j=0;j<n;j++) {
				if(
				   (j==0&&i<=n/2)||i==0||i==n-1||i==n/2||j==n-1&&i>=n/2)  
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
	//T		
			for(int j=0;j<n;j++) {
				if(
				   i==0||j==n/2) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
		//U	
			for(int j=0;j<n;j++) {
				if(
				   j==0||i==n-1||j==n-1 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
	//V		
			for(int j=0;j<n;j++) {
				if(
				   (j==0&&i<=n/2)||i-j==n/2||i+j==(n-1)+n/2||(j==n-1&&i<=n/2) ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
		//W	
			for(int j=0;j<n;j++) {
				if(
				   j==0||(i+j==n-1&&i>=n/2)||(i==j&&i>=n/2)||j==n-1 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
		//X	
			for(int j=0;j<n;j++) {
				if(
				   j==i||i+j==n-1 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
		//Y	
			for(int j=0;j<n;j++) {
				if(
						(j==i&&i<=n/2)||(i+j==n-1&&i<=n/2)||(j==n/2&&i>=n/2) ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
		//Z	
			for(int j=0;j<n;j++) {
				if(
				   i==0||i+j==n-1||i==n-1 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
		//0
			for(int j=0;j<n;j++) {
				if(
				   j==0||i==0||i==n-1||j==n-1 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
	//1		
			
			for(int j=0;j<n;j++) {
				if(
				   j==n/2||i==n-1||i+j==n/2) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
		//2	
			for(int j=0;j<n;j++) {
				if(
				   i==0||(i<=n/2&&j==n-1)||i==n-1||(j==0&&i>=n/2)||i==n/2 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
		//3	
			for(int j=0;j<n;j++) {
				if(
				   i==n/2||i==0||i==n-1||j==n-1 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
		//4	
			for(int j=0;j<n;j++) {
				if(
				   j+i==n/2||i==n/2||j==n/2 ) 
					
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
		//5	
			
			for(int j=0;j<n;j++) {
				if(
						(j==0&&i<=n/2)||i==0||i==n-1||i==n/2||j==n-1&&i>=n/2 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
		//6	
			for(int j=0;j<n;j++) {
				if(
				   j==0||i==0||i==n-1||(j==n-1&&i>=n/2)||i==n/2 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
		//7	
			for(int j=0;j<n;j++) {
				if(
				   i==0||j==n-1 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
		//8	
			for(int j=0;j<n;j++) {
				if(
				   j==0||i==0||i==n-1||j==n-1 ||i==n/2) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
		//9
			for(int j=0;j<n;j++) {
				if(
				   (j==0&&i<=n/2)||i==0||j==n-1 ||i==n/2) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			
			System.out.println();
		}

	}

}
