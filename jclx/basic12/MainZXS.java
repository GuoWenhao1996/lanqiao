package com.gwh.jclx.basic12;

import java.util.Scanner;

public class MainZXS {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for (int i = 0; i < num; i++) {
			char[] s = in.next().toCharArray();
			StringBuilder sb = new StringBuilder();
			// 先转为2进制
			for (int j = 0; j < s.length; j++) {
				if (s[j] >= '0' && s[j] <= '9') {
					int temp = s[j] - '0';
					String b = Integer.toBinaryString(temp);
					for (int k = 0; k < 4 - b.length(); k++) {
						sb.append("0");
					}
					sb.append(b);
				} else {
					int temp = s[j] - 'A' + 10;
					String b = Integer.toBinaryString(temp);
					for (int k = 0; k < 4 - b.length(); k++) {
						sb.append("0");
					}
					sb.append(b);
				}
			}
			// 转为8进制
			// System.out.println(sb.toString());
			sb.reverse();

			StringBuilder result = new StringBuilder();
			char[] ss = sb.toString().toCharArray();
			for (int j = 0; j < ss.length; j += 3) {
				int t0 = (ss[j] - '0') == 0 ? 0 : 1;
				int t1 = 0;
				int t2 = 0;
				if (j + 1 < ss.length) {
					t1 = (ss[j + 1] - '0') == 0 ? 0 : 2;
				}
				if (j + 2 < ss.length) {
					t2 = (ss[j + 2] - '0') == 0 ? 0 : 4;
				}
				result.append(t0 + t1 + t2 + "");
			}
			char ch = result.charAt(result.length() - 1);
			if (ch == '0') {
				result.deleteCharAt(result.length() - 1);
			}
			System.out.println(result.reverse().toString());

		}

	}

}
