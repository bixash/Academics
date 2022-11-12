#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>
#include <process.h>

struct node {
    int info;
    struct node *next;

};

typedef struct node node;

void insertBegin (node**, int);
void insertEnd (node**, int);
void insertSpecified (node**, int, int); 
int deleteBegin (node **);
int deleteEnd (node **);
int deleteSpecified (node**, int);
void displayElements (node**);


void main () {

    node *head;
    head = NULL;
    int delt;
    int pos;
    int elt;
    int choice;

    while (1)
    {
        printf("\nOptions are :\n1. insertBegin\n2. insertEnd\n3. insertSpecified\n4. deleteBegin\n5. deleteEnd\n6. deleteSpecified\n7. displayElements\n8. Exit");
        printf("\nEnter your choice: ");
        scanf("%d",&choice);


        switch (choice)
        {
            case 1: 
                printf("\nEnter element to insert from beginning: ");
                scanf("%d", &elt);
                insertBegin (&head, elt);
                break;

            case 2: 
                printf("\nEnter element to insert from end : ");
                scanf("%d", &elt);
                insertEnd (&head, elt);
                break;
            case 3: 
                printf("\nEnter element to insert from specified position: ");
                scanf("%d", &elt);
                printf("\nEnter position: ");
                scanf("%d", &pos);
                insertSpecified(&head, elt, pos);
                break;
            case 4: 
                delt = deleteBegin (&head);
                printf("\nDeleted item : %d" ,delt);
                break;
            case 5: 
                delt = deleteEnd (&head);
                printf("\nDeleted item : %d" ,delt);
                break;
            case 6: 
                printf("\nEnter position: ");
                scanf("%d", &pos);
                delt = deleteSpecified(&head, pos);
                printf("\nDeleted item : %d" , delt);
                break;

            case 7:
                printf("\nElements: ");
                displayElements(&head);
                break;
            
            case 8:
                exit(0);
                break;

            default:
                printf("Invalid choice");
                break;
        }
    }
 

}
void insertBegin (node **head, int elt) {
    node *newNode;
    newNode = (node*)malloc(sizeof(node));
    newNode->info = elt;
    newNode ->next = *head;
    *head = newNode;
    printf("elt %d inserted", elt);

}

void insertEnd (node **head, int elt) {
    node *newNode, *last;
    newNode = (node*)malloc(sizeof(node));

    newNode->next = NULL;
    newNode->info = elt;

    if (*head == NULL)
        (*head) = newNode;
    else {
        last = *head;
        while (last-> next != NULL)
        {
            last = last-> next;
        }
        
        last ->next = newNode;
    }

}

void insertSpecified (node **head, int elt, int pos) {


    node *newNode, *temp;

    newNode = (node*)malloc(sizeof(node));

    newNode->info = elt;
    temp = *head;

    if(head == NULL) {
        printf("Void insertion");
        exit(1);
    }

    for (int i = 1; i < pos-1; i++)
    {
        temp= temp->next;
        
        newNode ->next = temp ->next;
        temp ->next = newNode;
    }
    
    newNode ->next = *head;
    *head = newNode;

}

int deleteBegin (node **head) {
    node *newNode;
    int delt = -1;

    if (*head == NULL) 
     printf("list is empty");

    else {
        newNode = *head;
        *head = newNode -> next;
        delt = newNode -> info;
        free(newNode);

    }
    return delt;


}

int deleteEnd (node **head) {
   node *newNode, *last;
   int delt = -1;

    if (head == NULL)
        printf("\nList is empty");

    else if ((*head)-> next == NULL)
    {
        newNode = *head;
        *head = NULL;
        delt = newNode ->info;
        free(newNode);
    }
    else {
        newNode =*head;
        while (newNode->next != NULL)
        {
            last = newNode;
            newNode = newNode->next;
        }

        delt = newNode -> info;
        newNode->next =NULL;
        free(newNode);
        
    }
    return delt;
}

int deleteSpecified (node **head, int pos) {
    node *newNode, *temp;
    int delt =-1;
    int i;

    newNode= *head;
    for (i=1; i < pos; i++)
    {
        temp = newNode;
        newNode =newNode-> next;
    }
    delt = newNode->info;
    temp ->next = newNode->next;
    free(newNode);
    return delt;
}

void displayElements (node **head) { 
    node *newNode;
    newNode = *head;
     if (newNode== NULL)
     {
        printf("Empty link list");
        exit(0);
     }
     
    else
    {
        while (newNode != NULL)
        {
            printf("%d\t", newNode->info);
            newNode = newNode->next;
        }
    }    

}