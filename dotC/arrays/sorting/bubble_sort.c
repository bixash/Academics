#include <stdio.h>

int main () 
{
    int a[100];
    int i, j, n, temp;

    
    printf("Enter no of students: ");
    scanf("%d", &n);

    printf("\nEnter data for student:");
    for ( i=0; i< n; i++)
    {
        scanf("%d", &a[i]);

    }

    printf("\ndata for student:");
    for ( i=0; i< n; i++)
    {
        printf("%d\t", a[i]);
    
    }

    for (i=0; i < n-1; i++)
    {
        for (j = 0; j < n-1-i; j++)
        {

            if (a[j] > a[j+1])
            {
                temp = a[j];
                a[j]= a[j+1];
                a[j+1]= temp;
            }
            
        }
    }
    
     printf("\n#####################################\n");

    printf("\nSorted list is : \n");

    for (i =0; i<n; i++)
    {
       printf("%d\t", a[i]);
    }
    return 0;

}
