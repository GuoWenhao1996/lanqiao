package com.gwh.sfxl.algo039;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[0]);
		for (int i = 1; i < 10; i++) {
			if (arr[i] != arr[i - 1])
				System.out.println(arr[i]);
		}

	}
}
