#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>
#include <process.h>


struct node {
    int info;
    struct node *next;
    struct node *prev;

};

typedef struct node node;

void insertBegin (node**,node**, int);
void insertEnd (node**, node**, int);
void insertSpecified (node**, int, int); 
int deleteBegin (node **,node**);
int deleteEnd (node **, node**);
int deleteSpecified (node**, int);
void displayElements (node**);


void main () {

    node *head;
    node *tail;
    head = NULL;
    tail = NULL;
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
                insertBegin (&head, &tail, elt);
                break;

            case 2: 
                printf("\nEnter element to insert from end : ");
                scanf("%d", &elt);
                insertEnd (&head, &tail, elt);
                break;

            case 3: 
                printf("\nEnter element: ");
                scanf("%d", &elt);
                printf("\nEnter position: ");
                scanf("%d", &pos);
                insertSpecified(&head, elt, pos);
                break;

            case 4: 
                elt = deleteBegin (&head, &tail);
                printf("\nDeleted item : %d" ,elt);
                break;

            case 5: 
                elt = deleteEnd (&head, &tail);
                printf("\nDeleted item : %d" ,elt);
                break;

            case 6: 
                printf("\nEnter position: ");
                scanf("%d", &pos);

                elt = deleteSpecified(&head, pos);
                printf("\nDeleted item : %d" , elt);
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
void insertBegin (node **head, node **tail, int elt) {
    node *newNode;
    newNode = (node*)malloc(sizeof(node));
    newNode ->info = elt;
    newNode ->next = *head;
    newNode ->prev = NULL;

    if (*head == NULL)
    {
        *head = newNode;
        *tail = newNode;
    } else {
        
        (*head)-> prev = newNode;
        *head = newNode;
    }

    printf("elt %d inserted", elt);

}
    // last is used as temp
void insertEnd (node **head, node **tail, int elt) {
    node *newNode;
    newNode = (node*)malloc(sizeof(node));

    newNode->prev= *tail;
    newNode->next = NULL;
    newNode->info = elt;

    if (*head == NULL){
        (*head) = newNode;
        *tail = newNode;
    }
    else {
        
        (*tail) -> next = newNode;
        *tail = newNode;
    }
    printf("elt %d inserted", elt);
}

void insertSpecified (node **head, int elt, int pos) {

    node *newNode, *temp;
    newNode = (node*)malloc(sizeof(node));

    
    newNode->info = elt;
    temp = *head;

    if(*head == NULL) 
        printf("Void insertion");
    else {
        for (int i = 1; i < pos-1; i++)
        {
            temp= temp->next;
        
        }
        newNode ->next = temp ->next;
        newNode ->prev = temp;
        temp->next -> prev = newNode;
        temp ->next = newNode;
    }  
    printf("elt %d inserted", elt);
}

int deleteBegin (node **head, node **tail ) {
    node *newNode;
    int delt = -1;
    newNode = *head;
    if (*head == NULL) 
     printf("list is empty");

    else if (*head == *tail)
    {
        delt = newNode -> info;
        *head = NULL;
        *tail = NULL;
        free(newNode);
    }
    else {
        (*head)->prev = NULL;
        *head = newNode -> next;
        delt = newNode -> info;
        free(newNode);
    }
    return delt;
  

}

int deleteEnd (node **head, node **tail) {
    node *newNode;
    int delt = -1;
    newNode = *tail;
    if (*head == NULL)
        printf("\nVoid deletion");

    else if (*head  == *tail)
    {
        *tail = NULL;
        *head = NULL;
        delt = newNode ->info;
        free(newNode);
    }
    else {

        *tail = newNode-> prev;
        (*tail)->next = NULL;
        delt = newNode -> info;
        free(newNode);
        
    }
    return delt;
    
}
 
int deleteSpecified (node **head, int pos) {
    node *newNode;
    int delt = -1;
    int i;
    newNode = *head;

    for (i=1; i < pos; i++)
    {
        newNode = newNode-> next;
    }
    
    newNode ->next ->prev = newNode->prev;
    newNode ->prev ->next = newNode->next;
    delt = newNode->info;
    free(newNode);
    return delt;
   
}

void displayElements (node **head) { 
    node *newNode;
    newNode = *head;
     if (newNode== NULL)
     {
        printf("Empty link list");
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