#include <stdio.h>
struct student
{
   char name[20];
   int roll;
   int marks[3];
};

int main () 
{
    struct student s[100], temp;
    int i, j, n, k, total1, total2;

    
    printf("Enter no of students: ");
    scanf("%d", &n);

    for ( i=0; i< n; i++)
    {
        printf("Enter data for student: %d \n", i+1);

        printf("Enter name: \t");
        scanf("%s", &s[i].name);


        printf("Enter roll: \t");
        scanf("%d", &s[i].roll);

        printf("Enter marks in three subjects: \n");
        for (j =0; j<3; j++)
        {
            scanf("%d", &s[i].marks[j]);

        }
        
        


    }


    for (i=0; i < n-1; i++)
    {
        for (j = 0; j < n-1-i; j++)
        {

            total1 = 0;
            total2 = 0;

            for( k = 0; k < 3; k++)
            {
                total1 = total1 + s[j].marks[k];                
                total2 = total2 + s[j+1].marks[k];                
                

            }
            if (total1 > total2)
            {
                temp = s[j];
                s[j]= s[j+1];
                s[j+1]= temp;
            }
            
        }
    }
    
     printf("\n#####################################\n");

    printf("\nSorted list is : \n");

    for (i =0; i<n; i++)
    {
        printf("name: %s\n", s[i].name);
        printf("roll: %d\n", s[i].roll);
        printf("marks in three subjects: \n");
        for (j =0; j<3; j++)
        {
            printf("%d\n", s[i].marks[j]);

        }
        
        
    }

    return 0;

}
