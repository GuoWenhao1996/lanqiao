package com.gwh.sfxl.algo009;

import java.util.Scanner;

public class Main {
	static int[] a = new int[25];
	static int n, ans;
	static int[] visit = new int[25];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		dfs(1);
		System.out.println(ans);
	}

	public static boolean IsCan(int num, int k) {
		if (k == 1 || k == 2)
			return true;
		if (a[k - 1] > a[k - 2] && num < a[k - 2])
			return true;
		if (a[k - 1] < a[k - 2] && num > a[k - 2])
			return true;
		return false;
	}

	public static void dfs(int cur) {
		if (cur > n)
			return;
		for (int i = 1; i <= n; i++) {
			if (visit[i] == 0 && IsCan(i, cur)) {
				visit[i] = 1;
				a[cur] = i;
				if (cur >= 2) {
					ans++;
				}
				dfs(cur + 1);
				visit[i] = 0;
			}
		}
	}
}
