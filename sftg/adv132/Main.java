package com.gwh.sftg.adv132;

import java.util.Scanner;

public class Main {
	private static int a = 0;
	private static int b = 0;
	private static int c = 0;
	private static int d = 0;
	private static int e = 0;
	private static int f = 0;
	private static int g = 0;
	private static int h = 0;
	private static int i = 0;
	private static int j = 0;
	private static int k = 0;
	private static int l = 0;
	private static int m = 0;
	private static int n = 0;
	private static int o = 0;
	private static int p = 0;
	private static int q = 0;
	private static int r = 0;
	private static int s = 0;
	private static int t = 0;
	private static int u = 0;
	private static int v = 0;
	private static int w = 0;
	private static int x = 0;
	private static int y = 0;
	private static int z = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int max = 0;
		int min = 100;
		int sum = 0;
		for (int i0 = 0; i0 < input.length(); i0++) {
			if (count(input.charAt(i0)) == 0) {
				sum = 0;
				for (int j0 = i0; j0 < input.length(); j0++) {
					if (input.charAt(j0) == input.charAt(i0))
						sum++;
				}
				if (sum > max)
					max = sum;
				if (sum < min)
					min = sum;

				if (input.charAt(i0) == 'a')
					a = sum;
				else if (input.charAt(i0) == 'b')
					b = sum;
				else if (input.charAt(i0) == 'c')
					c = sum;
				else if (input.charAt(i0) == 'd')
					d = sum;
				else if (input.charAt(i0) == 'e')
					e = sum;
				else if (input.charAt(i0) == 'f')
					f = sum;
				else if (input.charAt(i0) == 'g')
					g = sum;
				else if (input.charAt(i0) == 'h')
					h = sum;
				else if (input.charAt(i0) == 'i')
					i = sum;
				else if (input.charAt(i0) == 'j')
					j = sum;
				else if (input.charAt(i0) == 'k')
					k = sum;
				else if (input.charAt(i0) == 'l')
					l = sum;
				else if (input.charAt(i0) == 'm')
					m = sum;
				else if (input.charAt(i0) == 'n')
					n = sum;
				else if (input.charAt(i0) == 'o')
					o = sum;
				else if (input.charAt(i0) == 'p')
					p = sum;
				else if (input.charAt(i0) == 'q')
					q = sum;
				else if (input.charAt(i0) == 'r')
					r = sum;
				else if (input.charAt(i0) == 's')
					s = sum;
				else if (input.charAt(i0) == 't')
					t = sum;
				else if (input.charAt(i0) == 'u')
					u = sum;
				else if (input.charAt(i0) == 'v')
					v = sum;
				else if (input.charAt(i0) == 'w')
					w = sum;
				else if (input.charAt(i0) == 'x')
					x = sum;
				else if (input.charAt(i0) == 'y')
					y = sum;
				else if (input.charAt(i0) == 'z')
					z = sum;
			}
		}
		if (zhishu(max - min)) {
			System.out.println("Lucky Word");
			System.out.println(max - min);
		} else {
			System.out.println("No Answer");
			System.out.println(0);
		}
	}

	private static boolean zhishu(int aaa) {
		if (aaa == 1 || aaa == 0)
			return false;
		for (int i = 2; i < aaa; i++) {
			if (aaa % i == 0)
				return false;
		}
		return true;
	}

	private static int count(char charAt) {
		if (charAt == 'a')
			return a;
		else if (charAt == 'b')
			return b;
		else if (charAt == 'c')
			return c;
		else if (charAt == 'd')
			return d;
		else if (charAt == 'e')
			return e;
		else if (charAt == 'f')
			return f;
		else if (charAt == 'g')
			return g;
		else if (charAt == 'h')
			return h;
		else if (charAt == 'i')
			return i;
		else if (charAt == 'j')
			return j;
		else if (charAt == 'k')
			return k;
		else if (charAt == 'l')
			return l;
		else if (charAt == 'm')
			return m;
		else if (charAt == 'n')
			return n;
		else if (charAt == 'o')
			return o;
		else if (charAt == 'p')
			return p;
		else if (charAt == 'q')
			return q;
		else if (charAt == 'r')
			return r;
		else if (charAt == 's')
			return s;
		else if (charAt == 't')
			return t;
		else if (charAt == 'u')
			return u;
		else if (charAt == 'v')
			return v;
		else if (charAt == 'w')
			return w;
		else if (charAt == 'x')
			return x;
		else if (charAt == 'y')
			return y;
		else if (charAt == 'z')
			return z;
		return 0;
	}
}
