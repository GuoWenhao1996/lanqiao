package com.gwh.sftg.adv201;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int timet = 0; timet < t; timet++) {
			int pi = 0;
			int pj = 0;
			int n = sc.nextInt();
			char[][] map = new char[n][n];
			String mapstr = sc.next();
			while (mapstr.length() < n * n) {
				mapstr = mapstr + sc.next();
			}
			char[] mapchar = mapstr.toCharArray();
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++) {
					map[i][j] = mapchar[i * n + j];
					if (mapchar[i * n + j] == 'S') {
						pi = i;
						pj = j;
					}
				}
			int q = sc.nextInt();
			for (int timeq = 0; timeq < q; timeq++) {
				String qstr = sc.next();
				int pi0 = pi;
				int pj0 = pj;
				boolean noBreak = true;
				for (int i = 0; i < qstr.length(); i++) {
					if (qstr.substring(i, i + 1).equals("L")) {
						pj0--;
					} else if (qstr.substring(i, i + 1).equals("R")) {
						pj0++;
					} else if (qstr.substring(i, i + 1).equals("U")) {
						pi0--;
					} else {
						pi0++;
					}
					if (pj0 < 0 || pi0 < 0 || pj0 > n - 1 || pi0 > n - 1) {
						System.out.println("I am out!");
						noBreak = false;
						break;
					} else if (map[pi0][pj0] == '#') {
						System.out.println("I am dizzy!");
						noBreak = false;
						break;
					} else if (map[pi0][pj0] == 'T') {
						System.out.println("I get there!");
						noBreak = false;
						break;
					}
				}
				if (noBreak) {
					if (map[pi0][pj0] == 'T')
						System.out.println("I get there!");
					else
						System.out.println("I have no idea!");
				}
			}
		}
	}
}
