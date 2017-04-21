package com.gwh.sfxl.algo026;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		String result;
		BigInteger a = new BigInteger("2");

		result = pow(a, p).toString();
		int count = result.length();
		for (int b = 0; b < 500 - count; b++)
			result = 0 + result;
		System.out.println((int) (p * Math.log10(2)) + 1);
		for (int b = 0; b < 10; b++)
			System.out.println(result.substring(b * 50, (b + 1) * 50));
	}

	public static BigInteger pow(BigInteger a, int b) {
		BigInteger x = new BigInteger("1");
		String s;
		int len;

		while (b > 0) {
			if (b % 2 == 1) {
				x = x.multiply(a);
				s = x.toString();
				len = s.length();
				if (len > 500) {
					x = new BigInteger(s.substring(len - 500, len));
				}
			}
			a = a.pow(2);
			s = a.toString();
			len = s.length();
			if (len > 500) {
				a = new BigInteger(s.substring(len - 500, len));
			}
			b /= 2;
		}
		return x.subtract(new BigInteger("1"));
	}
}
