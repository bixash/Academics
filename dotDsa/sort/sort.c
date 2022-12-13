#include <stdio.h>
#include <stdlib.h>


int a[] = {10, 2, 1, 4, 5, 3, 8, 7, 9, 6};
int n = 10;

void display(int a[],  int n) {

    for( int i = 0; i < n; i++) {
        printf(" %d", a[i]);
    }
}

void bubble (int[], int);

void select (int[], int);

void insert (int[], int);

int main () {

    int choice; 

    while (1)
    {
        switch (choice)
        {
        case 1: 
            bubble(a, n);
            break;
        case 2: 
            select(a, n);
            break;
        case 3: 
            insert(a, n);
            break;
        case 4: 
            exit(0);

        default:
            break;
        }
    }

}

void bubble (int a[], int n) {
     

    int temp;

    for (int i = 0; i < n-1; i++)
    {
        for (int j = 0; j <n-i-1; j++)
        {
            temp = a[j];
            if(a[j] >= a[j+1]) 
            {

                
                a[j]= a[j+1];
                a[j+1] = temp;

            }
        }
        
    }
    
    display(a, n);
}
void select (int a[], int n) {
     
    int i, j, temp, p, least;
    for( i = 0; i < n -1; i++)
    {
        least = a[i];
        p = i;
    for (j = i + 1;j < n; j++)
    {
        if (a[j] < least)
        least = a[j]; 
        p=j;
    }
        
    }
}


void insert(int arr[], int n)
{
    int i, key, j;
    for (i = 1; i < n; i++) {
        key = arr[i];
        j = i - 1;
 
        /* Move elements of arr[0..i-1], that are
          greater than key, to one position ahead
          of their current position */
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}
