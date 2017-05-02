package com.gwh.sfxl.algo056;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] mianzhi = new int[m];
		for (int i = 0; i < m; i++) {
			mianzhi[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(mianzhi);
		if (mianzhi[0] != 1)
			System.out.println(0);
		else {
			int max = n;
			int time = 0;
			for (int i = 1; i < mianzhi.length;) {
				if (mianzhi[i] > n * mianzhi[i - 1] + 1 - time * mianzhi[i - 1]) {
					break;
				} else {
					max += mianzhi[i] - mianzhi[i - 1];
					time++;
					if (time == n)
						i++;
				}
			}
			System.out.println(max);
		}
	}
}
