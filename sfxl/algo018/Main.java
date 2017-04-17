package com.gwh.sfxl.algo018;

import java.util.Scanner;

public class Main {
	private static String[] word = new String[20];
	private static int[] pos = new int[20];
	private static int max;
	private static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 0; i < n; i++)
			word[i] = sc.next();
		String begin = sc.next();
		link(begin, begin.length());
		System.out.println(max);
	}

	private static void link(String s, int length) {
		for (int i = 0; i < n; i++)
			if (word[i].indexOf(s) == 0 && pos[i] < 2) {
				int length1 = s.length();
				int length2 = word[i].length();
				pos[i]++;
				int p = 1;
				length = length + length2 - length1;
				while (p < length2) {
					link(word[i].substring(length2 - p, length2), length);
					p += 1;
				}
				length = length - length2 + length1;
				pos[i]--;
			}
		max = length > max ? length : max;
	}
}
