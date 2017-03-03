package com.gwh.sftg.adv216;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		int thisyear = 2007;
		int firstday = 1;
		while (year - thisyear > 0) {
			if (runnian(thisyear)) {
				firstday = (firstday + 366) % 7;
			} else {
				firstday = (firstday + 365) % 7;
			}
			thisyear++;
		}
		int thismonth = 1;
		while (month - thismonth > 0) {
			firstday = (firstday + howMany(thismonth, year)) % 7;
			thismonth++;
		}
		System.out.println("Calendar " + year + " - " + (month > 9 ? month : ("0" + month)));
		System.out.println("---------------------");
		System.out.println("Su Mo Tu We Th Fr Sa");
		System.out.println("---------------------");
		for (int i = 0; i < firstday; i++)
			System.out.print("   ");
		int days = howMany(month, year);
		for (int i = 0; i < days; i++) {
			if (i < 9)
				System.out.print(" " + (i + 1) + " ");
			else
				System.out.print((i + 1) + " ");
			if ((firstday + i) % 7 == 6 || i == days - 1)
				System.out.println();
		}
		System.out.println("---------------------");

	}

	private static int howMany(int thismonth, int thisyear) {
		if (thismonth == 1 || thismonth == 3 || thismonth == 5 || thismonth == 7 || thismonth == 8 || thismonth == 10
				|| thismonth == 12) {
			return 31;
		} else if (thismonth == 4 || thismonth == 6 || thismonth == 9 || thismonth == 11) {
			return 30;
		} else {
			if (runnian(thisyear)) {
				return 29;
			} else {
				return 28;
			}
		}
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
