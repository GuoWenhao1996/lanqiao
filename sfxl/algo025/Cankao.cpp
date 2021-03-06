/*
 * 此题只有c++参考代码
 */
#include <float.h> 
#include <math.h> 
#include <stdio.h> 
#include<cstring>
#define Sqr(x) ((x)*(x)) 

double s[400][400], x[400], y[400]; 

int main() 
{ 
    int a, b, n, tt,t,i,j,k,N; 
		double res = DBL_MAX; 
		scanf("%d%d%d%d", &n, &tt, &a, &b); 
		a-=1; 
		b-=1; 
		for ( i = 0; i < n; ++i) 
		{ 
			for ( j = 0; j < 3; ++j) 
				scanf("%lf%lf", &x[i*4+j], &y[i*4+j]); 
			scanf("%d", &t); 
			for (j = 0; j < 3; ++j) 
			{ 
				double x1 = x[i*4+(j+1)%3], y1 = y[i*4+(j+1)%3], 
					x2 = x[i*4+(j+2)%3], y2 = y[i*4+(j+2)%3]; 
				if (fabs((x[i*4+j]-x1)*(x[i*4+j]-x2)+(y[i*4+j]-y1)*(y[i*4+j]-y2)) < 1E-7) 
					x[i*4+3] = x1+x2-x[i*4+j], y[i*4+3] = y1+y2-y[i*4+j]; 
			} 
			for ( j = 0; j < 4; ++j) 
				for (k = 0; k < 4; ++k) 
					s[i*4+j][i*4+k] = t*sqrt(Sqr(x[i*4+j]-x[i*4+k])+Sqr(y[i*4+j]-y[i*4+k])); 
			for ( j = 0; j < i*4; ++j) 
				for ( k = 0; k < 4; ++k) 
					s[i*4+k][j] = tt*sqrt(Sqr(x[i*4+k]-x[j])+Sqr(y[i*4+k]-y[j])), 
					s[j][i*4+k] = s[i*4+k][j]; 
		} 
		for ( k = 0; k < n*4; ++k) 
			for (i = 0; i < n*4; ++i) 
				for ( j = 0; j < n*4; ++j) 
					if (s[i][k]+s[k][j] < s[i][j]) 
						s[i][j] = s[i][k]+s[k][j]; 
		for (i = 0; i < 4; ++i) 
			for ( j = 0; j < 4; ++j) 
				if (s[a*4+i][b*4+j] < res) 
					res = s[a*4+i][b*4+j]; 
		printf("%.1lf\n", res); 
	return 0;
}

