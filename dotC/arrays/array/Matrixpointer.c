#include <stdio.h>


// book way of doing

// int main ()
// {
//    int (*a)[10],m,n, i, j;
//    int sum = 0, high;

   
//    printf("Enter row and column: \n");
//    scanf("%d%d", &m,&n);

//    printf("\nEnter matrix elements:");
//    for(i=0; i<m; i++)
//    {
//       for(j=0; j<n; j++) 
//       {
//          scanf("%d", *(a+i)+j);
         
//       }
      
//    }

//    printf("\nEnter matrix elements:");
//    for(i=0; i<m; i++)
//    {
//       for(j=0; j<n; j++) 
//       {
//          printf("%d\t", *(*(a+i)+j));
         
//       }
//       printf("\n");
//    }
   
//    for(i=0; i<m; i++)
//    {
//       for(j=0; j<n; j++) 
//       {
//          sum = sum + *(*(a+i)+j);
         
//       }
      
//    }

//    printf("sum is  %d", sum);

//    return 0;
   
// }

//============= Internet way of doing=====//

int main ()
{
   int a[10][10],*ptr[10][10], i, j ,m,n, sum = 0, high;

   printf("Enter row and column: \n");
   scanf("%d%d", &m,&n);

   printf("\nEnter matrix elements:");
   for(i=0; i<m; i++)
   {
      for(j=0; j<n; j++) 
      {
         scanf("%d", *(ptr+i)+j);
         
      }
      
   }

   printf("\nEnter matrix elements:\n");
   for(i=0; i<m; i++)
   {
      for(j=0; j<n; j++) 
      {
         printf("%d\t", *(*(ptr+i)+j));
         
      }
      printf("\n");
   }
   // high = 0;
   // for(i=0; i<m; i++)
   // {
   //    for(j=0; j<n; j++) 
   //    {
   //       sum = sum + *(*(a+i)+j);
   //       if (high < *(*(a+i)+j)) 
   //       {
   //          high = *(*(a+i)+j);
   //       }
   //    }
      
   // }

   // printf("sum is  %d, %d", sum, high);

   return 0;
   
}






