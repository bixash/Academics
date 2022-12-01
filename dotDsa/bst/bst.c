
#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>
#include <process.h>


struct bnode {
    int info;
    struct bnode *left;
    struct bnode *right;

};

typedef struct bnode bnode;

void insert(bnode*, int);
void delete(bnode **, int);
void search (bnode **, int);
void preOrder (bnode**);
void postOrder (bnode**);
void inOrder(bnode**);


void main () {

    bnode *root = NULL;
    int elt;
    int choice;
    
    while (1)
    {
        printf("\nOptions are :\n1. insert\n2. delete\n3. search\n4. pre-order\n5. post-order\n6. in-order\n7. exit\n");
        printf("\nEnter your choice: ");
        scanf("%d", &choice);


        switch (choice)
        {
            case 1: 
                printf("\nEnter element to insert: ");
                scanf("%d", &elt);
                insert (&root, elt);
                break;

            case 2: 
                delete(&root, elt);
                break;

            case 3: 
                printf("\nEnter element you want to search: ");
                scanf("%d", &elt);

                search(&root, elt);
                break;

            case 4: 
                preOrder (&root);
                break;

            case 5: 
                postOrder (&root);
                break;

            case 6: 
                inOrder(&root);
                break;

            case 7:
                exit(0);
                break;
            
            default:
                printf("Invalid choice");
                break;
        }
    }
 

}

// If node == NULL 
//     return createNode(data)
// if (data < node->data)
//     node->left  = insert(node->left, data);
// else if (data > node->data)
//     node->right = insert(node->right, data);  
// return node;

void insert(bnode* root, int elt) {

    if (root == NULL) {

        root=(bnode*)malloc (sizeof(bnode));
        root->left = root->right = NULL;
        root->info= elt;
    }
    else {
        if(elt <= root->info)
            insert(root->left, elt);
        else
            insert(root->right, elt);
    }

}

void delete(bnode** root, int elt) {


    if ((*root)== NULL)
        return NULL;
    else if (elt == (*root)->info)
        return root;
    else if( elt >= (*root)->info)
        delete((*root)->left, elt);
    else
        delete((*root)->right, elt);

}
void search (bnode** root, int elt) {

}

void preOrder (bnode** root) {
    
}
void postOrder (bnode** root) {

}
void inOrder(bnode** root) {

}