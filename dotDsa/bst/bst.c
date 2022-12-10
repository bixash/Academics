
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
void delete(bnode*, int);
void search (bnode*, int);
void preOrder (bnode*);
void postOrder (bnode*);
void inOrder(bnode*);


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


struct bnode *find_min(struct bnode *root)
{
    if(root == NULL)
        return 0;
    else if(root->left == NULL)
        return root;
    else
        return(find_min(root->left));
}

void delete(bnode* root, int elt) {


    struct bnode *temp;
    if(root==NULL)
        printf("\nEmpty tree");

    else if(elt < root->info)
        delete(root->left, elt);

    else if(elt > root->info)
        delete(root->right, elt);

    else if(root->left != NULL && root->right != NULL) //node has two child
    {
        temp = find_min(root->right);
        root->info = temp->info;
        delete(root->right, root->info);
    }
    else
    {
        temp=root;
        if(root->left==NULL)
            root=root->right;
        else if(root->right==NULL)
            root=root->left;
        free(temp);
    }
    return(temp);

}

void search (bnode* root, int elt) {

    if(root == NULL)
        return 0;
    else if(root->left == NULL)
        return root;
    else
        return(find_min(root->left));

}


void preOrder(bnode *root)
{
    if(root!=NULL)
    {
        printf("%d", root->info);
        preorder(root->left);
        preorder(root->right);
    }
}


void postOrder (bnode* root) {
    if(root!=NULL)
    {
        postOrder(root->left);
        postOrder(root->right);
        printf("%d", root->info);
    }
}

void inOrder(bnode* root) {

    if(root!=NULL)
    {
        inOrder(root->left);
        printf("%d", root->info);
        inOrder(root->right);
    }
}