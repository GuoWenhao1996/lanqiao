/*
 *c++参考代码 
 * 
 */
 #include<stdio.h>
#include<string.h>
#include<queue>
#include<vector>
using namespace std;
int a[50];
int in[50];
int out[50];
int vis[30];
vector<int> map[30];
int main()
{
	int n,i,j,k,count=0;
	char ch1,ch2;
	memset(in,0,sizeof(in));
	memset(out,0,sizeof(out));
	memset(vis,0,sizeof(vis));
	while (scanf("%c>%c",&ch1,&ch2)!=EOF)
	{
		getchar();
		i=ch1-'A';
		j=ch2-'A';
		vis[i]=vis[j]=1;
		out[i]++;
		in[j]++;
		map[i].push_back(j);
	}
	n=0;
	for (i=0;i<26;i++)
	{
		if (vis[i]) n++;
	} 
	queue<int> que;
	for (i=0;i<26;i++)
	{
		if (vis[i]&&!in[i])
		{
			que.push(i);
		}
	}
	while (!que.empty())
	{
		k=que.front();
		que.pop();
		a[count++]=k;
		for (j=0;j<map[k].size();j++)
		{
			in[map[k][j]]--;
			if (in[map[k][j]]==0) que.push(map[k][j]);
		}
	}
	if (n!=count) printf("No Answer!\n");
	else
	{
		for (i=0;i<count;i++)
		{
			printf("%c",a[i]+'A');
		}
	}
	return 0;
} 
 