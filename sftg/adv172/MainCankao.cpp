/*
 *c++参考代码 
 * 
 */
#include<stdio.h>
#include<string.h>
#include<algorithm>
using namespace std;
struct node{
	char s[30];
	int year;
	int mon;
	int day;
	friend bool operator < (node a,node b)
	{
		a.year=(a.s[6]-'0')*1000+(a.s[7]-'0')*100+(a.s[8]-'0')*10+a.s[9]-'0';
		a.mon=(a.s[10]-'0')*10+a.s[11]-'0';
		a.day=(a.s[12]-'0')*10+a.s[13]-'0';
		b.year=(b.s[6]-'0')*1000+(b.s[7]-'0')*100+(b.s[8]-'0')*10+b.s[9]-'0';
		b.mon=(b.s[10]-'0')*10+b.s[11]-'0';
		b.day=(b.s[12]-'0')*10+b.s[13]-'0';
		if (a.year<b.year) return 0;
		else if (a.year>b.year) return 1;
		if (a.mon<b.mon) return 0;
		else if (a.mon>b.mon) return 1;
		if (a.day<b.day) return 0;
		else if (a.day>b.day) return 1;
		for (int i=0;i<18;i++)
		{
			if (a.s[i]>b.s[i]) return 1;
			else if (a.s[i]<b.s[i]) return 0;
		}
		return 0;
	}
};
node a[100010];
int main()
{
	int n,i,j,k;
	scanf("%d",&n);
	for (i=0;i<n;i++)
	{
		scanf("%s",a[i].s);
	}
	sort(a,a+n);
	for (i=0;i<n;i++)
	{
		printf("%s\n",a[i].s);
	}
	return 0;
}

