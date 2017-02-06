package com.gwh.sftg.adv076;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double r = 0.1;
		double p = Math.pow(1 + r, n);
		BigDecimal bd = new BigDecimal(p);
		bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
		System.out.println(bd);
	}
}
