package com.gwh.jclx.basic08;

public class Main {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("");
		for (int i = 1000; i < 10000; i++) {
			s = new StringBuffer(i + "");
			int j = Integer.parseInt(s.reverse().toString());
			if (i == j)
				System.out.println(i);
		}
	}
}
