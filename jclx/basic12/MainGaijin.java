package com.gwh.jclx.basic12;

import java.util.Scanner;

public class MainGaijin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			System.out.println(Long.toOctalString(Long.valueOf(str, 16)));
		}
	}
}
