package com.gwh.sfxl.algo066;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String str = sc.nextLine();
		String[] bianji = str.split(" ");
		if (bianji[0].equals("D")) {
			int pos = 0;
			for (int i = 0; i < text.length(); i++) {
				if (text.substring(i, i + 1).equals(bianji[1])) {
					pos = i;
					break;
				}
			}
			System.out.println(text.substring(0, pos) + text.substring(pos + 1));
		} else if (bianji[0].equals("I")) {
			int pos = 0;
			for (int i = text.length() - 1; i > -1; i--) {
				if (text.substring(i, i + 1).equals(bianji[1])) {
					pos = i;
					break;
				}
			}
			System.out.println(text.substring(0, pos) + bianji[2] + text.substring(pos));
		} else if (bianji[0].equals("R")) {
			for (int i = 0; i < text.length(); i++) {
				if (text.substring(i, i + 1).equals(bianji[1])) {
					System.out.print(bianji[2]);
				} else {
					System.out.print(text.substring(i, i + 1));
				}
			}
		}
	}
}
