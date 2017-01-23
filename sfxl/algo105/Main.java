package com.gwh.sfxl.algo105;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int firstday = 4;
		int thisday = 1;
		int sum = 0;
		for (int i = 1998; i < year; i++) {
			if (runnian(i))
				firstday = (firstday + 366) % 7;
			else
				firstday = (firstday + 365) % 7;
		}
		thisday = firstday;
		for (int i = 1; i < 13; i++) {
			if ((thisday + 12) % 7 == 5)
				sum++;
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
				thisday = (thisday + 31) % 7;
			else if (i == 4 || i == 6 || i == 9 || i == 11)
				thisday = (thisday + 30) % 7;
			else {
				if (runnian(year))
					thisday = (thisday + 29) % 7;
				else
					thisday = (thisday + 28) % 7;
			}
		}
		System.out.println(sum);
	}

	private static boolean runnian(int i) {
		if (i % 400 == 0)
			return true;
		else if (i % 4 == 0 && i % 100 != 0)
			return true;
		else
			return false;
	}
}
