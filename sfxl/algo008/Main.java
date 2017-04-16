package com.gwh.sfxl.algo008;

import java.io.*;
import java.util.*;

public class Main {

	final static int MAX_N = 100007;

	class Node {
		int l, r;
		int sum, max;

		Node() {

		}

		Node(int _l, int _r, int _s, int _m) {
			l = _l;
			r = _r;
			sum = _s;
			max = _m;
		}
	}

	int n, m;
	Node tree[] = new Node[MAX_N << 2];
	int a[] = new int[MAX_N];

	void up(int id) {
		tree[id].sum = tree[id << 1].sum + tree[id << 1 | 1].sum;
		tree[id].max = Math.max(tree[id << 1].max, tree[id << 1 | 1].max);
	}

	void build(int id, int l, int r) {
		tree[id] = new Node(l, r, 0, 0);
		if (l == r) {
			tree[id].sum = tree[id].max = a[l];
			return;
		}
		int mid = (l + r) >> 1;
		build(id << 1, l, mid);
		build(id << 1 | 1, mid + 1, r);
		up(id);
	}

	void update(int id, int pos, int val) {
		if (tree[id].l == tree[id].r) {
			tree[id].sum = tree[id].max = val;
			return;
		}
		int mid = (tree[id].l + tree[id].r) >> 1;
		if (pos <= mid)
			update(id << 1, pos, val);
		else
			update(id << 1 | 1, pos, val);
		up(id);
	}

	int sum(int id, int l, int r) {
		if (l <= tree[id].l && tree[id].r <= r) {
			return tree[id].sum;
		}
		int mid = (tree[id].l + tree[id].r) >> 1;
		if (r <= mid)
			return sum(id << 1, l, r);
		else if (l > mid)
			return sum(id << 1 | 1, l, r);
		else {
			return sum(id << 1, l, mid) + sum(id << 1 | 1, mid + 1, r);
		}
	}

	int max(int id, int l, int r) {
		if (l <= tree[id].l && tree[id].r <= r) {
			return tree[id].max;
		}
		int mid = (tree[id].l + tree[id].r) >> 1;
		if (r <= mid)
			return max(id << 1, l, r);
		else if (l > mid)
			return max(id << 1 | 1, l, r);
		else {
			return Math.max(max(id << 1, l, mid), max(id << 1 | 1, mid + 1, r));
		}
	}

	void run() throws IOException {
		n = cin.nextInt();
		m = cin.nextInt();
		for (int i = 1; i <= n; ++i)
			a[i] = cin.nextInt();
		build(1, 1, n);
		for (int i = 0; i < m; ++i) {
			int type = cin.nextInt();
			int l = cin.nextInt();
			int r = cin.nextInt();
			if (type == 1)
				update(1, l, r);
			else if (type == 2)
				out.println(sum(1, l, r));
			else
				out.println(max(1, l, r));
		}
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
