package com.gwh.mns1.task7;

/*
 * 
标题：风险度量

X星系的的防卫体系包含 n 个空间站。这 n 个空间站间有 m 条通信链路，构成通信网。
两个空间站间可能直接通信，也可能通过其它空间站中转。

对于两个站点x和y (x != y), 如果能找到一个站点z，使得：
当z被破坏后，x和y无法通信，则称z为关于x,y的关键站点。

显然，对于给定的两个站点，关于它们的关键点的个数越多，通信风险越大。


你的任务是：已知网络结构，求两站点之间的通信风险度，即：它们之间的关键点的个数。


输入数据第一行包含2个整数n(2 <= n <= 1000), m(0 <= m <= 2000),分别代表站点数，链路数。
空间站的编号从1到n。通信链路用其两端的站点编号表示。
接下来m行，每行两个整数 u,v (1 <= u, v <= n; u != v)代表一条链路。
最后1行，两个数u,v，代表被询问通信风险度的两个站点。

输出：一个整数，如果询问的两点不连通则输出-1.


例如：
用户输入：
7 6
1 3 2 3
3 4 3 5
4 5 5 6
1 6
则程序应该输出：
2


资源约定：
峰值内存消耗（含虚拟机） < 256M
CPU消耗  < 2000ms


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
