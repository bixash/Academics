#include <stdio.h>
#include <stdlib.h>
#define MAX 5

 struct queue {
    int front;
    int rear;
    int items[MAX];
 };

typedef struct queue queue;

void enqueue (queue*);
int deQueue(queue*);
void display(queue*);


int main() {
    
    int choice,elt;
    queue *q;
    q ->front = q->rear = -1;


    printf("\n1. Enqueue");
    printf("\n2. Dequeue");
    printf("\n3. Display");
    printf("\n4. Exit");

    printf("\nEnter your choice [1-4]: ");
    scanf("%d",&choice);

    while (1)
    {
       switch (choice)
       {
       
       case 1:
        enqueue(&q);
        break;

       case 2:
       
        elt =  dequeue(&q);
        printf("%d is deqeued", elt);
        break;
     
       case 3:
        display(&q);
        break;

       case 4:
        exit(0);
        break;

        default:
        printf("Invalid choice");
        break;
       }
    }
    

    return 0;
}

void enqueue (queue* q) {
    int elt;
    printf("\nEnter a element:");
    scanf("%d", elt);

    if (q->front == (q->rear+1)%MAX) {
        printf("\n Queue is full");
        exit(0);
    }
    else {
        printf("\nEnter a element:");
        scanf("%d", elt);

        q->rear = (q->rear+1)%MAX;
        q->items[q->rear]= elt;
        
    }
}


int deQueue(queue* q) {

}

void display(queue* q) {

}
