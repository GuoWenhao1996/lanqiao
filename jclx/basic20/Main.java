package com.gwh.jclx.basic20;

import java.util.Scanner;

public class Main {

	static String out = "";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[] jie = new long[3];
		int p = 2;
		long num = sc.nextLong();
		while (num > 0) {
			jie[p] = num % 10000;
			p--;
			num = num / 10000;
		}
		for (int i = 0; i < jie.length; i++) {
			if (jie[i] != 0) {
				chai((int) jie[i]);
				if (i == 0)
					out = out + "yi ";
				if (i == 1)
					out = out + "wan ";
			}
		}
		if (out.substring(out.length() - 5).equals("ling "))
			out = out.substring(0, out.length() - 5);
		if (out.substring(0, 6).equals("yi shi"))
			out = out.substring(3);
		System.out.println(out);
	}

	private static void chai(int l) {
		int ge = l % 10;
		int shi = l / 10 % 10;
		int bai = l / 100 % 10;
		int qian = l / 1000 % 10;
		if (qian != 0)
			out = out + du(qian) + "qian ";
		else if (!out.isEmpty())
			out = out + "ling ";
		if (bai != 0)
			out = out + du(bai) + "bai ";
		else if (!(out.isEmpty() || out.substring(out.length() - 5).equals("ling ")))
			out = out + "ling ";
		if (shi != 0)
			out = out + du(shi) + "shi ";
		else if (!(out.isEmpty() || out.substring(out.length() - 5).equals("ling ")))
			out = out + "ling ";
		if (ge != 0)
			out = out + du(ge);
	}

	private static String du(int num) {
		if (num == 1)
			return "yi ";
		else if (num == 2)
			return "er ";
		else if (num == 3)
			return "san ";
		else if (num == 4)
			return "si ";
		else if (num == 5)
			return "wu ";
		else if (num == 6)
			return "liu ";
		else if (num == 7)
			return "qi ";
		else if (num == 8)
			return "ba ";
		else if (num == 9)
			return "jiu ";
		return "";
	}
}
