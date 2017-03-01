package com.gwh.sftg.adv018;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] num1 = new int[201];
		int[] num2 = new int[201];
		num1[100] = -1;
		num2[100] = -1;
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		String input2 = sc.nextLine();
		int pos1 = 0;
		int pos2 = 0;
		boolean b = false;
		for (int i = 0; i < input1.length(); i++)
			if (input1.charAt(i) == '.') {
				b = true;
				pos1 = i;
				break;
			}
		if (!b)
			pos1 = input1.length();
		b = false;
		for (int i = 0; i < input2.length(); i++)
			if (input2.charAt(i) == '.') {
				b = true;
				pos2 = i;
				break;
			}
		if (!b)
			pos2 = input2.length();
		int yx1 = 0;
		int yx2 = 0;
		yx1 = input1.length() - pos1 - 1;
		yx2 = input2.length() - pos2 - 1;
		if (yx1 < yx2)
			yx1 = yx2;
		for (int i = 99; i >= 0; i--) {
			try {
				num1[i] = input1.charAt(pos1 - 100 + i) - 48;
			} catch (Exception e) {
			}
			try {
				num2[i] = input2.charAt(pos2 - 100 + i) - 48;
			} catch (Exception e) {
			}
		}
		for (int i = 101; i < 201; i++) {
			try {
				num1[i] = input1.charAt(pos1 + i - 100) - 48;
			} catch (Exception e) {
			}
			try {
				num2[i] = input2.charAt(pos2 + i - 100) - 48;
			} catch (Exception e) {
			}
		}
		for (int i = 200; i >= 0; i--) {
			num1[i] = num1[i] + num2[i];
			if (num1[i] > 9) {
				if (i == 101)
					num1[99] = num1[99] + num1[i] / 10;
				else
					num1[i - 1] = num1[i - 1] + num1[i] / 10;
				num1[i] = num1[i] % 10;
			}
		}
		String out = "";
		b = false;
		for (int i = 0; i < 100; i++) {
			if (num1[i] != 0)
				b = true;
			if (b) {
				if (num1[i] < 10)
					out = out + num1[i];
				else {
					out = (Double.parseDouble(out) + num1[i] / 10) + "" + num1[i] % 10;
				}
			}
		}
		if (yx1 > 0)
			out = out + ".";
		for (int i = 101; i < 201 && yx1 > 0; i++) {
			yx1--;
			if (num1[i] < 10)
				out = out + num1[i];
			else {
				out = (Double.parseDouble(out) + num1[i] / 10) + "" + num1[i] % 10;
			}

		}
		System.out.println(out);
	}
}
