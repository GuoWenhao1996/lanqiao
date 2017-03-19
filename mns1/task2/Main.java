package com.gwh.mns1.task2;

import java.util.Arrays;

/*
题目：猜算式
你一定还记得小学学习过的乘法计算过程，比如：
   273
x   15
------
  1365
  273
------
  4095
请你观察如下的乘法算式
    ***
x   ***
--------
    ***
   ***
  ***
--------
  *****
星号代表某位数字，注意这些星号中，
0~9中的每个数字都恰好用了2次。
(如因字体而产生对齐问题，请参看图p1.jpg)
请写出这个式子最终计算的结果，就是那个5位数是多少？
注意：只需要填写一个整数，不要填写任何多余的内容。比如说明文字。
 */
public class Main {
	public static void main(String[] args) {
		int[] array = new int[20];
		boolean keneng = false;
		for (int i = 100; i < 999; i++) {
			for (int j = 100; j < 999; j++) {
				keneng = true;
				int num = i * j;
				if (num > 99999)
					break;
				array[0] = i / 100;
				array[1] = i % 100 / 10;
				array[2] = i % 10;

				array[3] = j / 100;
				array[4] = j % 100 / 10;
				array[5] = j % 10;

				int num1 = i * array[5];
				if (num1 > 999)
					continue;
				int num2 = i * array[4];
				if (num2 > 999)
					continue;
				int num3 = i * array[3];
				if (num3 > 999)
					continue;
				array[6] = num / 10000;
				array[7] = num % 10000 / 1000;
				array[8] = num % 1000 / 100;
				array[9] = num % 100 / 10;
				array[10] = num % 10;

				array[11] = num1 / 100;
				array[12] = num1 % 100 / 10;
				array[13] = num1 % 10;
				array[14] = num2 / 100;
				array[15] = num2 % 100 / 10;
				array[16] = num2 % 10;
				array[17] = num3 / 100;
				array[18] = num3 % 100 / 10;
				array[19] = num3 % 10;
				Arrays.sort(array);
				for (int k = 2; k < 20; k++) {
					if (array[k] == array[k - 1] && array[k] == array[k - 2]) {
						keneng = false;
						break;
					}
				}
				if (keneng) {
					System.out.println(num);
				}
			}
		}
	}
}
