package com.gwh.sftg.adv172;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] people = new String[n];
		int[] birthday = new int[n];
		int day = 0;
		for (int i = 0; i < n; i++) {
			people[i] = sc.next();
			birthday[i] = Integer.parseInt(people[i].substring(6, 14));
		}
		Arrays.sort(people);
		Arrays.sort(birthday);
		for (int i = n - 1; i >= 0; i--) {
			if (i != 0) {
				if (birthday[i] == birthday[i - 1]) {
					day++;
					continue;
				}
			}
			for (int j = n - 1; j >= 0; j--) {
				if (people[j].substring(6, 14).equals(birthday[i] + "")) {
					if (day == 0)
						System.out.println(people[j]);
					else {
						for (int k = 0; k <= day; k++)
							System.out.println(people[j--]);
						day = 0;
					}
				}
			}
		}
	}
}
