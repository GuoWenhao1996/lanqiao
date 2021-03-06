#include <bits/stdc++.h>
using namespace std;
int n,m;
int s[2005][2];
int sum=0;
int fd[1005];
int find(int x){   //并查集
	if(fd[x]==x) return x;
	return fd[x]=find(fd[x]);
}
int main()
{
	cin>>n>>m;
	for(int i=0;i<m;i++)
		cin>>s[i][0]>>s[i][1];
	int k1,k2;
	cin>>k1>>k2;
	for(int i=0;i<m;i++){   //枚举每一条边  然后去掉  然如果连通 就不是关键点
		for(int ii=1;ii<=n;ii++)fd[ii]=ii;
		for(int j=0;j<m;j++){
			if(i!=j){
				int a=find(s[j][0]); //并查集
				int b=find(s[j][1]);
				if(a!=b)
					fd[a]=b;
			}
		}
		int a=find(k1);
		int b=find(k2);   //查看两个端点是否连通
		if(a!=b) sum++;
	}
	cout<<sum<<endl;
	return 0;
} 