package com.gwh.sfxl.algo029;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int M = sc.nextInt();
		int[] road = new int[2 * M];
		int d = 0, e, max;
		for (int i = 0; i < M; i++) {
			road[i] = sc.nextInt();
			road[i + M] = sc.nextInt();
		}
		max = road[0];
		for (int j = 0; j < 2 * M; j++) {
			if (max < road[j]) {
				max = road[j];
			}
		}
		int[] c = new int[max * 10];
		for (int i = 0; i < M; i++) {
			for (int j = road[i]; j <= road[i + M]; j++) {
				c[j] = 1;
			}
		}
		for (int i = 0; i < max; i++) {
			if (c[i] == 1) {
				d = d + 1;
			}
		}
		e = L - d;
		System.out.println(e);
	}
}
