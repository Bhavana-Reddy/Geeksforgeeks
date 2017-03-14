#include<stdio.h>
#include<limits.h>
#include<math.h>
main() {
    int n;
    printf("enter the value of n : ");
    scanf("%d",&n);
    int a[n];
    printf("enter the elements of array : ");
    int i;
    for(i=0;i<n;i++) {
        scanf("%d",&a[i]);
    }
    int c;
    c=largestSum(a,n);
}
int largestSum(int a[],int n) {
    int ans=INT_MIN,subArray,startIndex,i,sum;
    for(subArray=1;subArray<n;subArray++) {
        for(startIndex=0;startIndex<n;startIndex++) {

            if(startIndex+subArray>n)
                break;
            for(i=startIndex;i<(startIndex+subArray);i++)
            sum=sum+a[i];


        }
         if(sum>ans)
               ans=sum;
    }
    printf("the largest contiguous sub array is :%d ",ans);
    return 0;
}

