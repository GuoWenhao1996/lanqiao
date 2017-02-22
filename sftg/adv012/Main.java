package com.gwh.sftg.adv012;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int time = 0;
		for (int i = 0; i < n; i++) {
			time = sc.nextInt();
			int h = time / 60 / 60;
			int m = time/ 60 % 60;
			int s = time % 60;
			if (h < 10)
				System.out.print("0" + h);
			else
				System.out.print(h);
			if (m < 10)
				System.out.print(":0" + m);
			else
				System.out.print(":" + m);
			if (s < 10)
				System.out.println(":0" + s);
			else
				System.out.println(":" + s);
		}
	}
}
