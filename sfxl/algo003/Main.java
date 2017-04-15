package com.gwh.sfxl.algo003;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int l = sc.nextInt();
		l = l + 1;
		int[] num = new int[l];
		num[l - 2] = 1;
		int count = 0;
		while (true) {
			boolean flag = true;
			num[l - 1]++;
			for (int i = l - 1; i >= 0; i--) {
				if (num[i] == k) {
					num[i - 1]++;
					num[i] = 0;
				} else {
					break;
				}
			}
			if (num[0] == 1)
				break;
			for (int i = l-1; i > 1; i--) {
				if (num[i] == num[i - 1] - 1 || num[i] == num[i - 1] + 1) {
					flag = false;
					break;
				}
			}
			if (flag) {
				count++;
				for (int i = 0; i < l; i++) {
					System.out.print(num[i]);
				}
				System.out.println();
			}
			if (count == 1000000007)
				count = 0;
		}
		System.out.println(count);
	}
}
