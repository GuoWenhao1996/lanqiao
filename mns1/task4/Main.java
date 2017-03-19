package com.gwh.mns1.task4;

/*
标题：字符串比较
我们需要一个新的字符串比较函数compare(s1, s2).
对这个函数要求是：
1. 它返回一个整数，表示比较的结果。
2. 结果为正值，则前一个串大，为负值，后一个串大，否则，相同。
3. 结果的绝对值表示：在第几个字母处发现了两个串不等。

下面是代码实现。对题面的数据，结果为：
-3
2
5

仔细阅读源程序，填写划线位置缺少的代码。

-------------------------------------------------
Java语言代码：

static int compare(String s1, String s2)
{
	if(s1==null && s2==null) return 0;
	if(s1==null) return -1;
	if(s2==null) return 1;
	
	if(s1.isEmpty() && s2.isEmpty()) return 0;
	if(s1.isEmpty()) return -1;
	if(s2.isEmpty()) return 1;
	
	char x = s1.charAt(0);
	char y = s2.charAt(0);
	
	if(x<y) return -1;
	if(x>y) return 1;
	
	int t = compare(s1.substring(1),s2.substring(1));
	if(t==0) return 0;
	
	return ____________________ ; //填空位置
}

public static void main(String[] args)
{
	System.out.println(compare("abc", "abk"));
	System.out.println(compare("abc", "a"));
	System.out.println(compare("abcde", "abcda"));			
}

---------------------------
C/C++ 语言代码：
int compare(const char* s1, const char* s2)
{
	if(s1==NULL && s2==NULL) return 0;
	if(s1==NULL) return -1;
	if(s2==NULL) return 1;
	
	if(*s1 == 0 && *s2== 0) return 0;
	if(*s1 == 0) return -1;
	if(*s2 == 0) return 1;
	
	if(*s1<*s2) return -1;
	if(*s1>*s2) return 1;
	
	int t = compare(s1+1,s2+1);
	if(t==0) return 0;
	
	return __________________________; //填空位置
}


int main()
{
	printf("%d\n", compare("abc","abk"));
	printf("%d\n", compare("abc","a"));
	printf("%d\n", compare("abcde","abcda"));
	return 0;
}

注意：
只提交划线部分缺少的代码，不要包含已经存在的代码或符号。
也不要画蛇添足地写出任何注释或说明性文字。

注意选择你所使用的语言。


 */
public class Main {
	static int compare(String s1, String s2) {
		if (s1 == null && s2 == null)
			return 0;
		if (s1 == null)
			return -1;
		if (s2 == null)
			return 1;

		if (s1.isEmpty() && s2.isEmpty())
			return 0;
		if (s1.isEmpty())
			return -1;
		if (s2.isEmpty())
			return 1;

		char x = s1.charAt(0);
		char y = s2.charAt(0);

		if (x < y)
			return -1;
		if (x > y)
			return 1;

		int t = compare(s1.substring(1), s2.substring(1));
		if (t == 0)
			return 0;

		return t > 0 ? ++t : --t; // 填空位置
	}

	public static void main(String[] args) {
		System.out.println(compare("abc", "abk"));
		System.out.println(compare("abc", "a"));
		System.out.println(compare("abcde", "abcda"));
	}

}
