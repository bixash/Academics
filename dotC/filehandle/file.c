#include <stdio.h>
#include <stdlib.h>
struct student
{
   char name[20];
   int roll;
   int marks;
};

int main () 
{
    struct student s[100];
    int i, n;

    printf("Enter no of students: ");
    scanf("%d", &n);

    FILE *fp;
    fp = fopen("student.txt", "w");

    if (fp == NULL) 
    {
        printf("file not supported");
        exit(1);
    }

    printf("Enter data of students: \n");

    for ( i=0; i< n; i++)
    {
        printf("Enter data for student: %d \n", i+1);

        printf("Enter name: \t");
        scanf("%s", &s[i].name);


        printf("Enter roll: \t");
        scanf("%d", &s[i].roll);

        printf("Enter marks subjects: \t");
        scanf("%d", &s[i].marks);

        // File write mode
        fwrite(&s,sizeof(s),1,fp);

    }
    

    fclose(fp);
    return 0;

}


// rewind(fp);

//     printf("\n ######################## : \n");

//     for (i =0; i<n; i++)
//     {
//         fread(&s,sizeof(s),1,fp);
        
//         printf("name: %s\n", s[i].name);
//         printf("roll: %d\n", s[i].roll);
//         printf("marks : %d\n", s[i].marks);
        
//     }