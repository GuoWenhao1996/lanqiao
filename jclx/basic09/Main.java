package com.gwh.jclx.basic09;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int g = 0;
		int s = 0;
		int b = 0;
		int q = 0;
		int w = 0;
		int sw = 0;
		StringBuffer ss = new StringBuffer("");
		for (int i = 10000; i < 1000000; i++) {
			ss = new StringBuffer(i + "");
			int j = Integer.parseInt(ss.reverse().toString());
			if (i == j) {
				sw = i / 100000;
				w = i / 10000 % 10;
				q = i / 1000 % 10;
				b = i / 100 % 10;
				s = i / 10 % 10;
				g = i % 10;
				if (g + s + b + q + w + sw == n)
					System.out.println(i);
			}
		}
	}
}