package com.gwh.mns1.task1;

/*
标题：算年龄

英国数学家德摩根出生于19世纪初叶（即18xx年）。
他年少时便很有才华。一次有人问他的年龄，他回答说：
“到了x的平方那年，我刚好是x岁”。

请你计算一下，德摩根到底出生在哪一年。
题中的年龄指的是周岁。

请填写表示他出生年份的四位数字，不要填写任何多余内容。
 */
public class Main {
	public static void main(String[] args) {
		int age = 0;
		for (int i = 40; i < 50; i++) {
			if (i * i / 100 == 18) {
				age = i;
				break;
			}
		}
		System.out.println(age * age - age);
	}
}
