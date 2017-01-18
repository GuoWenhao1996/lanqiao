package com.gwh.jclx.basic11;

import java.util.Scanner;

public class MainGaijin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(Long.valueOf(str, 16));
	}
}
