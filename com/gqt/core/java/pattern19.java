package com.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern19 {
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int k=1;
	int n=sc.nextInt();
	for(int i=n;i>=1;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print(k+" ");
			k++;
		}
		System.out.println("");
	}
}
}
