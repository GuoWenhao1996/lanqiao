package com.gwh.sftg.adv187;

public class Main {
	public static void main(String[] args) {
		for (int a = 1; a < 500; a++) {
			for (int b = a; b < 500; b++)
				for (int c = b; c < 500; c++) {
					if (a * a + b * b == c * c && a + b + c <= 1000)
						System.out.println(a + " " + b + " " + c);
				}
		}
	}
}
