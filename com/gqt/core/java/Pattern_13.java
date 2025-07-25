package com.gqt.core.java;
import java.util.Scanner;

public class Pattern_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=i+n*(n-1);j=j+n) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		

	}

}
 