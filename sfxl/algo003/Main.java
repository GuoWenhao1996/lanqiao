package com.gwh.sfxl.algo003;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int l = sc.nextInt();
		int[] num = new int[l];
		while (true) {
			num[l - 1]++;
			for (int i = l - 1; i >= 0; i++) {
				if (num[i] == k) {
					num[i - 1]++;
					num[i] = 0;
				} else {
					break;
				}
			}
			for (int i = 0; i < l; i++)
				System.out.print(num[i]);
			System.out.println();
		}
	}
}
