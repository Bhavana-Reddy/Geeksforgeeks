#include<stdio.h>
main()
{

    int n;
    printf("enter the array size : ");
    scanf("%d",&n);
    int a[n],i;
    printf("enter the elements in array : ");
    for(i=0;i<n;i++) {
        scanf("%d",&a[i]);
    }
   //rintf("the elemets are: ");
   /* int j;
    for(j=0;j<n;j++) {
        printf("%d\n",a[j]);*/
        //find the each sum of contigous elements
        int k,sum=0,max=a[0]+a[1];
        for(k=0;k<n-1;k++) {
            sum=a[k]+a[k+1];
            //printf("the contingous sum of the elements is : %d\n",sum);
            if(max<sum){
                max=sum;
            }
        }
            printf("\nthe maximum sum of continguous sub array is : %d",max);
            }





