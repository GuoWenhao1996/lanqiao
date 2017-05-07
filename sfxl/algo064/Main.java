package com.gwh.sfxl.algo064;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.nextLine().charAt(0);
		if (Character.isLowerCase(c))
			System.out.println("lower");
		else
			System.out.println("upper");
	}
}
