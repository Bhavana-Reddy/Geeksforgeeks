#include<stdio.h>
void main() {
int n;
printf("enter the elements in array :");
scanf("%de",&n);
int a[n];
printf("enter the array elements :");
int i;
for(i=0;i<n;i++){
scanf("%d",&a[i]);
}
int d;
printf("enter number of elements to be rotated :");
scanf("%d",&d);
int j;
for(j=d;j<n;j++){
printf("%d\n",a[j]);
}
for(j=0;j<d;j++){
printf("%d\n",a[j]);
}

}
