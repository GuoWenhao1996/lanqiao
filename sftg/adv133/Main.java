package com.gwh.sftg.adv133;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int[] zjqk = new int[7];
	static int[] zjhm = new int[7];
	static int[] dqhm = new int[7];
	static Scanner sc = new Scanner(System.in);
	public static boolean wancheng = false;

	public static void main(String[] args) {
		int n = sc.nextInt();
		for (int i = 0; i < 7; i++)
			zjhm[i] = sc.nextInt();
		Arrays.sort(zjhm);
		if (n <= 1000) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < 7; j++) {
					dqhm[j] = sc.nextInt();
				}
				panduan(dqhm);
			}
			wancheng=true;
		} else {
			int n0 = n / 10000;
			for (int i = 0; i < n0; i++) {
				MyThread mt = new MyThread();
				Thread t = new Thread(mt, "T-" + i);
				t.start();
			}
			for (int i = 0; i < n % 10000; i++) {
				for (int j = 0; j < 7; j++) {
					dqhm[j] = sc.nextInt();
				}
				panduan(dqhm);
			}
		}
		while (true) {
			if (wancheng == true) {
				for (int i = 0; i < 7; i++)
					System.out.print(zjqk[i] + " ");
				break;
			}
		}
	}

	protected static void panduan(int[] dqhm) {
		Arrays.sort(dqhm);
		int index = 0;
		int jdj = 7;
		for (int j = 0; j < 7; j++) {
			if (dqhm[j] == zjhm[index])
				jdj--;
			else if (dqhm[j] > zjhm[index]) {
				j--;
				index++;
				if (index > 6) {
					break;
				}
			}
		}
		if (jdj != 7) {
			zjqk[jdj]++;
		}
	}

}

class MyThread implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			for (int j = 0; j < 7; j++) {
				Main.dqhm[j] = Main.sc.nextInt();
			}
			Main.panduan(Main.dqhm);
			Main.wancheng = false;
		}
		Main.wancheng = true;
	}
}