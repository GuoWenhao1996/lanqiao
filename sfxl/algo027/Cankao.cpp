/*
 * 此题只有c++参考代码
 */
#include<cstdio> 
#include<cstdlib> 
#include<cstring> 
int a[2100][3],f[1100],v=1,s=1; 
void g(int x,int y) 
{ 
    if(y-x+1>1) 
    { 
      int vv=v,v1,v2; 
      a[vv][0]=v+1;v++;v1=v; 
      g(x,x+(y-x)/2); 
      a[vv][1]=v+1;v++;v2=v; 
      g(x+(y-x)/2+1,y); 
      if(a[v1][2]==a[v2][2])a[vv][2]=a[v1][2]; 
      else a[vv][2]=2; 
    } 
    else{a[v][0]=-1;a[v][1]=-1;a[v][2]=f[s];s++;} 
} 
void h(int x) 
{ 
    if(a[x][0]!=-1)h(a[x][0]); 
    if(a[x][1]!=-1)h(a[x][1]); 
    if(a[x][2]==0)printf("B"); 
    if(a[x][2]==1)printf("I"); 
    if(a[x][2]==2)printf("F"); 
} 
int main() 
{ 
    int n=1,i,nn; 
    char c; 
    scanf("%d\n",&nn); 
    for(i=1;i<=nn;i++)n*=2; 
    for(i=1;i<=n;i++){scanf("%c",&c);f[i]=c-'0';} 
    g(1,n); 
    h(1); 
    printf("\n"); 
    return 0; 
}

 