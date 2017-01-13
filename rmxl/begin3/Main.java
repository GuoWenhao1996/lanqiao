package com.gwh.rmxl.begin3;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double s = Math.PI * r * r;
		// 错误。原因：末尾的0丢了
		// DecimalFormat df = new DecimalFormat("#.#######");
		BigDecimal bd = new BigDecimal(s);
		bd = bd.setScale(7, BigDecimal.ROUND_HALF_UP);
		System.out.println(bd);
	}
}
