package com.gwh.jclx.basic03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				System.out.print((char) ('A' + Math.abs(i - j)));
			System.out.println();
		}
	}
}

//// 很笨的做法
// package com.gwh.jclx.basic03;
//
// import java.util.Scanner;
//
// public class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// char[] a = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
//// 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
// 'U', 'V', 'W', 'X', 'Y', 'Z' };
// int index = 0;
// int n = sc.nextInt();
// int m = sc.nextInt();
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < m; j++) {
// index = Math.abs(i - j);
// while (index > 26)
// index = index - 26;
// System.out.print(a[index]);
// }
// System.out.println();
// }
// }
// }