package com.gqt.core.java;
import java.util.*;
public class pattern13_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count;
		for(int i=1;i<=n;i++) {
			count=i;
			for(int j=1;j<=n;j++) {
				System.out.print(count+" ");
				count=count+n;
			}
			System.out.println("");
		}

	}

}
