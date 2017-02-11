package com.gwh.sftg.adv133;

import java.io.IOException;
import java.io.InputStream;

class Scanners {
	private InputStream is = System.in;

	public int nextInt() {
		try {
			int i;

			while ((i = is.read()) < 45 || i > 57) {
			}

			int mark = 1, temp = 0;

			if (i == 45) {
				mark = -1;
				i = is.read();
			}

			while (i > 47 && i < 58) {
				temp = temp * 10 + i - 48;
				i = is.read();
			}

			return temp * mark;
		} catch (IOException e) {
			e.printStackTrace();
		}

		return -1;
	}
}

public class MainCankao {

	public static void main(String[] args) {
		Scanners sc = new Scanners();
		int n = sc.nextInt();
		int[] arr = new int[34];
		for (int i = 0; i < 7; i++) {
			arr[sc.nextInt()] = 1;
		}
		int[] res = new int[8];
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < 7; j++) {
				if (arr[sc.nextInt()] == 1)
					count++;
			}
			res[7 - count]++;
		}
		for (int i = 0; i < 7; i++)
			System.out.print(res[i] + " ");
	}

}
