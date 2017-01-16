package com.gwh.sfxl.algo075;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int step = 0;
		int length = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++)
			array[i] = i + 1;
		length = array.length;
		while (length != 1) {
			for (int i = 0; i < n; i++) {
				if (array[i] != -1)
					step++;
				if (step == 3) {
					array[i] = -1;
					length--;
					step = 0;
				}
			}
		}
		for (int i = 0; i < n; i++)
			if (array[i] != -1)
				System.out.println(array[i]);
	}
}
