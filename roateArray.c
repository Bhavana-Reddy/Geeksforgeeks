#include<stdio.h>
main() {
    int n,i,k;
    printf("enter the n : ");
    scanf("%d",&n);
    int a[n];
    for(i=0;i<n;i++) {
        scanf("%d",&a[i]);
    }
    //k=n/2;
    for(i=n/2;i<=n-1;i++) {
        printf("%d",a[i]);
    }
    for(i=0;i<(n-1)/2;i++) {
         printf("%d",a[i]);
    }
}
