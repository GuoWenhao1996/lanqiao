package com.gwh.jclx.basic05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++)
			array[i] = sc.nextInt();
		int num = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (num == array[i]) {
				System.out.println(i + 1);
				System.exit(0);
			}
		}
		System.out.println(-1);
	}
}
