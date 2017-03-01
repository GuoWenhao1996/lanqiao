package com.gwh.sftg.adv020;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] num = new int[N];
		for (int i = 0; i < N; i++)
			num[i] = sc.nextInt();
		for (int i = 0; i < M; i++) {
			int left = sc.nextInt() - 1;
			int right = sc.nextInt() - 1;
			int temp = 0;
			temp = num[left];
			num[left] = num[right];
			num[right] = temp;
		}
		for (int i = 0; i < N; i++)
			System.out.println(num[i]);
	}
}
