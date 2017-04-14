package com.gwh.sfxl.algo002;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n, ans;
		n = sc.nextLong();
		if (n <= 2)
			ans = n;
		else if (n % 2 == 1)
			ans = n * (n - 1) * (n - 2);
		else if (n % 3 == 0)
			ans = (n - 1) * (n - 2) * (n - 3);
		else
			ans = n * (n - 1) * (n - 3);
		System.out.println(ans);
	}
}
