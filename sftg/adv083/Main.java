package com.gwh.sftg.adv083;

public class Main {
	public static void main(String[] args) {
		int temp2 = 0;
		int temp3 = 0;
		int[] c = new int[9];
		boolean b = false;
		for (int i = 123; i < 333; i++) {
			c[0] = i / 100;
			c[1] = i / 10 % 10;
			c[2] = i % 10;
			temp2 = i * 2;
			c[3] = temp2 / 100;
			c[4] = temp2 / 10 % 10;
			c[5] = temp2 % 10;
			temp3 = i * 3;
			c[6] = temp3 / 100;
			c[7] = temp3 / 10 % 10;
			c[8] = temp3 % 10;
			b = true;
			for (int j = 0; j < 9; j++) {
				if (!b || c[j] == 0) {
					b = false;
					break;
				}
				for (int k = j + 1; k < 9; k++)
					if (c[j] == c[k]) {
						b = false;
						break;
					}
			}
			if (b)
				System.out.println(i + " " + temp2 + " " + temp3);
		}
	}
}