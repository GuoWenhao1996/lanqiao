package com.gwh.sftg.adv177;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		double p = sc.nextDouble();
		double shouyi = 0;
		double benjin = k;
		for (int i = 0; i < n; i++) {
			shouyi = benjin * p;
			benjin = benjin + shouyi + k;
		}
		shouyi = benjin - k * (n + 1);
		BigDecimal bd = new BigDecimal(shouyi);
		bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
		System.out.println(bd);
	}
}
