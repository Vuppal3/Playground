#include<stdio.h>
int main()
{
	int i,j,n;
  scanf("%d",&n);
  for(i=1,j=1;j<=n;i=i+2,j++)
  {
    printf("%d\n",i);
  }
}