package com.gwh.sfxl.algo095;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(zhuanhuan(n));
	}

	private static String zhuanhuan(int n) {
		String strn = Integer.toBinaryString(n);
		String str = "";
		for (int i = 0; i < strn.length(); i++) {
			if (strn.charAt(i) == '1') {
				if ((strn.length() - i - 1) == 0)
					str = str + "2(0)+";
				else if ((strn.length() - i - 1) == 1)
					str = str + "2+";
				else
					str = str + "2(" + (zhuanhuan((strn.length() - i - 1))) + ")+";
			}
		}
		return str.substring(0, str.length() - 1);
	}
}
