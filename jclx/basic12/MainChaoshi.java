package com.gwh.jclx.basic12;

import java.util.Scanner;

public class MainChaoshi {
	public static void main(String[] args) {
		String input = "";
		String temp = "";
		String output = "";
		StringBuffer out = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			input = sc.next();
			for (int j = 0; j < input.length(); j++) {
				if (input.substring(j, j + 1).equals("0"))
					temp = temp + "0000";
				else if (input.substring(j, j + 1).equals("1"))
					temp = temp + "0001";
				else if (input.substring(j, j + 1).equals("2"))
					temp = temp + "0010";
				else if (input.substring(j, j + 1).equals("3"))
					temp = temp + "0011";
				else if (input.substring(j, j + 1).equals("4"))
					temp = temp + "0100";
				else if (input.substring(j, j + 1).equals("5"))
					temp = temp + "0101";
				else if (input.substring(j, j + 1).equals("6"))
					temp = temp + "0110";
				else if (input.substring(j, j + 1).equals("7"))
					temp = temp + "0111";
				else if (input.substring(j, j + 1).equals("8"))
					temp = temp + "1000";
				else if (input.substring(j, j + 1).equals("9"))
					temp = temp + "1001";
				else if (input.substring(j, j + 1).equals("A"))
					temp = temp + "1010";
				else if (input.substring(j, j + 1).equals("B"))
					temp = temp + "1011";
				else if (input.substring(j, j + 1).equals("C"))
					temp = temp + "1100";
				else if (input.substring(j, j + 1).equals("D"))
					temp = temp + "1101";
				else if (input.substring(j, j + 1).equals("E"))
					temp = temp + "1110";
				else
					temp = temp + "1111";
			}
			for (int k = temp.length(); k > 0; k = k - 3) {
				if (k < 3) {
					if (temp.substring(0, k).equals("1"))
						output = output + "1";
					else if (temp.substring(0, k).equals("01"))
						output = output + "1";
					else if (temp.substring(0, k).equals("10"))
						output = output + "2";
					else if (temp.substring(0, k).equals("11"))
						output = output + "3";
					else
						output = output + "0";
				} else {
					if (temp.substring(k - 3, k).equals("000"))
						output = output + "0";
					else if (temp.substring(k - 3, k).equals("001"))
						output = output + "1";
					else if (temp.substring(k - 3, k).equals("010"))
						output = output + "2";
					else if (temp.substring(k - 3, k).equals("011"))
						output = output + "3";
					else if (temp.substring(k - 3, k).equals("100"))
						output = output + "4";
					else if (temp.substring(k - 3, k).equals("101"))
						output = output + "5";
					else if (temp.substring(k - 3, k).equals("110"))
						output = output + "6";
					else
						output = output + "7";
				}
			}
			out = new StringBuffer(output);
			System.out.println(out.reverse().toString().replaceFirst("^0*", ""));
			temp = "";
			output = "";
		}
	}
}
