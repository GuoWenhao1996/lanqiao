package com.gwh.mns1.task3;

/*
标题： 排列序数
X星系的某次考古活动发现了史前智能痕迹。
这是一些用来计数的符号，经过分析它的计数规律如下：
（为了表示方便，我们把这些奇怪的符号用a~q代替）
abcdefghijklmnopq 表示0
abcdefghijklmnoqp 表示1
abcdefghijklmnpoq 表示2
abcdefghijklmnpqo 表示3
abcdefghijklmnqop 表示4
abcdefghijklmnqpo 表示5
abcdefghijklmonpq 表示6
abcdefghijklmonqp 表示7
.....
在一处石头上刻的符号是：
bckfqlajhemgiodnp
请你计算出它表示的数字是多少？
请提交该整数，不要填写任何多余的内容，比如说明或注释。
 */
public class Main {
	static String ss = "abcdefghijklmnopq";
	static char s[] = ss.toCharArray();
	static long[] fc = new long[18];
	static int[] flag = new int[115];

	static int f(int b) {
		int sum = 0;
		for (int i = 'a'; i < b; i++) {
			if (flag[i] == 0)
				sum++;
		}
		flag[b] = 1;
		return sum;
	}

	public static void main(String[] args) {
		String pp = "bckfqlajhemgiodnp";
		char[] p = pp.toCharArray();
		fc[1] = 1;
		for (int i = 2; i < 18; i++) // 求阶乘
			fc[i] = fc[i - 1] * i;
		long sum = 0;
		for (int i = 0; i < s.length - 1; i++) { // 求每一位对应的值
			sum += fc[s.length - 1 - i] * (f(p[i]));
		}
		System.out.println(sum);
	}
}
