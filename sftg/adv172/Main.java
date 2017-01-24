package com.gwh.sftg.adv172;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] people = new String[n];
		long[] birthday = new long[n];
		for (int i = 0; i < n; i++) {
			people[i] = sc.next();
			birthday[i] = Long.parseLong(people[i]) / 10000 % 100000000 * 100000 + i;
		}
		Arrays.sort(birthday);
		for (int i = n - 1; i >= 0; i--) {
			System.out.println(people[(int) ((birthday[i]) % 100000)]);
		}
	}
}
