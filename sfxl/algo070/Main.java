package com.gwh.sfxl.algo070;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] str = input.split(" ");
		String strResult = str[0];
		for (int i = 1; i < str.length; i++) {
			if (str[i].length() > strResult.length())
				strResult = str[i];
		}
		System.out.println(strResult);
	}
}
