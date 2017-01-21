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
			while (true) {
				if (isHuiWen(strchar))
					break;
				strchar = change(strchar);
				step++;
			}
			System.out.println(step);
		} else
			System.out.println("Impossible");
	}

	private static char[] change(char[] strchar) {
		return strchar;
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

	private static boolean isHuiWen(char[] strchar) {
		for (int i = 0; i < N / 2; i++) {
			if (strchar[i] != strchar[N - 1 - i])
				return false;
		}
		return true;
	}
}