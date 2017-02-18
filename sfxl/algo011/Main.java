package com.gwh.sfxl.algo011;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1)
			System.out.println(1);
		else if(n==2)
			System.out.println(2);
		else{
			int a1=1;
			int a2=2;
			int a0=0;
			for(int i=3;i<=n;i++){
				a0=a1+a2;
				a1=a2;
				a2=a0;
			}
			System.out.println(a0);
		}
	}
}
