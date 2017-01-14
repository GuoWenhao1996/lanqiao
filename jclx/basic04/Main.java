package com.gwh.jclx.basic04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int input = 0;
		int max = -10000;
		int min = 10000;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			input = sc.nextInt();
			if (input > max)
				max = input;
			if (input < min)
				min = input;
			sum = sum + input;
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
	}
}
