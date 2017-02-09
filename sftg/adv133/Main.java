package com.gwh.sftg.adv133;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n <= 1000) {

		} else {

		}
		int[] zjhm = new int[7];
		int[] dqhm = new int[7];
		int[] zjqk = new int[7];
		for (int i = 0; i < 7; i++)
			zjhm[i] = sc.nextInt();
		Arrays.sort(zjhm);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 7; j++) {
				dqhm[j] = sc.nextInt();
			}
			Arrays.sort(dqhm);
			int index = 0;
			int jdj = 7;
			for (int j = 0; j < 7; j++) {
				if (dqhm[j] == zjhm[index])
					jdj--;
				else if (dqhm[j] > zjhm[index]) {
					j--;
					index++;
					if (index > 6) {
						break;
					}
				}
			}
			if (jdj != 7) {
				zjqk[jdj]++;
			}
		}
		for (int i = 0; i < 7; i++)
			System.out.print(zjqk[i] + " ");
	}
}
