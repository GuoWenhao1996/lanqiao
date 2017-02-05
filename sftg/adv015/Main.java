package com.gwh.sftg.adv015;

import java.util.Scanner;

public class Main {
	int s = 0x80000000;

	public void input() {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t > 0) {
			s = 0x80000000;
			t--;
			int n = in.nextInt();
			int m = in.nextInt();
			int[] num = new int[n];
			for (int i = 0; i < n; i++) {
				num[i] = in.nextInt();
			}
			count(num, 0, m, n, 1);
			int min = num[0];
			System.out.println(s);
		}
	}

	private void count(int[] num, int i, int m, int n, int sum) {
		if (m == 0 && sum > s)
			s = sum;
		if (i < n && m >= 0) {
			count(num, i + 1, m - 1, n, sum * num[i]);
			count(num, i + 1, m, n, sum);
		}
	}

	public static void main(String[] args) {
		new Main().input();
	}

}