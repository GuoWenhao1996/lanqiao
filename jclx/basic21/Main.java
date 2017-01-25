package com.gwh.jclx.basic21;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] A = new String[n + 1];
		for (int j = 1; j <= n; j++) {
			String An = "";
			for (int i = 1; i <= j; i++) {
				An = An + "sin(" + i;
				if (i != j) {
					if (i % 2 == 0)
						An = An + "+";
					else
						An = An + "-";
				}
			}
			for (int i = 0; i < j; i++)
				An = An + ")";
			A[j] = An;
		}
		String Sn = "";
		for (int i = 0; i < n - 1; i++)
			Sn = Sn + "(";
		for (int i = 1; i <= n; i++)
			Sn = Sn + A[i] + "+" + (n - i + 1) + ")";
		System.out.println(Sn.substring(0, Sn.length() - 1));
	}
}
