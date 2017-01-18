package com.gwh.jclx.basic15;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		if (str1.length() == str2.length()) {
			if (str1.equals(str2))
				System.out.println(2);
			else {
				str1 = toBig(str1);
				str2 = toBig(str2);
				if (str1.equals(str2))
					System.out.println(3);
				else
					System.out.println(4);
			}
		} else
			System.out.println(1);
	}

	private static String toBig(String str) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isLowerCase(c))
				sb.append(Character.toUpperCase(c));
			else
				sb.append(c);
		}
		return sb.toString();
	}
}
