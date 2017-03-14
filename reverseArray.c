#include<stdio.h>
main()
{

int n,i,j;
printf("enter the value of n : ");
scanf("%d",&n);
int a[n];
printf("enter the elements in the array  :  ");
for(i=0;i<n;i++) {
    scanf("%d",&a[i]);
}
printf("\nthe elements are : ");
for(i=n-1;i>0;i--) {
  printf("\n %d",a[i]);
}
}
