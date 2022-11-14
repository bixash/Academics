#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>
#include <process.h>

int count=0;
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
                if(count == 0 ) {
                    printf("\nFirst add element to insert in specified position!");
                } 
                else 
                {
                    printf("\nEnter element: ");
                    scanf("%d", &elt);
                    printf("\nEnter position: ");
                    scanf("%d", &pos);

                    if(pos == 1){
                        insertBegin (&head, elt);
                    }
                    else if (pos <= count && pos > 1) 
                    {   
                        insertSpecified(&head, elt, pos);
                    }
                    else {
                        printf("\nInvalid position!");
                    }
                }

                // printf("\nEnter element to insert from specified position: ");
                // scanf("%d", &elt);
                // printf("\nEnter position: ");
                // scanf("%d", &pos);
                // insertSpecified(&head, elt, pos);
                break;
            case 4: 
                elt = deleteBegin (&head);
                printf("\nDeleted item : %d" ,elt);
                break;
            case 5: 
                elt = deleteEnd (&head);
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
void insertBegin (node **head, int elt) {
    node *newNode;
    newNode = (node*)malloc(sizeof(node));
    newNode->info = elt;
    newNode ->next = *head;
    *head = newNode;
    count++;
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
    count++;
}

void insertSpecified (node **head, int elt, int pos) {


    node *newNode, *temp;

    newNode = (node*)malloc(sizeof(node));

    newNode->info = elt;
    temp = *head;

    if(head == NULL) {
        printf("Void insertion");
    }
    for (int i = 1; i < pos-1; i++)
    {
        temp= temp->next;
    
    }
    newNode ->next = temp ->next;
    temp ->next = newNode;
    count++;
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
        last->next =NULL;
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