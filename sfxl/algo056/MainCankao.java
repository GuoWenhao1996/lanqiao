package com.gwh.sfxl.algo056;

import java.util.LinkedList;
import java.util.Scanner;

public class MainCankao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int max = 0;
		LinkedList<Integer> array = new LinkedList<Integer>();
		for (int i = 0; i < M; i++) {
			int temp = sc.nextInt();
			array.add(temp);
			if (temp > max) {
				max = temp;
			}
		}
		int maxLen = N * max + 1;
		int[] x = new int[maxLen];
		for (int i = 0; i < maxLen; ++i) {
			x[i] = N + 1;
		}
		while (!array.isEmpty()) {
			x[array.remove()] = 1;
		}
		for (int i = 1; i < maxLen; ++i) {
			if (x[i] == N + 1) {
				System.out.println(i - 1);
				break;
			}
			for (int j = 1; j <= i; ++j) {
				int len = i + j;
				if (len >= maxLen) {
					break;
				}
				int temp = x[i] + x[j];
				if (temp < x[len]) {
					x[len] = temp;
				}
			}
		}
	}
}