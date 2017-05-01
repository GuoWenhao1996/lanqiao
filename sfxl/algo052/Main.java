package com.gwh.sfxl.algo052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Collections;
import java.util.LinkedList;

public class Main {

	private static int vis[][];
	private static int count = 0, m;
	private static LinkedList<String> queue = new LinkedList<String>();

	public static void main(String[] args) throws IOException {

		StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

		st.nextToken();
		int n = (int) st.nval;
		st.nextToken();
		m = (int) st.nval;

		int arr[] = new int[n];
		vis = new int[n][n];
		for (int i = 0; i < n; i++) {
			arr[i] = i;
			for (int j = 0; j < n; j++) {
				st.nextToken();
				vis[i][j] = (int) st.nval;
			}
		}
		allsort(arr, 0);
		Collections.sort(queue);
		System.out.println(queue.get(m - 1));
	}

	private static void allsort(int arr[], int k) {

		if (arr.length == k) {
			int ok = 0;
			String str = "";
			for (int i = 0; i < arr.length - 1; i++) {
				if (vis[arr[i]][arr[i + 1]] == 0) {
					ok = 1;
					return;
				}
				str += arr[i] + " ";
			}

			if (ok == 0) {
				queue.add(str + arr[k - 1]);
			}
			return;
		}

		int tmp;
		for (int i = k; i < arr.length; i++) {
			tmp = arr[i];
			arr[i] = arr[k];
			arr[k] = tmp;
			allsort(arr, k + 1);
			tmp = arr[i];
			arr[i] = arr[k];
			arr[k] = tmp;
		}
	}
}
