package com.gwh.sfxl.algo013;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int[] high = new int[input.length];
		for (int i = 0; i < high.length; i++) {
			high[i] = Integer.parseInt(input[i]);
		}
		System.out.println(maxLanJie(high));
		System.out.println(numSheBei(high));
	}

	private static int maxLanJie(int[] high) {
		int[] dp = new int[high.length];
		int max = 0;
		for (int i = 0; i < high.length; i++) {
			for (int j = i + 1; j < high.length; j++) {
				if (high[j] <= high[i]) {
					dp[j] = Integer.max(dp[j], dp[i] + 1);
					max = Integer.max(max, dp[j]);
				}
			}
		}
		return max + 1;
	}

	private static int numSheBei(int[] high) {
		int SheBei = 0;
		boolean[] lanJie = new boolean[high.length];
		for (int i = 0; i < high.length; i++) {
			int midHigh = minHigh(high, i, lanJie);
			if (midHigh == -1) {
				SheBei++;
			} else {
				lanJie[midHigh] = true;
			}
		}
		return SheBei;
	}

	private static int minHigh(int[] high, int pos, boolean[] lanJie) {
		int index = -1;
		for (int i = 0; i < pos; i++) {
			if (lanJie[i] == false && high[i] >= high[pos]) {
				if (index == -1 || high[i] < high[index]) {
					index = i;
				}
			}
		}
		return index;
	}
}