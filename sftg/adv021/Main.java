package com.gwh.sftg.adv021;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		for (int i = n; i >= 0; i--) {
			a = sc.nextInt();
			if (i == 1) {
				if (a > 0) {
					if (i == n) {
						if (a == 1)
							System.out.print("x");
						else
							System.out.print(a + "x");
					} else {
						if (a == 1)
							System.out.print("+x");
						else
							System.out.print("+" + a + "x");
					}
				} else if (a < 0) {
					if (a == -1)
						System.out.print("-x");
					else
						System.out.print(a + "x");
				}
			} else if (i == 0) {
				if (a > 0)
					if (i == n)
						System.out.print(a);
					else
						System.out.print("+" + a);
				else if (a < 0)
					System.out.print(a);

			} else {
				if (a == 0)
					continue;
				else if (a < 0) {
					if (a == -1)
						System.out.print("-x^" + i);
					else
						System.out.print(a + "x^" + i);
				} else {
					if (i == n) {
						if (a == 1)
							System.out.print("x^" + i);
						else
							System.out.print(a + "x^" + i);
					} else {
						if (a == 1)
							System.out.print("+x^" + i);
						else
							System.out.print("+" + a + "x^" + i);
					}
				}
			}
		}
	}
}
