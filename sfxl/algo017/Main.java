package com.gwh.sfxl.algo017;

import java.util.Scanner;

public class Main {
	static int n, k;
	static int[] used;
	static int[] carr;
	static int[] iarr;
	static int[] tarr;
	static int max = Integer.MIN_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		tarr = new int[n];
		for (int i = 0; i < n; i++) {
			tarr[i] = s.charAt(i) - '0';
		}
		carr = new int[2];
		carr[0] = 1;
		carr[1] = 0;
		used = new int[2];
		used[0] = k;
		used[1] = n - 1 - k;
		iarr = new int[n - 1];
		dfs(0);
		System.out.println(max);
	}

	static int ana(String string) {
		String[] sarr = string.split(" ");
		int tmp = 1;
		for (int i = 0; i < sarr.length; i++) {
			tmp *= Integer.parseInt(sarr[i]);
		}
		return tmp;
	}

	static void dfs(int p) {
		if (p == iarr.length) {
			String string = "";
			string += tarr[0];
			for (int i = 0; i < iarr.length; i++) {
				if (iarr[i] == 1) {
					string += " " + tarr[i + 1];
				} else {
					string += "" + tarr[i + 1];
				}
			}
			int tmp = ana(string);
			if (tmp > max) {
				max = tmp;
			}
		} else {
			for (int i = 0; i < used.length; i++) {
				if (used[i] > 0) {
					used[i]--;
					iarr[p] = carr[i];
					dfs(p + 1);
					used[i]++;
				}
			}
		}
	}
}
