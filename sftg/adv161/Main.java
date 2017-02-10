package com.gwh.sftg.adv161;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int count2 = 0;
		int count0 = 0;
		int count1 = 0;
		int step = 0;
		boolean chuxian = false;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String num = sc.next();
		int[] info = new int[N];
		for (int i = 0; i < N; i++) {
			info[i] = Integer.parseInt(num.substring(i, i + 1));
			if (info[i] == 2)
				count2++;
			else if (info[i] == 0)
				count0++;
			else if (info[i] == 1)
				count1++;
		}
		if (count2 > 1 && count0 > 0 && count1 > 0) {
			while (true) {
				for (int i = 0; i < N - 3; i++) {
					if (info[i] * 1000 + info[i + 1] * 100 + info[i + 2] * 10 + info[i + 3] == 2012) {
						chuxian = true;
						break;
					}
				}
				if (chuxian)
					break;
				else {
					step++;
				}
			}
			System.out.println(step);
		} else
			System.out.println(-1);
	}
}
