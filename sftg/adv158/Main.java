package com.gwh.sftg.adv158;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String cmd = sc.nextLine();
		int index = 0;
		boolean[] cunzai = new boolean[2013];
		for (int i = 0; i < n; i++) {
			cmd = sc.nextLine();
			if (cmd.equals("New")) {
				cunzai[index] = true;
				index++;
				System.out.println(index);
				while (true) {
					if (cunzai[index])
						index++;
					else
						break;
				}
			} else {
				int temp = Integer.parseInt(cmd.substring(7)) - 1;
				if (cunzai[temp]) {
					System.out.println("Successful");
					cunzai[temp] = false;
					if (temp < index)
						index = temp;
				} else
					System.out.println("Failed");
			}
		}
	}
}
