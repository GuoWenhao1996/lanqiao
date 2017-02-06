package com.gwh.ljst.prev06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String output = sc.nextLine();
		char[] ic = input.toCharArray();
		char[] oc = output.toCharArray();
		int step = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.equals(output))
				break;
			else {
				step++;
				while (true) {
					if (ic[i] == oc[i])
						i++;
					else
						break;
				}
				if (oc[i] == '*')
					oc[i] = 'o';
				else
					oc[i] = '*';
				if (oc[i + 1] == '*')
					oc[i + 1] = 'o';
				else
					oc[i + 1] = '*';

				input = "";
				output = "";
				for (int index = 0; index < ic.length; index++) {
					input = input + ic[index];
					output = output + oc[index];
				}
			}
		}
		System.out.println(step);
	}
}
