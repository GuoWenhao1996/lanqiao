package com.gwh.jclx.basic22;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String Ai = "";
		for (int i = 0; i < N; i++)
			Ai = Ai + (char) (i + 65) + Ai;
		System.out.println(Ai);
	}
}
