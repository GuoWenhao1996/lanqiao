package com.gwh.sftg.adv181;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = 1;
		int sum = 0;
		while (true) {
			for (int j = 2; j <= num; j++) {
				if (num % j == 0) {
					System.out.print(j);
					sum++;
					temp = j;
					break;
				}
			}
			num = num / temp;
			if (num == 1)
				break;
			else
				System.out.print(" ");
		}
		System.out.println("\n" + sum);
	}
}