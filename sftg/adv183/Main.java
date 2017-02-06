package com.gwh.sftg.adv183;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] count = new int[N];
		int M = sc.nextInt();
		for (int i = 0; i < M; i++) {
			int Li = sc.nextInt();
			int Ri = sc.nextInt();
			int Ci = sc.nextInt();
			for (int j = Li - 1; j < Ri; j++)
				count[j] = count[j] + Ci;
		}
		for (int i = 0; i < N; i++)
			System.out.print(count[i] + " ");
	}
}
