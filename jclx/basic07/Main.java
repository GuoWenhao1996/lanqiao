package com.gwh.jclx.basic07;

public class Main {
	public static void main(String[] args) {
		int g = 0;
		int s = 0;
		int b = 0;
		for (int i = 100; i < 1000; i++) {
			b = i / 100;
			s = i % 100 / 10;
			g = i % 10;
			if (i == b * b * b + s * s * s + g * g * g)
				System.out.println(i);
		}
	}
}
