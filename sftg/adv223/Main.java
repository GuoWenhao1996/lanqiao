package com.gwh.sftg.adv223;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = 1;
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
	}
}