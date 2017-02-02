package com.gwh.sftg.adv171;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str = str.substring(0, 6) + "19" + str.substring(6);
		int index = 0;
		int[] quan = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 };
		char[] jiaoyan = { '1', '0', 'x', '9', '8', '7', '6', '5', '4', '3', '2' };
		for (int i = 0; i < str.length(); i++)
			index = index + Integer.valueOf("" + str.charAt(i)) * quan[i];
		index = index % 11;
		str = str + jiaoyan[index];
		System.out.println(str);
	}
}
