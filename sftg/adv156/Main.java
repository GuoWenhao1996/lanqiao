package com.gwh.sftg.adv156;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int max = 0;
		int[] from = new int[n];
		for (int i = 0; i < n; i++)
			from[i] = sc.nextInt();
		for (int i = 0; i < n; i++) {
			count = upp(from, i, 1);
			if (count > max)
				max = count;
		}
		System.out.println(max);
	}

	private static int upp(int[] from, int i, int step) {
		if (from[i] == 0) {
			return step;
		} else {
			return upp(from, from[i] - 1, ++step);
		}
	}
}
