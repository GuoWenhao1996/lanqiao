package com.gwh.jclx.basic10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int temp = 0;
		String str = "";
		StringBuffer strb = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while (num >= 0) {
			temp = num % 16;
			if (temp < 10)
				str = str + temp;
			else
				str = str + (char) ('A' + (temp - 10));
			num = num / 16;
			if (num == 0)
				break;
		}
		strb = new StringBuffer(str);
		System.out.println(strb.reverse());
	}
}
