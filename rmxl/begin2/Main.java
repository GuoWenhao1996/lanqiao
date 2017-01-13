package com.gwh.rmxl.begin2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum = 0;
		// n=1，000，000，000超时
		// for (int i = 1; i <= n; i++)
		// sum = sum + i;
		sum = (long) n * (1 + n) / 2;
		System.out.println(sum);
	}
}
