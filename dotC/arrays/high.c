#include <stdio.h>
struct student
{
   char name[20];
   int marks;
};

int main () 
{
    struct student s[100], temp;
    int i, j, n, max, high;

    
    printf("Enter no of students: ");
    scanf("%d", &n);

    for ( i=0; i< n; i++)
    {
        printf("Enter data for student: %d \n", i+1);

        printf("Enter name: \t");
        scanf("%s", &s[i].name);


        printf("Enter marks subjects: \n");
        scanf("%d", &s[i].marks);
    }
    max = 0;
    high = s[0].marks;
    for (i = 0; i<n; i++)
    {
        if(high < s[i].marks)
        {
            high = s[i].marks;
            max = i;
        }
    
    }
        printf("\nHighest \n");
        printf("name: %s\n", s[max].name);
        printf("marks: %d\n", s[max].marks);



    return 0;

}
