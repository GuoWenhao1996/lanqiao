package com.gwh.sfxl.algo077;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		if (x2 - x1 == 0)
			System.out.println("INF");
		else
			System.out.printf("%.0f",(y2 - y1) / (x2 - x1));
	}
}
