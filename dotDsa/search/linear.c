#include <stdio.h>


void main() {
    int array[] = {1,2,34,5,4,6,7,4,2,5,6};
    int key, i, n = 11;

    printf("\nEnter a number you want to search: ");
    scanf("%d", &key);


    for (int i = 0; i < n; i++)
    {
        if(key == array[i]){
            printf("%d found!",key);
            break;
        }
            
        else
            printf("\nKey not found!");
    }
    

}