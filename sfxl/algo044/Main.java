package com.gwh.sfxl.algo044;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		int[][] cl;
		int[][] cbcl, clqs, clqx, clhs, clhx;
		int m = 0, n = 0, k = 0, fin = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s = reader.readLine();
		String[] sa = s.split(" ");
		m = Integer.parseInt(sa[0]);
		n = Integer.parseInt(sa[1]);
		k = Integer.parseInt(sa[2]);
		cl = new int[m + 1][n + 1];
		cbcl = new int[m - k + 2][n - k + 2];
		clqs = new int[m - k + 2][n - k + 2];
		clqx = new int[m - k + 2][n - k + 2];
		clhs = new int[m - k + 2][n - k + 2];
		clhx = new int[m - k + 2][n - k + 2];
		for (int i = 1; i <= m; i++)
			cl[i][0] = 0;
		for (int i = 1; i <= n; i++)
			cl[0][i] = 0;
		for (int i = 1; i <= m; i++) {
			s = reader.readLine();
			sa = s.split(" ");
			for (int j = 1; j <= n; j++) {
				cl[i][j] = cl[i][j - 1] + Integer.parseInt(sa[j - 1]);
			}
		}
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				cl[i][j] = cl[i - 1][j] + cl[i][j];
			}
		}
		for (int i = m - k + 1; i >= 1; i--) {
			for (int j = n - k + 1; j >= 1; j--) {
				cbcl[i][j] = cl[i + k - 1][j + k - 1] - cl[i - 1][j + k - 1] - cl[i + k - 1][j - 1] + cl[i - 1][j - 1];
			}
		}
		for (int i = 1, l = m - k + 1; i <= l; i++) {
			for (int j = 1, o = n - k + 1; j <= o; j++) {
				int a = cbcl[i][j];
				if (cbcl[i][0] < a) {
					cbcl[i][0] = a;
				}
			}
		}
		for (int j = 1, o = n - k + 1; j <= o; j++) {
			for (int i = 1, l = m - k + 1; i <= l; i++) {
				int a = cbcl[i][j];
				if (cbcl[0][j] < a) {
					cbcl[0][j] = a;
				}
			}
		}
		for (int i = 1; i <= m - k + 1; i++) {
			for (int j = 1; j <= n - k + 1; j++) {
				if (j == 1)
					clqs[i][j] = cbcl[i][j];
				else
					clqs[i][j] = Math.max(cbcl[i][j], clqs[i][j - 1]);
				clqx[i][j] = clqs[i][j];
			}
		}
		for (int i = 1; i <= m - k + 1; i++) {
			for (int j = n - k + 1; j >= 1; j--) {
				if (j == n - k + 1) {
					clhs[i][j] = cbcl[i][j];
					clhx[i][j] = cbcl[i][j];
				} else {
					clhx[i][j] = Math.max(cbcl[i][j], clhx[i][j + 1]);
					clhs[i][j] = clhx[i][j];
				}
			}
		}
		for (int j = 1; j <= n - k + 1; j++) {
			for (int i = m - k; i >= 1; i--) {
				clqx[i][j] = Math.max(clqx[i][j], clqx[i + 1][j]);
				clhx[i][j] = Math.max(clhx[i][j], clhx[i + 1][j]);
			}
		}
		for (int j = 1; j <= n - k + 1; j++) {
			for (int i = 2; i <= m - k + 1; i++) {
				clqs[i][j] = Math.max(clqs[i][j], clqs[i - 1][j]);
				clhs[i][j] = Math.max(clhs[i][j], clhs[i - 1][j]);
			}
		}
		for (int i = 1; i <= m - 3 * k + 1; i++) {
			for (int j = i + k; j <= m - 2 * k + 1; j++) {
				fin = Math.max(fin, clhs[i][1] + cbcl[j][0] + clhx[j + k][1]);
			}
		}
		for (int i = 1; i <= n - 3 * k + 1; i++) {
			for (int j = i + k; j <= n - 2 * k + 1; j++) {
				fin = Math.max(fin, clqs[1][i] + cbcl[0][j] + clhx[1][j + k]);
			}
		}
		for (int i = 1, l = m - 2 * k + 1; i <= l; i++) {
			for (int j = 1, o = n - 2 * k + 1; j <= o; j++) {
				fin = Math.max(fin, clqs[i][n - k + 1] + clqx[i + k][j] + clhx[i + k][j + k]);
				fin = Math.max(fin, clqx[i + k][n - k + 1] + clqs[i][j] + clhs[i][j + k]);
				fin = Math.max(fin, clqx[1][j] + clhs[i][j + k] + clhx[i + k][j + k]);
				fin = Math.max(fin, clhx[1][j + k] + clqs[i][j] + clqx[i + k][j]);
			}
		}

		System.out.println(fin);
	}

}