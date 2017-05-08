package com.gwh.sfxl.algo065;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> list = new ArrayList<String>();
		int sum = (int) Math.pow(2, n);
		for (int i = 1; i <= sum; i += 2) {
			String s = i + "-" + (i + 1);
			list.add(s);
		}
		for (int i = 1; i <= sum - 2; i++) {
			int[] arr = new int[sum + 1];
			for (int j = 1; j <= sum; j++)
				arr[j] = j;
			list.add(new String(1 + "-" + (i + 2)));
			arr[1] = 0;
			arr[i + 2] = 0;
			for (int k = 2; k <= sum; k++) {
				for (int p = 2; p <= sum; p++) {
					if (k != p && arr[p] != 0 && arr[k] != 0) {
						String sp = k + "-" + p;
						if (list.contains(sp))
							continue;
						else {
							list.add(sp);
							arr[p] = 0;
							arr[k] = 0;
						}
					}
				}
			}
		}
		int num = 2;
		System.out.print("<1>");
		for (int i = 1, j = list.size(); i <= j; i++) {
			System.out.print(list.get(i - 1) + " ");
			if (i % (sum / 2) == 0 && i < j) {
				System.out.println();
				System.out.print("<" + num + ">");
				num++;
			}
		}
	}
}
