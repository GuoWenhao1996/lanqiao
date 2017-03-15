package com.gwh.sfxl.algo014;

import java.util.Scanner;

public class Main {
	static int step = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String M = sc.nextLine();
		while (step < 31) {
			if (isHuiwen(M)) {
				System.out.println("STEP=" + step);
				System.exit(0);
			} else {
				step++;
				if (N > 10) {
					int[] result = new int[M.length() + 1];
					char[] mchar = M.toCharArray();
					for (int i = 0; i < M.length(); i++) {
						int temp1 = 0;
						int temp2 = 0;
						if ((int) mchar[i] > 60)
							temp1 = (int) mchar[i] - 55;
						else
							temp1 = (int) mchar[i] - 48;

						if ((int) mchar[mchar.length - 1 - i] > 60)
							temp2 = (int) mchar[mchar.length - 1 - i] - 55;
						else
							temp2 = (int) mchar[mchar.length - 1 - i] - 48;
						if (temp1 + temp2 > 15) {
							result[result.length - 1 - i] += temp1 + temp2 - 16;
							result[result.length - 2 - i]++;
						} else
							result[result.length - 1 - i] += temp1 + temp2;
					}
					M = "";
					for (int i = 0; i < result.length; i++) {
						if (result[0] == 0)
							continue;
						else if (result[i] < 10)
							M = M + result[i];
						else
							M = (char) (result[i] + 55) + M;
					}
				} else {
					int[] result = new int[M.length() + 1];
					char[] mchar = M.toCharArray();
					for (int i = 0; i < M.length(); i++) {
						int temp1 = 0;
						int temp2 = 0;
						temp1 = (int) mchar[i] - 48;
						temp2 = (int) mchar[mchar.length - 1 - i] - 48;
						if (temp1 + temp2 > N - 1) {
							result[result.length - 1 - i] += temp1 + temp2 - N;
							result[result.length - 2 - i]++;
						} else
							result[result.length - 1 - i] += temp1 + temp2;
					}
					M = "";
					for (int i = 0; i < result.length; i++) {
						if (i == 0 && result[0] == 0) {
							continue;
						} else {
							M = M + result[i];
						}
					}
				}
			}
		}
		System.out.println("Impossible!");
	}

	private static boolean isHuiwen(String m) {
		if (m.equals(new StringBuilder(m).reverse().toString()))
			return true;
		else
			return false;
	}
}
