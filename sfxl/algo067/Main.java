package com.gwh.sfxl.algo067;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < 11; i++) {
			int num = sc.nextInt();
			if (num < min)
				min = num;
			if (num > max)
				max = num;
		}
		System.out.println(max + " " + min);
	}
}
