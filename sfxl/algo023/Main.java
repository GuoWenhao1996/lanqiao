package com.gwh.sfxl.algo023;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		for (double x = -100; x <= 100; x = x + 0.001) {
			if (Math.abs(a * x * x * x + b * x * x + c * x + d) < 0.01) {
				// BigDecimal bd = new BigDecimal(x);
				// bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
				// System.out.print(bd + " ");
				System.out.printf("%.2f ", x);
				x++;
			}
		}
	}
}
