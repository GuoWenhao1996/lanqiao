package com.gwh.jclx.basic28;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		int temp = -1;
		int length = n;
		int[] array = new int[n + 1];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		array[n] = 0;
		while (length != 1) {
			for (int i = 0; i < n; i++) {
				if (array[i] < min1) {
					min1 = array[i];
					temp = i;
				}
			}
			array[temp] = Integer.MAX_VALUE;
			length--;
			temp = -1;
			for (int i = 0; i < n; i++) {
				if (array[i] < min2) {
					min2 = array[i];
					temp = i;
				}
			}
			array[temp] = min1 + min2;
			temp = -1;
			array[n] = array[n] + min1 + min2;
			min1 = Integer.MAX_VALUE;
			min2 = Integer.MAX_VALUE;
		}
		System.out.println(array[n]);
	}
}
