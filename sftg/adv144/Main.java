package com.gwh.sftg.adv144;

import java.io.*;
import java.util.*;

public class Main {
	void solve() {
		int[] d = new int[5005];
		int n = in.nextInt(), m = in.nextInt();
		for (int i = 0; i < n; i++) {
			int w = in.nextInt(), v = in.nextInt();
			for (int j = m; j - w >= 0; j--) {
				d[j] = Math.max(d[j], d[j - w] + v);
			}
		}
		out.println(d[m]);
	}

	FastScanner in;
	PrintWriter out;

	void run(String s) {
		if (s == null) {
			in = new FastScanner();
		} else {
			in = new FastScanner(s);
		}
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	public static void main(String[] args) {
		new Main().run(null);
	}

	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		FastScanner(String file) {
			try {
				br = new BufferedReader(new FileReader(file));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		boolean hasMoreTokens() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					String s = br.readLine();
					if (s == null)
						return false;
					st = new StringTokenizer(s);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return true;
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}
	}
}
