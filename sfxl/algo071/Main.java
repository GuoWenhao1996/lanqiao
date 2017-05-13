package com.gwh.sfxl.algo071;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		if (s1.equals(s2))
			System.out.println(0);
		else {
			int length = Math.min(s1.length(), s2.length());
			for (int i = 0; i < length; i++) {
				if (s1.charAt(i) == s2.charAt(i))
					continue;
				else {
					System.out.println(s1.charAt(i) - s2.charAt(i));
					return;
				}
			}
			if (s1.length() > s2.length())
				System.out.println((int) s1.charAt(s2.length()));
			else if (s1.length() < s2.length())
				System.out.println((int) -s2.charAt(s1.length()));
		}
	}
}
