package com.gwh.sftg.adv079;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(n / (24 * 60));
		n = n % (24 * 60);
		System.out.print(" " + n / 60);
		n = n % 60;
		System.out.println(" " + n);
	}
}
