package com.gwh.jclx.basic02;

public class Main {
	public static void main(String[] args) {
		int a = -1;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		for (int i = 0; i < 32; i++) {
			a++;
			if (a == 2) {
				a = 0;
				b++;
			}
			if (b == 2) {
				b = 0;
				c++;
			}
			if (c == 2) {
				c = 0;
				d++;
			}
			if (d == 2) {
				d = 0;
				e++;
			}
			System.out.println("" + e + d + c + b + a);
		}
	}
}
