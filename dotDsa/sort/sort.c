#include <stdio.h>
#include <stdlib.h>


int a[] = {10, 2, 1, 4, 5, 3, 8, 7, 9, 6};
int n = 10;

void display( int arr[],  int n) {

    for( int i = 0; i < n; i++) {
        printf(" %d", a[i]);
    }
    printf("\n");
}


void bubble (int[], int);
void select (int[], int);
void insert (int[], int);

int main () {

    int choice; 
    while (1)
    {
        printf("\nOptions are :\n1. Bubble\n2. Select\n3. Insert\n4. Exit");
        printf("\nEnter your choice: ");
        scanf("%d", &choice);

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

void bubble (int arr[], int n) {
    int temp;
    for (int i = 0; i < n-1; i++)
    {
        for (int j = 0; j <n-i-1; j++)
        {
            // temp = a[j];
            if(a[j] >= a[j+1]) // comparing preceding element
            {   
                // swapping the element inside the bubble
                temp = a[j];
                a[j]= a[j+1];
                a[j+1] = temp;
                display(a, n);
            }
        }
        
    }
    // display(a, n);
}


void swap(int *a, int *b) 
{
  int temp = *a;
  *a = *b;
  *b = temp;
}


void select(int arr[], int n) {
    int temp;
    // display(a, n);
    for (int i = 0; i < n - 1; i++) 
    {
        int min = i; // let mininum always be first element
        for (int j = i + 1; j < n; j++) 
        {
            // Select the minimum element in each loop.
            if (a[min] > a[j])
                min = j;
        }
        // put min at the correct position
        // swap(&a[min], &a[i]);  // this function can be used
        temp = a[min];
        a[min] = a[i];
        a[i] = temp;

        display(a, n);
    }
    // display(a, n);
}


void insert(int arr[], int n)
{
    int i, key, j;
    for (i = 1; i < n; i++) {
        key = a[i];
        j = i - 1;

        /* Move elements of a[0..i-1], that are
          greater than key, to one position ahead
          of their current position */
        while (j >= 0 && a[j] > key) {
            a[j + 1] = a[j];
            j = j - 1;
        }
        a[j + 1] = key;
        display(a, n);
    }

    // display(a, n);
}


// SelectionSort(A)
// { 
//     int i, j, min, p, temp;
//     for( i = 0;i < n ;i++)
//     {
//         min = a[i]; 
//         p = i;
//         for ( j = i + 1; j < n ;j++)
//         {
//             if (min > a[j])
//                
//                 min = a[j]; 
//                 p=j;
//         }
//     }
//     swap(a[i], a[p]);
// }