package com.gwh.sftg.adv206;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long weishu = 0;
		long num = 1;
		long max = 1111111111;
		max = max * 90;
		for (int i = 0; i < n; i++) {
			if (weishu > 4)
				num = num + num + 1;
			else
				num = num + num;
			if (num > max / 10)
				weishu = num % 10;
			else
				weishu = 0;
			if (num > max) {
				num = num / 10;
			}
		}
		System.out.println(num / 10);
	}
}