#include <bits/stdc++.h>
using namespace std;
int fx[16][2]={{-1,0},{1,0},{0,-1},{0,1},
				{-1,-1},{-1,1},{1,-1},{1,1},
				{-1,-2},{-1,2},{1,-2},{1,2},
				{-2,-1},{-2,1},{2,-1},{2,1}};  //16个方向 
int fx2[8][4]={          //8个方向 要往上上 下下 左左 右右走 (保存上 然后走上上的时候好判断) 
	{-1,0,-2,0},{1,0,2,0},{0,-1,0,-2},{0,1,0,2},
	{-1,-1,-2,-2},{-1,1,-2,2},{1,-1,2,-2},{1,1,2,2}};
int n;
vector<int> vec[10];     //每个点的联通
int flag[10][10];       //标记走过的点
int sum=0;              //总数
class Pion{              //保存每个点的坐标
	public :
		int x,y;
};
Pion p[10];          //有9个点
int pd(int x,int y){             //判断符合条件
	if(x>0 && x<=3 && y>0 && y<=3 && flag[x][y]==0)
		return 1;
	return 0;
}
int pd2(int x,int y){           
	if(x>0 && x<=3 && y>0 && y<=3 && flag[x][y]==1)
		return 1;
	return 0;
}
void dfs(int k,int u,int s,int last){ //u表示 前一个属于连通点 s表示用了多少个连通点 last上一个点的标号
	if(s==n)        //符合条件
		sum++;
	if(u==0 && vec[k].size()>1) return ;
	if(vec[k].size()>u){         // 该点是连通点只有一个方向
		for(int i=0;i<vec[k].size();i++)
			if(vec[k][i]!=last){
				int kk=vec[k][i];
				flag[p[kk].x][p[kk].y]=1;
				dfs(kk,1,s+1,k);
				flag[p[kk].x][p[kk].y]=0;
			}
		
	}
	else{  //枚举每个方向  16+8个方向
		for(int i=0;i<16;i++){  /
			int x=p[k].x+fx[i][0],y=p[k].y+fx[i][1];
			if(pd(x,y)){
				flag[x][y]=1;
				dfs(3*(x-1)+y,0,s,k);
				flag[x][y]=0;
			}
		}
		for(int i=0;i<8;i++){
			int x=p[k].x+fx2[i][0],y=p[k].y+fx2[i][1];
			int x2=p[k].x+fx2[i][2],y2=p[k].y+fx2[i][3];
			if(pd2(x,y) && pd(x2,y2)){
				flag[x2][y2]=1;
				dfs(3*(x2-1)+y2,0,s,k);
				flag[x2][y2]=0;
			}
		}
	}
}
int main()
{
	cin>>n;
	int a,b;
	for(int i=0;i<n;i++){    //保存联通点
		cin>>a>>b;
		vec[a].push_back(b);
		vec[b].push_back(a);
	}
	for(int i=1,k=1;i<=3;i++)
		for(int j=1;j<=3;j++,k++)   //保存点的坐标
			p[k].x=i,p[k].y=j;
	for(int i=1;i<=3;i++)
		for(int j=1;j<=3;j++){    //每个点入口枚举
			int k=3*(i-1)+j;      //坐标判断点
			flag[p[k].x][p[k].y]=1;
			dfs(k,0,0,0);           
			flag[p[k].x][p[k].y]=0;
		}
			
	cout<<sum<<endl;
	return 0;
}
