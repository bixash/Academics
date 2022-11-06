#include<stdio.h>
#include<conio.h>

int fibo(int);

void main()
{   

    int n, i , f;

    printf("\nEnter a number: ");
    scanf("%d", &n);

    f = fibo(n);
    printf("\n%dth Fibonacci term: %d\n", n, f);
    getch();

}
int fibo(int num)
{
   
    if(num <= 1)
        return 1;
    else
        return fibo(num-1) + fibo(num-2);
}
