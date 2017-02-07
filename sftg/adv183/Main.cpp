/*
 *c++版本，正确率仍为50% 
 */
#include<iostream>
using namespace std;
int main(){
	int N=0;
	cin>>N;
	int* count = new int[N];
	int i=0;
	for(i=0;i<N;i++)
		count[i]=0;
	int M =0;
	cin>>M;
	for (i = 0; i < M; i++) {
		int Li =0;
		int Ri = 0;
		int Ci = 0;
		cin>>Li>>Ri>>Ci;
		for (int j = Li - 1; j < Ri; j++)
			count[j] = count[j] + Ci;
	}
	for (i = 0; i < N; i++)
		cout<<count[i]<<" ";
	return 0;
}
 