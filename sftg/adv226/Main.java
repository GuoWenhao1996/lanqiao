package com.gwh.sftg.adv226;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str + "|";
		char[] input = str.toCharArray();
		int begin = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] == '|') {
				zhuanhua(str.substring(begin, i));
				begin = i + 1;
			}
		}
	}

	private static void zhuanhua(String str) {
		if (str.equals("*-"))
			System.out.print("a");
		else if (str.equals("-***"))
			System.out.print("b");
		else if (str.equals("-*-*"))
			System.out.print("c");
		else if (str.equals("-**"))
			System.out.print("d");
		else if (str.equals("*"))
			System.out.print("e");
		else if (str.equals("**-*"))
			System.out.print("f");
		else if (str.equals("--*"))
			System.out.print("g");
		else if (str.equals("****"))
			System.out.print("h");
		else if (str.equals("**"))
			System.out.print("i");
		else if (str.equals("*---"))
			System.out.print("j");
		else if (str.equals("-*-"))
			System.out.print("k");
		else if (str.equals("*-**"))
			System.out.print("l");
		else if (str.equals("--"))
			System.out.print("m");
		else if (str.equals("-*"))
			System.out.print("n");
		else if (str.equals("---"))
			System.out.print("o");
		else if (str.equals("*--*"))
			System.out.print("p");
		else if (str.equals("--*-"))
			System.out.print("q");
		else if (str.equals("*-*"))
			System.out.print("r");
		else if (str.equals("***"))
			System.out.print("s");
		else if (str.equals("-"))
			System.out.print("t");
		else if (str.equals("**-"))
			System.out.print("u");
		else if (str.equals("***-"))
			System.out.print("v");
		else if (str.equals("*--"))
			System.out.print("w");
		else if (str.equals("-**-"))
			System.out.print("x");
		else if (str.equals("-*--"))
			System.out.print("y");
		else if (str.equals("--**"))
			System.out.print("z");
	}
}
