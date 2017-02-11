package com.gwh.sftg.adv161;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 * @author wc
 * 
 */
public class MainCankao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String num = sc.nextLine();
		if (!num.contains("2") || !num.contains("0") || !num.contains("1")
				|| num.indexOf("2") == num.lastIndexOf("2")) {
			System.out.println(-1);
			return;
		}
		Queue<String> que = new LinkedList<String>();
		Set<String> hashSet = new HashSet<String>();
		que.add(num);
		int count = 0;
		while (!que.isEmpty()) {
			int size = que.size();
			for (int i = 0; i < size; i++) {
				String poll = que.poll();
				if (poll.contains("2012")) {
					System.out.println(count);
					return;
				}
				char[] arr = poll.toCharArray();
				for (int j = 0; j < arr.length - 1; j++) {
					swap(arr, j, j + 1);
					String valueOf = String.valueOf(arr);
					if (!hashSet.contains(valueOf)) {
						que.add(valueOf);
						hashSet.add(valueOf);
					}
					swap(arr, j, j + 1);
				}

			}
			count++;
		}
		System.out.println(-1);
	}

	private static void swap(char[] arr, int j, int i) {
		arr[j] = (char) (arr[j] ^ arr[i]);
		arr[i] = (char) (arr[i] ^ arr[j]);
		arr[j] = (char) (arr[j] ^ arr[i]);
	}
}
