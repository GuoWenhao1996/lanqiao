package com.gwh.sfxl.algo129;

public class Main {
	public static void main(String[] args) {
		for (int i = 1000; i < 10000; i++) {
			if (i % 10 + i / 10 % 10 + i / 100 % 10 + i / 1000 % 10 == 10)
				System.out.println(i);
		}
	}
}
