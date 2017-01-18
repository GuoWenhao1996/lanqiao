package com.gwh.jclx.basic14;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int h = 0;
		int m = 0;
		int s = 0;
		s = t % 60;
		m = t / 60 % 60;
		h = t / 3600;
		System.out.println(h + ":" + m + ":" + s);
	}
}
