package com.gwh.sfxl.algo037;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	private static ArrayList<Integer> list = new ArrayList<Integer>();
	private static Scanner sc = new Scanner(System.in);
	private static int[] p = new int[20000];
	private static int[] a = new int[200000];
	private static int[] num = new int[20000];
	private static int end;
	private static int len;

	public static void main(String[] args) {
		int n = sc.nextInt();
		while (n > 0) {
			int a0 = sc.nextInt();
			int a1 = sc.nextInt();
			int b0 = sc.nextInt();
			int b1 = sc.nextInt();
			int t = len = end = 0;

			work(b1, a0, a1);

			for (int i = 0; i < len; i++)
				if (gcd(a[i], a0) == a1 && b0 / gcd(b0, a[i]) * a[i] == b1)
					t++;
			list.add(t);
			n--;
		}
		for (int i : list)
			System.out.println(i);
	}

	/**
	 * 求两个数的最大公约数
	 * 
	 * @param a
	 *            第一个数
	 * @param b
	 *            第二个数
	 * @return a和b的最大公约数
	 */
	public static int gcd(int a, int b) {
		int t;
		while (b != 0) {
			t = a % b;
			a = b;
			b = t;
		}
		return a;
	}

	/**
	 * 建立公倍数，存储在预留数组中
	 * 
	 * @param now
	 *            当前位置
	 * @param pro
	 *            基数
	 */
	public static void dfs(int now, int pro) {
		if (now == end) {
			a[len++] = pro;
			return;
		}
		dfs(now + 1, pro);
		for (int i = 1; i <= num[now]; i++) {
			pro *= p[now];
			dfs(now + 1, pro);
		}
	}

	/**
	 * 在工作区域内，建立初始数据
	 * 
	 * @param n
	 *            边界值
	 * @param a0
	 *            第1个初始值
	 * @param a1
	 *            第2个初始值
	 */
	public static void work(int n, int a0, int a1) {
		int i = 2;
		int lim = (int) Math.sqrt(n);
		while (n != 1 && i <= lim) {
			if (n % i == 0) {
				if (a1 / i == 0 && a1 % i == 0) {
					while (n % i == 0)
						n /= i;
					i++;
					continue;
				}
				p[end] = i;
				num[end] = 0;
				while (n % i == 0) {
					num[end]++;
					n /= i;
				}
				end++;
			}
			i++;
		}
		if (n != 1) {
			p[end] = n;
			num[end++] = 1;
		}
		dfs(0, 1);
	}
}