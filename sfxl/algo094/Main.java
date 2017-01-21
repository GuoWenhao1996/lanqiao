package com.gwh.sfxl.algo094;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[][] student = new String[n][3];
		for (int i = 0; i < n; i++) {
			student[i][0] = sc.next();
			student[i][1] = sc.next();
			student[i][2] = sc.next();
		}
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			char sex1 = ' ';
			char sex2 = ' ';
			String input = sc.next();
			if (Character.isDigit(input.charAt(0))) {
				for (int j = 0; j < n; j++) {
					if (input.equals(student[j][1]))
						sex1 = student[j][2].charAt(0);
				}
			} else {
				for (int j = 0; j < n; j++) {
					if (input.equals(student[j][0]))
						sex1 = student[j][2].charAt(0);
				}
			}
			input = sc.next();
			if (Character.isDigit(input.charAt(0))) {
				for (int j = 0; j < n; j++) {
					if (input.equals(student[j][1]))
						sex2 = student[j][2].charAt(0);
				}
			} else {
				for (int j = 0; j < n; j++) {
					if (input.equals(student[j][0]))
						sex2 = student[j][2].charAt(0);
				}
			}
			if (sex1 == sex2)
				System.out.println("N");
			else
				System.out.println("Y");
		}
	}
}