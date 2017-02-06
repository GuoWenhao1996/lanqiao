package com.gwh.sfxl.algo046;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int n = N / M + 1;
		System.out.println((int) Math.pow(2, n) - 1);
	}
}
