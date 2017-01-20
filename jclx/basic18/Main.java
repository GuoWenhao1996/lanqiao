package com.gwh.jclx.basic18;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
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
		System.out.println(d11[0] + "," + d11[1]);
		System.out.println(d12[0] + "," + d12[1]);
		System.out.println(d21[0] + "," + d21[1]);
		System.out.println(d22[0] + "," + d22[1]);

		if (d11[0] <= d22[0] && d12[0] >= d21[0] && d11[1] <= d22[1] && d12[1] >= d21[1]) {
			if (d22[1] >= d12[1]) {
				if()
			} else {

			}
		} else
			System.out.println("0.00");
	}
}
