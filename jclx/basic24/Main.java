package com.gwh.jclx.basic24;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v1 = sc.nextInt();// 兔子
		int v2 = sc.nextInt();// 乌龟
		int t = sc.nextInt();// 领先t米
		int s = sc.nextInt();// 休息s秒
		int l = sc.nextInt();// 赛道长度
		int time1 = 0;// 模拟兔子时间
		int time2 = 0;// 模拟乌龟时间
		int wait = 1;
		boolean canrun = true;
		while (true) {
			if (v2 * time2 >= l && v1 * time1 >= l) {
				System.out.println("D");
				break;
			} else if (v2 * time2 >= l) {
				System.out.println("T");
				break;
			} else if (v1 * time1 >= l) {
				System.out.println("R");
				break;
			} else {
				time2++;
				if (canrun)
					time1++;
				if (canrun) {
					if (v1 * time1 - v2 * time2 >= t) {
						wait = 1;
						canrun = false;
					}
				} else {
					if (wait < s) {
						wait++;
						canrun = false;
					} else {
						wait = 1;
						canrun = true;
					}
				}
			}
		}
		System.out.println(time2);
	}
}