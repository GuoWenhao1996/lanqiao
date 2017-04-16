package com.gwh.sfxl.algo048;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public void method1() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String first = br.readLine();
		String[] nm = first.split(" ");
		int n = Integer.parseInt(nm[0].trim());
		int m = Integer.parseInt(nm[1].trim());
		int a[][] = new int[n][m];
		for (int i = 0; i < m; i++) {
			String second = br.readLine();
			String[] pq = second.split(" ");
			int p = Integer.parseInt(pq[0].trim());
			int q = Integer.parseInt(pq[1].trim());
			a[p - 1][i] = 1;
			a[q - 1][i] = -1;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(a[i][j] + " ");
			}
			if (i != n - 1) {
				System.out.println();
			}
		}
	}

	public static void main(String[] argStrings) throws IOException {
		Main main = new Main();
		main.method1();
	}
}
