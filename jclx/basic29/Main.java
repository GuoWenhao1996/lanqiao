package com.gwh.jclx.basic29;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int length1 = input.length();
		int[] a = new int[length1];
		char[] achar = input.toCharArray();
		input = sc.nextLine();
		int length2 = input.length();
		int[] b = new int[length2];
		char[] bchar = input.toCharArray();
		for (int i = 0; i < length1; i++)
			a[i] = achar[i] - 48;
		for (int i = 0; i < length2; i++)
			b[i] = bchar[i] - 48;
		if (length1 > length2) {
			for (int i = 0; i < length2; i++) {
				a[length1 - i - 1] = a[length1 - i - 1] + b[length2 - i - 1];
				if (a[length1 - i - 1] > 9) {
					a[length1 - i - 2] += a[length1 - i - 1] / 10;
					a[length1 - i - 1] = a[length1 - i - 1] % 10;
				}
			}
			for (int i = 0; i < length1; i++) {
				System.out.print(a[i]);
			}
		} else {
			for (int i = 0; i < length1; i++) {
				b[length2 - i - 1] = b[length2 - i - 1] + a[length1 - i - 1];
				if (b[length2 - i - 1] > 9) {
					b[length2 - i - 2] += b[length2 - i - 1] / 10;
					b[length2 - i - 1] = b[length2 - i - 1] % 10;
				}
			}
			for (int i = 0; i < length2; i++) {
				System.out.print(b[i]);
			}
		}
	}
}
