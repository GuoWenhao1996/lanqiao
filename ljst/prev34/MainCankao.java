package com.gwh.ljst.prev34;

import java.math.*;
import java.util.*;

public class MainCankao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		String m = sc.next();
		BigInteger sum = new BigInteger("1");

		BigInteger bn = new BigInteger(n);
		BigInteger bm = new BigInteger(m);
		bn = kaifang(bn, new BigInteger(bn.toString().substring((int) (n.length() / 2))), 1);
		bm = kaifang(bm, new BigInteger(bm.toString().substring((int) (m.length() / 2))), 1);

		sum = sum.multiply(bn).multiply(bm);

		System.out.println(sum);
	}

	private static BigInteger kaifang(BigInteger b, BigInteger bi, int i) {
		if ((bi.multiply(bi).add(b)).divide(bi).divide(new BigInteger("2")).equals(bi)) {
			// System.out.println(i);
			return bi;
		} else {
			return kaifang(b, (bi.multiply(bi).add(b)).divide(bi).divide(new BigInteger("2")), i + 1);
		}
	}
}
