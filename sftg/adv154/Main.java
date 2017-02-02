package com.gwh.sftg.adv154;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int num = sc.nextInt();
			if (zhijie(num))
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}

	private static boolean zhijie(int num) {
		int count = 0;
		for (int i = 2; i <= num; i++)
			if (num % i == 0) {
				count++;
				if (count > 2)
					break;
				num = num / i;
				i = 1;
			}
		if (count == 2)
			return true;
		else
			return false;
	}
}
