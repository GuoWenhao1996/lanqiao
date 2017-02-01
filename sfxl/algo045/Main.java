package com.gwh.sfxl.algo045;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			double x = sc.nextDouble();
			if (x == 0)
				break;
			else {
				double sum = 0;
				for (int i = 1; i < 500; i++) {
					sum = sum + 1.0 / (i + 1);
					if (sum >= x) {
						System.out.println(i + "  card(s)");
						break;
					}
				}
			}
		}
	}
}
