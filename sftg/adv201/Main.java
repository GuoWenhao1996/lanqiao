package com.gwh.sftg.adv201;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int timet = 0; timet < t; timet++) {
			int n = sc.nextInt();
			char[][] map = new char[n][n];
			String mapstr = sc.next();
			char[] mapchar = mapstr.toCharArray();
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++) {
					map[i][j] = mapchar[i * n + j];
				}
			int q = sc.nextInt();
			for (int timeq = 0; timeq < q; timeq++) {

			}
		}
	}
}
