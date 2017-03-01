package com.gwh.ljst.prev05;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String input = sc.nextLine();
		int[][] num = new int[n][100];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			input = sc.nextLine();
			input = input.trim() + "#";
			int begin = 0;
			int index = 0;
			for (int j = 0; j < input.length(); j++) {
				if (input.charAt(j) == ' ') {
					num[i][index] = Integer.parseInt(input.substring(begin, j));
					while (true) {
						if (input.charAt(j + 1) == ' ')
							j++;
						else
							break;
					}
					begin = j + 1;
					index++;
				} else if (input.charAt(j) == '#') {
					num[i][index] = Integer.parseInt(input.substring(begin, j));
					index++;
				}
			}
			sum = sum + index;
		}
		int[] allnum = new int[sum];
		int step = 0;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < 100; j++) {
				if (num[i][j] == 0)
					break;
				else
					allnum[step++] = num[i][j];
			}
		Arrays.sort(allnum);
		int que = 0;
		int duoyu = 0;
		boolean quebool = true;
		boolean duoyubool = true;
		for (int i = 0; i < allnum.length - 1; i++) {
			if (duoyubool && allnum[i] == allnum[i + 1]) {
				duoyu = allnum[i];
				duoyubool = false;
			}
			if (quebool && allnum[i] + 1 != allnum[i + 1] && allnum[i + 1] != allnum[i]) {
				que = allnum[i] + 1;
				quebool = false;
			}
		}
		System.out.println(que + " " + duoyu);
	}
}
