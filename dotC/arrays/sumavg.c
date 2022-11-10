#include <stdio.h>
void add (int num);
int main ()
{
   int a[100], i,n, sum = 0;
   

   printf("Enter size: \n");
   scanf("%d", &n);
   add(n);

   return 0;
}

void add (int num)
{
    int a[100];
    int i, sum = 0; 

     printf("\nEnter array elements: \n");
   
   for(i=0; i<num; i++) 
   {
      scanf("%d", &a[i]);
      
   }

   printf("\nArray elements:\n");

   for(i=0; i<num; i++)
   {
      printf("%d\t", a[i] );
   }

     for(i=0; i<num; i++)
   {
      sum = sum + a[i];
   }

   printf("\n \nSum is  %d", sum);
}