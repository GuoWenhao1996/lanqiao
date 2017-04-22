package com.gwh.sfxl.algo031;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int count = sc.nextInt();
		int[][] arr = new int[count][2];
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int[] temp = new int[money + 1];
		for (int i = 0; i < count; i++) {
			for (int j = money; j > 0; j--) {
				if (j > arr[i][0]) {
					if (temp[j - arr[i][0]] + arr[i][0] * arr[i][1] > temp[j]) {
						temp[j] = temp[j - arr[i][0]] + arr[i][0] * arr[i][1];
					} else {
						continue;
					}
				}
			}
		}
		System.out.println(temp[money]);
	}
}
