// #include<stdio.h>
// #include<string.h>

// struct cricket
// {
// 	char pname[20];
// 	char tname[20];
// 	float bavg;
// };

// int main()
// {
// 	struct cricket s[5],t;
// 	int i,j,n=5;
// 	float p;
	

// 	printf("\nEnter data of %d players",n);
// 	for(i=0;i<n;i++)
// 	{
// 		printf("\nEnter PName TName BAvg for player-%d = ",i+1);
// 		scanf("%s %s %f",s[i].pname,s[i].tname,&p);
// 		s[i].bavg=p;
// 	}

// 	for(i=0;i<n-1;i++)
// 	{
// 		for(j=i+1;j<n;j++)
// 		{
// 			if(strcmp(s[i].tname,s[j].tname)>0)
// 			{
// 				t=s[i];
// 				s[i]=s[j];
// 				s[j]=t;
// 			}
// 		}
// 	}

// 	printf("\nAfter teamwise sorting... Player list is ");
// 	for(i=0;i<n;i++)
// 	{
// 		printf("\n%s \t %s \t%.2f",s[i].pname,s[i].tname,s[i].bavg);
// 	}

	
// 	return 0;
// }

#include<stdio.h>


void main() {
   int a, b, x, y;

   printf("Quotient is:");
   scanf("%d+i%d", &x,&y);
   printf("%d+%d",x,y);

   
}
