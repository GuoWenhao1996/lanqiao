package com.gwh.jclx.basic01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		if (y % 400 == 0)
			System.out.println("yes");
		else if (y % 4 == 0 && y % 100 != 0)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
