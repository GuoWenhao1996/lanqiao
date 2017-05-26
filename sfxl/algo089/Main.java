package com.gwh.sfxl.algo089;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str0 = sc.nextLine();
		char ch = ' ';
		if (str0.length() == 0)
			ch = '\n';
		else
			ch = str0.charAt(0);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {

			} else
				System.out.print(str.charAt(i));
		}
	}
}
