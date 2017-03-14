#include<stdio.h>
/* Given an array A[] and a number x, check for pair in A[] with sum as x  */
int hasArrayTwoCandidates (int a[],int n,int x){
    int i,j;
    printf("enter x value : ");
    scanf("%d",&x);
  for(i=0;i<n-1;i++)
  {
   for(j=i+1;j<n;j++)
   {
     if(a[i]+a[j]==x){
     /*element exist
     break*/
     printf("found");

     return 1;

     }

   }

  }
  printf("not found");
return 0;
}

  main () {
      int b,i,x,n;
         printf("enter the size of array : ");
        scanf("%d",&n);
      printf("enter the array : ");
      int a[n];
      for (i = 0; i < n; i++)
        scanf("%d", &a[i]);

   b=  hasArrayTwoCandidates (a,n,x);

  }


