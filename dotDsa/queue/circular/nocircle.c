#include <stdio.h>
#include <stdlib.h>
#define MAX 5 

int cqueue[MAX];
int front;
int rear;

void enqueue();
void dequeue();
void display();

int main () {
    int choice;

   

    while (1)
    {
        printf("\n1. Enqueue");
        printf("\n2. Dequeue");
        printf("\n3. Display");
        printf("\n4. Exit");

        printf("\nEnter option: ");
        scanf("%d",&choice);

        switch (choice)
        {
            case 1:
                enqueue();
                break;
            
            case 2:
                dequeue();
                break;
            case 3: 
                display();
                break;

            case 4:
                exit(0);
                break;

            default:
                printf("Invalid choice");
                break;
        }
    }
    
}


void enqueue ()
{

    int item; 
    printf("\nEnter element: ");
    scanf(" %d", &item);

    if (front == (rear+1)% MAX)
    {
        printf("\nQueue is full");
    }
    else {
        rear =(rear+1)% MAX;
        cqueue[rear] = item;
        printf("\nInserted -> %d\n", item);
    }
}

void dequeue ()
{
    int item;
    if( rear == front) 
        printf("\nQueue is empty;\n");
    else {
        front =(front+1)% MAX;
        item = cqueue[front];
        printf("\ndeleted -> %d\n", item);
        
    }
 
}

void display() 
{
    int i;
    if( rear == front) 
        printf("\nQueue is empty;\n");
    else {

        printf("\nQueue elements are:\n");


        // while(i<= rear)  
        // {  
        //     printf("%d\t", cqueue[i]);  
        //     i=(i+1)% MAX;  
        // }  
        for(i=(front+1)%MAX; i!=rear; i=(i+1)%MAX)
        {
        printf("%d\t", cqueue[i]);
        }
        printf("%d\t", cqueue[rear]);

    }

}