package com.gwh.sfxl.algo006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Reader3 {
	static BufferedReader reader;
	static StringTokenizer tokenizer;

	static void init(InputStream input) {
		reader = new BufferedReader(new InputStreamReader(input));
		tokenizer = new StringTokenizer("");
	}

	static String next() throws IOException {
		while (!tokenizer.hasMoreElements()) {
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}

	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	static double nextDouble() throws IOException {
		return Double.parseDouble(next());
	}
}

class KruskalDui {
	int a, b, l;
}

public class MainCankao {

	/**
	 * @param args
	 * @throws IOException
	 */
	static int father[] = new int[100000];
	static ArrayList<KruskalDui> path = new ArrayList<KruskalDui>();

	public static int getfather(int x) {
		if (x != father[x]) {
			father[x] = getfather(father[x]);
		}
		return father[x];
	}

	public static void _qst_w(int l, int r) {
		int i = l, j = r, mw = path.get((i + j) / 2).l;
		while (i <= j) {
			while (path.get(i).l < mw)
				i++;
			while (path.get(j).l > mw)
				j--;
			if (i <= j) {
				Collections.swap(path, i, j);
				i++;
				j--;
			}
		}
		if (l < j)
			_qst_w(l, j);
		if (i < r)
			_qst_w(i, r);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Reader3.init(System.in);
		int n = Reader3.nextInt();
		int p = Reader3.nextInt();
		int d[] = new int[n + 1];
		int minD = Integer.MAX_VALUE;
		for (int i = 1; i < n + 1; i++) {
			d[i] = Reader3.nextInt();
			father[i] = i;
			if (d[i] < minD) {
				minD = d[i];
			}
		}
		for (int i = 0; i < p; i++) {
			KruskalDui k = new KruskalDui();
			k.a = Reader3.nextInt();
			k.b = Reader3.nextInt();
			k.l = Reader3.nextInt();
			k.l = k.l * 2 + d[k.a] + d[k.b];
			path.add(k);
		}
		_qst_w(0, p - 1);
		int fx, fy, result = minD, count = 0, k = 0;
		while (count < n - 1) {
			fx = getfather(path.get(k).a);
			fy = getfather(path.get(k).b);
			if (fx != fy) {
				father[fx] = fy;
				result += path.get(k).l;
				count++;
			}
			k++;
		}
		System.out.println(result);
	}
}
