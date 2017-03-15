package com.gwh.sfxl.algo015;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d1 = sc.nextDouble();
		double c = sc.nextDouble();
		double d2 = sc.nextDouble();
		double p = sc.nextDouble();
		int n = sc.nextInt();
		double[] price = new double[n + 1];
		double[] over = new double[n + 2];
		double[] way = new double[n + 2];
		price[0] = p;
		way[0] = 0;
		double MAX = c * d2;
		boolean flag = false;
		for (int i = 1; i <= n; i++) {
			way[i] = sc.nextDouble();
			price[i] = sc.nextDouble();
			if (way[i] - way[i - 1] > MAX) {
				flag = true;
			}
		}
		if (flag) {
			System.out.println("No Solution");
			System.exit(0);
		}
		way[n + 1] = d1;
		int current = 0;
		int later = 1;
		double money = 0;
		while (current != n + 1) {
			double distance = 0;
			while ((distance <= MAX) && (later <= n) && (price[current] <= price[later])) {
				later++;
				distance = distance + way[later] - way[later - 1];
			}
			if (distance <= MAX) {
				if (over[current] >= way[later] - way[current]) {
					over[later] = over[current] - way[later] + way[current];
				} else {
					money = money + (way[later] - way[current] - over[current]) / d2 * price[current];
					over[later] = 0;
				}
			} else {
				money = money + (MAX - over[current]) / d2 * price[current];
				later = current + 1;
				over[later] = MAX - (way[later] - way[current]);
			}
			current = later;
		}
		System.out.println(new BigDecimal(money).setScale(2, BigDecimal.ROUND_HALF_UP));
	}
}