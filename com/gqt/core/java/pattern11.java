package com.gqt.core.java;
import java.util.Scanner;
public class pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println("");
		}
	}


	}


