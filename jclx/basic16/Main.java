package com.gwh.jclx.basic16;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int i = a; i <= b; i++) {
			System.out.print(i + "=");
			int num = i;
			int temp = 0;
			while (true) {
				for (int j = 2; j <= num; j++) {
					if (num % j == 0) {
						System.out.print(j);
						temp = j;
						break;
					}
				}
				num = num / temp;
				if (num == 1)
					break;
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
