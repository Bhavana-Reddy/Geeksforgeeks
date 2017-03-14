#include<stdio.h>
main()
{
    int n,m,i,k;
    k=m+n;
    printf("enter the array of size (m+n) : ");
    int a[k];
    printf("enter the m elements in (m+n) size array : ");
    for(i=0;i<m;i++) {
        scanf("%d",&a[i]);
    }
    printf("enter the array of size n : ");
    int ar[n];
    printf("enter the n elements in n size array : ");
    for(i=0;i<n;i++) {
        scanf("%d",&ar[i]);
    }
    int j=0;
    for(i=0;i<n;i++) {
        if(a[i]==0) {
            a[i]=ar[k];
            j=j+1;
        }
        else
        a[i+1];
    }
    printf("the elements in the array of m+n size is : ",a[k]);


}
