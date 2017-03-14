#include<stdio.h>
main() {
    int n,i,k;
    int sum=0;
    printf("enter the number n : ");
    scanf("%d",&n);
    int a[n];
    for(i=0;i<n;i++) {
        scanf("%d",&a[i]);
    }
     int g;
    g= ((n+2)*(n+1))/2;
    printf("the total sum is %d",g);

    for(i=0;i<n;i++) {
        sum=sum+a[i];
    }
    printf("sum is %d",sum);
    k=g-sum;
    printf("the element which is missing is %d",k);
}
