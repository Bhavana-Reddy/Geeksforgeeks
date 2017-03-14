#include<stdio.h>
main(){
    int n;
    printf("enter the size of array");
    scanf("%d",&n);
    int a[n];
    printf("enter the elements in an array");
    int i,j,k;
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    int count=0;
    for(j=0;j<n;j++){
        count=0;
        int num = 0;
        for(k=0;k<n;k++){
            if(a[j]==a[k]){
            count++;
            num = a[j];
        }
        }

    if(count%2!=0){
    printf("%d",a[k-1]);
    printf("count is=%d ",count);
    exit(0);
    }

    }

}
