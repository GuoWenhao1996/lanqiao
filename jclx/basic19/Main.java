package com.gwh.jclx.basic19;

import java.util.Scanner;

public class Main {

	private static char zjschar = ' ';
	private static int step = 0;
	private static int N = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		String str = sc.next();
		char[] strchar = str.toCharArray();
		if (possible(strchar)) {
			step = changes(strchar, zjschar, N);
			System.out.println(step);
		} else
			System.out.println("Impossible");
	}

	public static int changes(char s[], char x, int n) {
		int i, change = 0, j, k;
		for (i = 0; i < n / 2; i++) {
			if (s[i] == x) {
				for (j = i; j < n - i - 1; j++)
					if (s[n - i - 1] == s[j])
						break;
				change += j - i;
				for (k = j; k > i; k--)
					s[k] = s[k - 1];
				s[i] = s[n - i - 1];
			} else {
				for (j = n - i - 1; j >= i; j--)
					if (s[i] == s[j])
						break;
				change += n - i - 1 - j;
				for (k = j; k < n - i - 1; k++)
					s[k] = s[k + 1];
				s[n - i - 1] = s[i];
			}
		}
		return change;
	}

	private static boolean possible(char[] strchar) {
		int count = 0;
		int zjs = 1;
		for (int i = 0; i < N; i++) {
			if (strchar[i] != zjschar) {
				for (int j = 0; j < N; j++) {
					if (strchar[i] == strchar[j])
						count++;
				}
				if (count % 2 != 0) {
					if (zjs == 1) {
						zjs--;
						zjschar = strchar[i];
					} else
						return false;
				}
				count = 0;
			}
		}
		return true;
	}
}