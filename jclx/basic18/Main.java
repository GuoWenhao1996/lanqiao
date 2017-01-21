package com.gwh.jclx.basic18;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double S = 0;
		Scanner sc = new Scanner(System.in);
		double[] d11 = new double[2];
		double[] d12 = new double[2];
		double[] d21 = new double[2];
		double[] d22 = new double[2];
		d11[0] = sc.nextDouble();
		d11[1] = sc.nextDouble();
		d12[0] = sc.nextDouble();
		d12[1] = sc.nextDouble();
		if (d11[0] > d12[0]) {
			double temp = d11[0];
			d11[0] = d12[0];
			d12[0] = temp;
		}
		if (d11[1] > d12[1]) {
			double temp = d11[1];
			d11[1] = d12[1];
			d12[1] = temp;
		}
		d21[0] = sc.nextDouble();
		d21[1] = sc.nextDouble();
		d22[0] = sc.nextDouble();
		d22[1] = sc.nextDouble();
		if (d21[0] > d22[0]) {
			double temp = d21[0];
			d21[0] = d22[0];
			d22[0] = temp;
		}
		if (d21[1] > d22[1]) {
			double temp = d21[1];
			d21[1] = d22[1];
			d22[1] = temp;
		}
		if ((d12[0] - d11[0]) * (d12[1] - d11[1]) > (d22[0] - d21[0]) * (d22[1] - d21[1])) {
			double[] d00 = d11;
			d11 = d21;
			d21 = d00;
			d00 = d12;
			d12 = d22;
			d22 = d00;
		}
		if (d11[0] <= d22[0] && d12[0] >= d21[0] && d11[1] <= d22[1] && d12[1] >= d21[1]) {
			if (d22[1] >= d12[1]) {
				if (d11[1] <= d21[1]) {
					if (d22[0] >= d12[0]) {
						if (d11[0] <= d21[0]) {
							S = (d12[1] - d21[1]) * (d12[0] - d21[0]);
						} else {
							S = (d12[1] - d21[1]) * (d12[0] - d11[0]);
						}
					} else {
						S = (d12[1] - d21[1]) * (d22[0] - d11[0]);
					}
				} else {
					if (d22[0] >= d12[0]) {
						if (d11[0] <= d21[0]) {
							S = (d12[1] - d11[1]) * (d12[0] - d21[0]);
						} else {
							S = (d12[1] - d11[1]) * (d12[0] - d11[0]);
						}
					} else {
						S = (d12[1] - d11[1]) * (d22[0] - d11[0]);
					}
				}
			} else {
				if (d22[0] >= d12[0]) {
					if (d11[0] <= d21[0]) {
						S = (d22[1] - d11[1]) * (d12[0] - d21[0]);
					} else {
						S = (d22[1] - d11[1]) * (d12[0] - d11[0]);
					}
				} else {
					S = (d22[1] - d11[1]) * (d22[0] - d11[0]);
				}
			}
		} else
			S = 0.00;
		BigDecimal bd = new BigDecimal(S);
		bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
		System.out.println(bd);
	}
}