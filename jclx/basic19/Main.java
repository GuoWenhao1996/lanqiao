package com.gwh.jclx.basic19;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int step = 0;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str = sc.next();
		char[] strchar = str.toCharArray();
		if (possible(strchar)) {
			while (true) {
				if (isHuiWen(strchar))
					break;
				// 交换算法，暂时没思路
				step++;
			}
			System.out.println(step);
		} else
			System.out.println("Impossible");
	}

	private static boolean possible(char[] strchar) {
		int count = 0;
		int zjs = 1;
		char zjschar = ' ';
		for (int i = 0; i < strchar.length; i++) {
			if (strchar[i] != zjschar) {
				for (int j = 0; j < strchar.length; j++) {
					if (strchar[i] == strchar[j])
						count++;
				}
				if (count % 2 != 0) {
					if (zjs == 1) {
						zjs--;
						zjschar = strchar[i];
					} else
						return false;
				}
				count = 0;
			}
		}
		return true;
	}

	private static boolean isHuiWen(char[] strchar) {
		for (int i = 0; i < strchar.length / 2; i++) {
			if (strchar[i] != strchar[strchar.length - 1 - i])
				return false;
		}
		return true;
	}
}