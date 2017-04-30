package com.gwh.sfxl.algo050;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
			if (num[i] % b == 0)
				continue;
			else {
				if (num[i] > 64 && num[i] < 91) {
					System.out.print((char) ('A' + num[i] - 65) + " ");
				} else {
					System.out.print(num[i] + " ");
				}
			}
		}
	}
}
