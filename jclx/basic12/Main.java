package com.gwh.jclx.basic12;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 0;
		int temp = 0;
		StringBuffer strb = new StringBuffer();
		for (int j = 0; j < n; j++) {
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
				num = num + temp * (int) Math.pow(16, str.length() - i - 1);
			}
			str = "";
			while (num >= 0) {
				str = str + num % 8;
				num = num / 8;
				if (num == 0)
					break;
			}
			strb = new StringBuffer(str);
			System.out.println(strb.reverse());
		}
	}
}
