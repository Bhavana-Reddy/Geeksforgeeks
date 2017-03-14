#include<stdio.h>
#include<conio.h>

int element(int arr[],int low,int high){
    int x,i,j;
    i = low;
  j = high;

printf("enter the value of x : ");
scanf("%d",&x);

  while(i<j)
  {
   while(arr[i]+arr[j]<x)
   {
    i++;
   }

   while(arr[i]+arr[j]>x)
   {
    j--;
   }
  }
   if(arr[i]+arr[j]==x)
   printf("element found");
   /*else
   printf("not found");
   return 0;*/


}

void main()
{
 int n,i,b;

 printf("Enter the size of array : ");
 scanf("%d",&n);
 int arr[n];
 printf("enter the elements in asscending order : ");

 for(i=0 ; i<n ; i++)
  scanf("%d",&arr[i]);

 b=element(arr,0,n-1);

}
