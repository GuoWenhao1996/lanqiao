package com.gwh.mns1.task6;

/*
 * 
题目：滑动解锁

滑动解锁是智能手机一项常用的功能。你需要在3x3的点阵上，从任意一个点开始，反复移动到一个尚未经过的"相邻"的点。这些划过的点所组成的有向折线，如果与预设的折线在图案、方向上都一致，那么手机将解锁。

所谓两个点“相邻”：当且仅当以这两个点为端点的线段上不存在尚未经过的点。

此外，许多手机都约定：这条折线还需要至少经过4个点。

为了描述方便，我们给这9个点从上到下、从左到右依次编号1-9。即如下排列：

1 2 3
4 5 6
7 8 9

那么1->2->3是非法的，因为长度不足。
1->3->2->4也是非法的，因为1->3穿过了尚未经过的点2。
2->4->1->3->6是合法的，因为1->3时点2已经被划过了。

某大神已经算出：一共有389112种不同的解锁方案。没有任何线索时，要想暴力解锁确实很难。
不过小Hi很好奇，他希望知道，当已经瞥视到一部分折线的情况下，有多少种不同的方案。
遗憾的是，小Hi看到的部分折线既不一定是连续的，也不知道方向。

例如看到1-2-3和4-5-6，
那么1->2->3->4->5->6，1->2->3->6->5->4, 3->2->1->6->5->4->8->9等都是可能的方案。


你的任务是编写程序，根据已经瞥到的零碎线段，求可能解锁方案的数目。

输入：
每个测试数据第一行是一个整数N(0 <= N <= 8)，代表小Hi看到的折线段数目。
以下N行每行包含两个整数 X 和 Y (1 <= X, Y <= 9)，代表小Hi看到点X和点Y是直接相连的。

输出：
对于每组数据输出合法的解锁方案数目。


例如：
输入：
8
1 2 2 3
3 4 4 5
5 6 6 7
7 8 8 9

程序应该输出：
2

再例如：
输入：
4
2 4
2 5
8 5
8 6

程序应该输出：
258


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
		System.out.println("查看参考答案");
	}
}