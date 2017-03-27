package com.gwh.mns1.task5;

import java.math.BigDecimal;
import java.util.Scanner;

/*
标题： 还款计算

银行贷款的等额本息还款方法是：
每月还固定的金额，在约定的期数内正好还完（最后一个月可能会有微小的零头出入）。

比如说小明在银行贷款1万元。贷款年化利率为5%，贷款期限为24个月。
则银行会在每个月进行结算：
结算方法是：计算本金在本月产生的利息： 本金 x (年利率/12)
则本月本金结余为：本金 + 利息 - 每月固定还款额
计算结果会四舍五入到“分”。

经计算，此种情况下，固定还款额应为：438.71

这样，第一月结算时的本金余额是：
9602.96
第二个月结算：
9204.26
第三个月结算：
8803.9
....
最后一个月如果仍按固定额还款，则最后仍有0.11元的本金余额，
但如果调整固定还款额为438.72, 则最后一个月会多还了银行0.14元。
银行会选择最后本金结算绝对值最小的情况来设定 每月的固定还款额度。
如果有两种情况最后本金绝对值相同，则选择还款较少的那个方案。

本题的任务是已知年化利率，还款期数，求每月的固定还款额度。

假设小明贷款为1万元，即：初始本金=1万元。
年化利率的单位是百分之多少。
期数的单位为多少个月。

输入为2行，
第一行为一个小数r，表示年率是百分之几。(0<r<30)
第二行为一个整数n，表示还款期限。 (6<=n<=120)

要求输出为一个整数，表示每月还款额（单位是：分）

例如：
输入：
4.01
24

程序应该输出：
43429

再比如：
输入：
6.85
36

程序应该输出：
30809

资源约定：
峰值内存消耗（含虚拟机） < 256M
CPU消耗  < 1000ms


请严格按要求输出，不要画蛇添足地打印类似：“请您输入...” 的多余内容。

所有代码放在同一个源文件中，调试通过后，拷贝提交该源码。
java选手注意：不要使用package语句。不要使用jdk1.7及以上版本的特性。
java选手注意：主类的名字必须是：Main，否则按无效代码处理。

c/c++选手注意: main函数需要返回0
c/c++选手注意: 只使用ANSI C/ANSI C++ 标准，不要调用依赖于编译环境或操作系统的特殊函数。
c/c++选手注意: 所有依赖的函数必须明确地在源文件中 #include <xxx>， 不能通过工程设置而省略常用头文件。

提交程序时，注意选择所期望的语言类型和编译器类型。



 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		int n = sc.nextInt();
		double sum = 10000;
		double money = sum / n;
		double min = 0;
		double temp = 1;
		money = siSheWuRu(money);
		boolean flag = true;
		while (flag) {
			money = money + 0.01;
			money = siSheWuRu(money);
			sum = 10000;
			for (int i = 0; i < n; i++) {
				sum = sum + sum * (r / 1200) - money;
				sum = siSheWuRu(sum);
				if (Math.abs(sum) < temp) {
					min = money;
					temp = Math.abs(sum);
					break;
				}
				if (sum < 0) {
					flag = false;
					break;
				}
			}
		}
		System.out.println((int)(min*100+0.5));
	}

	private static double siSheWuRu(double money) {
		BigDecimal bd = new BigDecimal(money);
		bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
		return bd.doubleValue();
	}
}
