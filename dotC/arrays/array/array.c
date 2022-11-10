#include <stdio.h>
int main ()
{
   int a[100], i,n, sum = 0;
   int *ptr;
   ptr = &a[0];

   printf("Enter size: \n");
   scanf("%d", &n);

   printf("\nEnter matrix elements: \n");
   
   for(i=0; i<n; i++) 
   {
      scanf("%d", (ptr+i));
      
   }

   printf("\nMatrix elements:\n");

   for(i=0; i<n; i++)
   {
      
      printf("%d\t", *(ptr + i));
      sum = sum + *(ptr+i);
   }

   // for(i=0; i<n; i++)
   // {
   //    sum = sum + *(a+i);
   // }

   printf("\n \nSum is  %d", sum);

   return 0;
}