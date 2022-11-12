// Queue implementation in C

#include <stdio.h>
#include <stdlib.h>
#define SIZE 5


struct queue
{
    int item[SIZE];
    int front; 
    int rear;
};


typedef struct queue queue;

void enQueue(queue*);
void deQueue(queue*);
void display(queue*);



int main() {

    queue *que;
    que->front = 0;
    que->rear = -1;
 
  while (1)
    {
      int choice;

      printf("\nOptions are :\n1. Enqueue\n2. Dequeue\n3. Display\n4. Exit");
      printf("\nEnter your choice: ");
      scanf("%d",&choice);


    switch (choice)
    {


        case 1:  
          
          enQueue(que);

        break;

        case 2: 
          
            deQueue(que);
            
        break;

        case 3: 
            display(que);
        
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

void enQueue(queue *que) {

  int elt;
  printf("\nEnter element: ");
  scanf("%d", &elt);

  if (que->rear == SIZE - 1)
    printf("\nQueue is Full!!");
  else {
   
    
    que->rear = que->rear + 1;
    que->item[que->rear] = elt;

    printf("\nInserted -> %d\n", elt);

  }
}

void deQueue(queue *que) {

  if (que->rear < que->front)
    printf("\nQueue is Empty!\n");

  else {
    printf("\nDeleted : %d", que->item[que->front]);

    que->front = que->front + 1;
  }

}

// Function to print the queue
void display(queue *que) {
  int i;

  if (que->rear == -1)

    printf("\nQueue is Empty!\n");

  else {
    
    printf("\nQueue elements are:\n");

    for (i = que->front; i <= que->rear; i++)
    
      printf("%d  ", que->item[i]);

  }

  printf("\n");

}


