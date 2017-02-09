package com.gwh.sftg.adv074;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String output = "";
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				if (!output.isEmpty()) {
					if (Integer.parseInt(output.charAt(output.length() - 2) + "") != i)
						output = output + i + " ";
				} else
					output = output + i + " ";
				n = n / i;
				i = 1;
			}
		}
		System.out.println(output);
	}
}