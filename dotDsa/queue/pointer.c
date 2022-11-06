// Queue implementation in C

#include <stdio.h>
#include <stdlib.h>
#define SIZE 5


struct pointer
{
    int queue[SIZE];
    int front; 
    int rear;
};

void enQueue(struct pointer *que, int value);
void deQueue(struct pointer *que);
void display(struct pointer *que);



int main() {

    struct pointer que;
    que.front = 0;
    que.rear = -1;
 
  while (1)
    {
      int elt, choice;

      printf("\nOptions are :\n1. Enqueue\n2. Dequeue\n3. Display\n4. Exit");
      printf("\nEnter your choice: ");
      scanf("%d",&choice);


    switch (choice)
    {


        case 1:  
          printf("\nEnter element: ");
          scanf("%d", &elt);
          enQueue(&que, elt);

        break;

        case 2: 
          
            deQueue(&que);
            
        break;

        case 3: 
            display(&que);
        
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

void enQueue(struct pointer *que, int value) {

  if (que->rear == SIZE - 1)
    printf("\nQueue is Full!!");
  else {
   
    
    que->rear = que->rear + 1;
    que->queue[que->rear] = value;

    printf("\nInserted -> %d\n", value);

  }
}

void deQueue(struct pointer *que) {

  if (que->front == -1)
    printf("\nQueue is Empty!\n");

  else {
    printf("\nDeleted : %d", que->queue[que->front]);

    que->front = que->front + 1;
  }

}

// Function to print the queue
void display(struct pointer *que) {
  int i;

  if (que->rear == -1)

    printf("\nQueue is Empty!\n");

  else {
    
    printf("\nQueue elements are:\n");

    for (i = que->front; i <= que->rear; i++)
      printf("%d  ", que->queue[i]);

  }

  printf("\n");

}


