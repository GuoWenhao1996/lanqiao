package com.gwh.ljst.prev01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int team1 = sc.nextInt();
		int team2 = sc.nextInt();
		int team3 = sc.nextInt();
		for (int i = Math.max(team3, Math.max(team1, team2));; i++) {
			if (i % team1 == 0 && i % team2 == 0 && i % team3 == 0) {
				System.out.println(i);
				break;
			}
		}
	}
}
