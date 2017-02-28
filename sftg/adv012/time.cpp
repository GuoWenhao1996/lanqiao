#include<iostream>
using namespace std;
int main() {
	int n = 0;
	cin>>n;
	int time = 0;
	for (int i = 0; i < n; i++) {
		cin>>time;
		int h = time / 60 / 60;
		int m = time/ 60 % 60;
		int s = time % 60;
		if (h < 10)
			cout<<"0"<<h;
		else
			cout<<h;
		if (m < 10)
			cout<<":0"<<m;
		else
			cout<<":"<<m;
		if (s < 10)
			cout<<":0" << s<<endl;
		else
			cout<<":" <<s<<endl;
	}
	return 0;
}

