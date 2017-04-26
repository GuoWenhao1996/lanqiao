package com.gwh.sfxl.algo033;

import java.util.Scanner;

public class Main {
	static long a[] = new long[1001];

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in); 
		int k = sc.nextInt();
		int n = sc.nextInt();
		int m = 1;
		int sum = 0;
		while (n > 0) {
			a[m++] = n % 2;
			n = n / 2;
		}
		m--;
		for (int i = 1; i <= m; i++) {
			sum += a[i] * add(k, i - 1);
		}
		System.out.println(sum);
	}

	static int add(int k, int n) {
		int sum = 1;
		for (int i = 1; i <= n; i++)
			sum *= k;
		return sum;
	}
}
