package com.gwh.jclx.basic29;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int length1 = input.length();
		int[] a = new int[101];
		char[] achar = input.toCharArray();
		input = sc.nextLine();
		int length2 = input.length();
		int[] b = new int[101];
		char[] bchar = input.toCharArray();
		for (int i = 0; i < length1; i++)
			a[101 - length1 + i] = achar[i] - 48;
		for (int i = 0; i < length2; i++)
			b[101 - length2 + i] = bchar[i] - 48;
		for (int i = 100; i >= 0; i--) {
			a[i] = a[i] + b[i];
			if (a[i] > 9) {
				a[i - 1] += a[i] / 10;
				a[i] = a[i] % 10;
			}
		}
		boolean start = false;
		if (a[0] > 0)
			start = true;
		for (int i = 0; i < 101; i++) {
			if (start)
				System.out.print(a[i]);
			else {
				if (a[i] == 0)
					continue;
				else {
					start = true;
					System.out.print(a[i]);
				}
			}
		}
	}
}
