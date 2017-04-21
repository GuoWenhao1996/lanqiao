package com.gwh.sfxl.algo024;

import java.util.Scanner;

public class Main {
	static int p;
	static int k;
	static String S;
	static int wordsize;
	static String[] Word;
	static int num = 0;
	static int kefenge = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		p = sc.nextInt();
		k = sc.nextInt();
		S = "";
		sc.nextLine();
		for (int i = 0; i < p; i++) {
			S = S + sc.nextLine();
		}
		wordsize = sc.nextInt();
		Word = new String[wordsize];
		for (int i = 0; i < wordsize; i++) {
			Word[i] = sc.next();
		}

		find(S);
		if (kefenge < k) {
			num = num - (k - 1);
		}

		System.out.println(num);

	}

	public static void find(String s) {

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < wordsize; j++) {
				if (s.substring(i, s.length()).length() < Word[j].length()) {
					continue;
				}
				if (s.substring(i, i + Word[j].length()).length() < Word[j].length()) {
					continue;
				}
				if (s.substring(i, i + Word[j].length()).equals(Word[j])) {
					num++;
					if (i != 0) {
						kefenge++;
					}
					find(s.substring(i + 1, s.length()));
					return;
				}
			}
		}
	}
}
