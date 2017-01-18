package com.gwh.jclx.basic10;

import java.util.Scanner;

public class MainGaijin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(exChange(Integer.toHexString(num)));
	}

	public static String exChange(String str) {
		StringBuffer sb = new StringBuffer();
		if (str != null) {
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if (Character.isLowerCase(c))
					sb.append(Character.toUpperCase(c));
				else
					sb.append(c);
			}
		}
		return sb.toString();
	}
}
