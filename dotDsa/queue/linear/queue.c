// Queue implementation in C

#include <stdio.h>
#include <stdlib.h>
#define SIZE 5

void enQueue(int);
void deQueue();
void display();

int queue[SIZE], front = 0, rear = -1;

int main() {


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
          enQueue(elt);

        break;

        case 2: 
          
            deQueue();
            
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
  return 0;
}

void enQueue(int value) {

  if (rear == SIZE - 1)
    printf("\nQueue is Full!!");
  else {
   
    
    rear = rear + 1;
    queue[rear] = value;

    printf("\nInserted -> %d\n", value);

  }
}

void deQueue() {

  if (front == -1)
    printf("\nQueue is Empty!\n");

  else {
    printf("\nDeleted : %d", queue[front]);

    front++;
  }

}

// Function to print the queue
void display() {
  int i;

  if (rear == -1)

    printf("\nQueue is Empty!\n");

  else {
    
    printf("\nQueue elements are:\n");

    for (i = front; i <= rear; i++)
      printf("%d  ", queue[i]);

  }

  printf("\n");

}


