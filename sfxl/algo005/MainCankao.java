package com.gwh.sfxl.algo005;

import java.io.*;
import java.util.*;

class MainCankao {
	static int n, m;
	static int[] u;
	static int[] v;
	static int[] w;
	static int[] d;
	static int[] first;
	static int[] next;
	static Queue<Integer> q = new LinkedList<Integer>();
	static boolean[] inq;

	public static void main(String[] args) throws IOException {
		int i;
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		String str = bfr.readLine();
		String[] s = str.split("\\s");
		n = Integer.parseInt(s[0]);
		m = Integer.parseInt(s[1]);
		n++;
		m++;
		u = new int[m];
		v = new int[m];
		w = new int[m];
		first = new int[n];
		next = new int[m];
		d = new int[n];
		inq = new boolean[n];
		for (i = 1; i < n; i++)
			first[i] = -1;
		for (i = 1; i < m; i++) {
			str = bfr.readLine();
			s = str.split(" ");
			u[i] = Integer.parseInt(s[0]);
			v[i] = Integer.parseInt(s[1]);
			w[i] = Integer.parseInt(s[2]);
			next[i] = first[u[i]];
			first[u[i]] = i;
		}
		spfa(1);
		for (i = 2; i < n; i++)
			System.out.println(d[i]);
	}

	public static void spfa(int s) {
		int i, x;
		for (i = 2; i < n; i++)
			d[i] = Integer.MAX_VALUE;
		q.offer(s);
		while (!q.isEmpty()) {
			x = q.poll();
			inq[x] = false;
			for (i = first[x]; i != -1; i = next[i])
				if (d[v[i]] > d[x] + w[i]) {
					d[v[i]] = d[x] + w[i];
					if (!inq[v[i]]) {
						inq[v[i]] = true;
						q.offer(v[i]);
					}
				}
		}
	}
}
