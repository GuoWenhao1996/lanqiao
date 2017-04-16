package com.gwh.sfxl.algo004;

import java.io.*;
import java.util.*;

public class Main {
	final static int MAX_N = 100010;
	final static long INF = (long) 1e16;

	class Edge {
		int u, v, nxt;

		Edge() {

		}

		Edge(int _u, int _v, int _n) {
			u = _u;
			v = _v;
			nxt = _n;
		}
	}

	int edgecnt;
	int dp[][] = new int[MAX_N][2];
	Edge E[] = new Edge[MAX_N * 2];
	int head[] = new int[MAX_N];
	int sta[] = new int[MAX_N * 2];
	boolean vis[] = new boolean[MAX_N];

	void add(int u, int v) {
		E[edgecnt] = new Edge(u, v, head[u]);
		head[u] = edgecnt++;
	}

	void dfs(int x, int fa) {
		Arrays.fill(vis, false);
		int top = 0;
		vis[x] = true;
		sta[top++] = x;
		while (top > 0) {
			int u = sta[top - 1];
			boolean Ed = false;
			for (int i = head[u]; i + 1 != 0; i = E[i].nxt) {
				int v = E[i].v;
				if (vis[v])
					continue;
				Ed = true;
				sta[top++] = v;
				vis[v] = true;
			}
			if (Ed)
				continue;
			--top;
			for (int i = head[u]; i + 1 != 0; i = E[i].nxt) {
				int v = E[i].v;
				dp[v][0] += Math.max(dp[u][0], dp[u][1]);
				dp[v][1] += dp[u][0];
			}
		}
	}

	void run() throws IOException {
		int n = cin.nextInt();
		for (int i = 1; i <= n; ++i)
			dp[i][1] = cin.nextInt();
		Arrays.fill(head, -1);
		for (int i = 1; i < n; ++i) {
			int u = cin.nextInt();
			int v = cin.nextInt();
			add(u, v);
			add(v, u);
		}
		dfs(1, -1);
		int ans = Math.max(dp[1][0], dp[1][1]);
		out.println(ans);
		out.close();
	}

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	Main() {
		cin = new InputReader(System.in);
		out = new PrintWriter(System.out);
	}

	PrintWriter out;
	InputReader cin;

	class InputReader {
		InputReader(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
			tokenizer = new StringTokenizer("");
		}

		private String next() throws IOException {
			while (!tokenizer.hasMoreTokens()) {
				tokenizer = new StringTokenizer(reader.readLine());
			}
			return tokenizer.nextToken();
		}

		public Integer nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		private BufferedReader reader;
		private StringTokenizer tokenizer;
	}
}
