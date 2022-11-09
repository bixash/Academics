#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#define max 5
struct stack
{
    int items[max];
    int top;
};

typedef struct stack stack;

void push(stack* s) 
{
    int elt;
    if(s->top == max-1)
    {
        printf("\nStack overflow");

    } 
    else 
    {
        printf("Enter data: ");
        scanf("%d", &elt);
        s->top = s->top + 1;
        s->items[s->top] = elt;

    }

}

int pop(stack *s) {

    int elt = -1;
    if(s->top == -1)
    {
        printf("\nStack underflow");
    }

    else {
        
        elt = s->items[s->top];
        s->top = s->top - 1;
    }
    return elt;

}

void display (stack *s) {
    int i;

        if(s->top == -1)
        {
            printf("\nStack underflow");

        } 

        else {
            for (i = s->top; i>=0; i--)
            {
                printf("\n%d\t",s->items[i]);

            }
            printf("\n");
        }

}
void main ()
{
    stack s;
    s.top = -1;
    int choice, elt;
    while (1)
    {
        printf("\nOptions are :\n1. Push\n2. Pop\n3. Display\n4. Exit");
        printf("\nEnter your choice: ");
        scanf("%d",&choice);


        switch (choice)
        {
            case 1:  push(&s);

            break;

            case 2: 
                elt = pop(&s);
                printf("\n\'%d\'is popped\n", elt);
            break;

            case 3: 
                display(&s);
            
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