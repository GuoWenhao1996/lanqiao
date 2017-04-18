package com.gwh.sfxl.algo020;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String zhongxu = sc.nextLine();
		String houxu = sc.nextLine();
		qianxu(zhongxu, houxu);
		System.out.println();

	}

	private static void qianxu(String zhongxu, String houxu) {
		char chl = houxu.charAt(houxu.length() - 1);
		System.out.print(chl);
		int index = zhongxu.indexOf(chl);
		if (index > 0) {
			qianxu(zhongxu.substring(0, index), houxu.substring(0, index));
		}
		if (index < zhongxu.length() - 1) {
			qianxu(zhongxu.substring(index + 1), houxu.substring(index, houxu.length() - 1));
		}
	}
}