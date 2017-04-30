package com.gwh.sfxl.algo047;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// 第一只小蜜蜂的坐标
		int x1 = 0;
		int y1 = 0;
		int z1 = 0;
		// 第二只小蜜蜂的坐标
		int x2 = 0;
		int y2 = 0;
		int z2 = 0;
		for (int i = 0; i < n; i++) {
			int ai, bi, ci, di, ei, fi, ti;
			ai = sc.nextInt();
			bi = sc.nextInt();
			ci = sc.nextInt();
			di = sc.nextInt();
			ei = sc.nextInt();
			fi = sc.nextInt();
			ti = sc.nextInt();
			// 第i次位移
			x1 = x1 + ai * ti;
			y1 = y1 + bi * ti;
			z1 = z1 + ci * ti;
			x2 = x2 + di * ti;
			y2 = y2 + ei * ti;
			z2 = z2 + fi * ti;
		}
		// 加上初始坐标
		x1 = x1 + sc.nextInt();
		y1 = y1 + sc.nextInt();
		z1 = z1 + sc.nextInt();
		x2 = x2 + sc.nextInt();
		y2 = y2 + sc.nextInt();
		z2 = z2 + sc.nextInt();
		System.out.printf("%.4f", Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2) + (z1 - z2) * (z1 - z2)));
	}
}
