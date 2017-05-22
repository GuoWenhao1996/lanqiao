package com.gwh.sfxl.algo085;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		long sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1')
				sum += Math.pow(2, str.length() - i - 1);
		}
		System.out.println(sum);
	}
}
