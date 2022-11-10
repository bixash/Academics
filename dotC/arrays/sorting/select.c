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
        for (j = i+1 ; j < n; j++)
        {

            if (a[i] > a[j])
            {
                temp = a[i];
                a[i]= a[j];
                a[j]= temp;
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
