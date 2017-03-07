package com.gwh.sfxl.algo010;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		int m = sc.nextInt();
		int[] b = new int[m];
		for (int i = 0; i < m; i++)
			b[i] = sc.nextInt();
		Arrays.sort(a);
		Arrays.sort(b);
		int aindex = 0;
		int bindex = 0;
		while (true) {
			if (aindex == a.length) {
				break;
			} else if (bindex == b.length) {
				break;
			} else {
				if (a[aindex] < b[bindex]) {
					aindex++;
				} else if (a[aindex] > b[bindex]) {
					bindex++;
				} else {
					System.out.print(a[aindex] + " ");
					aindex++;
					bindex++;
				}
			}
		}
		System.out.println();
		aindex = 0;
		bindex = 0;
		while (true) {
			if (aindex == a.length) {
				for (int i = bindex; i < m; i++)
					System.out.print(b[i] + " ");
				break;
			} else if (bindex == b.length) {
				for (int i = aindex; i < n; i++)
					System.out.print(a[i] + " ");
				break;
			} else {
				if (a[aindex] < b[bindex]) {
					System.out.print(a[aindex] + " ");
					aindex++;
				} else if (a[aindex] > b[bindex]) {
					System.out.print(b[bindex] + " ");
					bindex++;
				} else {
					System.out.print(a[aindex] + " ");
					aindex++;
					bindex++;
				}
			}
		}
		System.out.println();
		aindex = 0;
		bindex = 0;
		boolean[] cunzai = new boolean[n];
		while (true) {
			if (aindex == a.length) {
				break;
			} else if (bindex == b.length) {
				break;
			} else {
				if (a[aindex] < b[bindex]) {
					aindex++;
				} else if (a[aindex] > b[bindex]) {
					bindex++;
				} else {
					cunzai[aindex] = true;
					aindex++;
					bindex++;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			if (!cunzai[i])
				System.out.print(a[i] + " ");
		}
	}
}
