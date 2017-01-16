package com.gwh.jclx.basic11;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		long num = 0;
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i, i + 1).equals("A"))
				temp = 10;
			else if (str.substring(i, i + 1).equals("B"))
				temp = 11;
			else if (str.substring(i, i + 1).equals("C"))
				temp = 12;
			else if (str.substring(i, i + 1).equals("D"))
				temp = 13;
			else if (str.substring(i, i + 1).equals("E"))
				temp = 14;
			else if (str.substring(i, i + 1).equals("F"))
				temp = 15;
			else
				temp = Integer.parseInt(str.substring(i, i + 1));
			num = num + (long) temp * (long) Math.pow(16, str.length() - i - 1);
		}
		System.out.println(num);
	}
}
