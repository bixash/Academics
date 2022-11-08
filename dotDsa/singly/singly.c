#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>
#include <process.h>

struct node {
    int info;
    struct node *next;

};

typedef struct node node;


void insertBegin (node **head, int elt) {
    node *temp;
    temp = (node*)malloc(sizeof(node));
    temp->info = elt;
    temp ->next = *head;
    *head = temp;
    printf("elt %d inserted", elt);

}
void insertEnd (node **head, int elt) {
    node *temp, *temp1;
    temp = (node*)malloc(sizeof(node));

    temp->next = NULL;
    temp->info = elt;

    if (*head == NULL)
        (*head) = temp;
    else {
        temp1 = *head;
        while (temp1-> next != NULL)
        {
            temp1 = temp1-> next;
        }
        
        temp1 ->next = temp;
    }

}


// void insertSpecified (node **head, int elt, int pos) {

//     node *temp *temp1;

//     temp = (node*)malloc(sizeof(node));

//     temp->info =elt;
//     temp1 = *head;

//     if(head == NULL) {
//         printf("Void insertion");
//         exit(1);
//     }

//     for (int i = 1; i < pos-1; i++)
//     {
//         temp1= temp1->next ;
        
//         temp ->next = temp1 ->next;
//         temp1 ->next = temp;
//     }
    
//     temp ->next = *head;
//     *head = temp;

// }
// int deleteBegin (node **head, int elt) {
//     node *temp;
//     int elt = -1;

//     if (*head == NULL) 
//      printf("list is empty");

//     else {
//         temp = *head;
//         *head = temp -> next;
//         elt = temp -> info;
//         free(temp);

//     }
//     return elt;


// }

// int deleteEnd (node **head, int elt) {
//    node *temp, *temp1;
//    int elt = -1;

//     if (head == NULL)
//         prinf("\nList is empty");

    

// }
// int deleteSpecified (node **head, int elt) {
//     node *temp;
//     temp = (node*)malloc(sizeof(node));
//     temp->info =elt;
//     temp ->next = *head;
//     *head = temp;

// }
void displayElements (node **head) {
    node *temp;
    temp = *head;
     if (temp== NULL)
     {
        printf("Empty link list");
        exit(0);
     }
     
    else
    {
        while (temp != NULL)
        {
            printf("%d\t", temp->info);
            temp = temp->next;
        }
    }    

}

void main () {

    node *head;
    head = NULL;
    

    int elt;
    int choice;

    while (1)
    {
        printf("\nOptions are :\n1. insertBegin\n2. insertEnd\n3. Display\n4. Exit");
        printf("\nEnter your choice: ");
        scanf("%d",&choice);


        switch (choice)
        {
            case 1: printf("\nEnter element you want to insert: ");
                    scanf("%d", &elt);
                    insertBegin (&head, elt);

            break;

            case 2: 
               
                printf("\n\'%d\'is popped\n", elt);
            break;

            case 3:
            printf("\nElements: ");
                displayElements(&head);
            
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