
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
struct bnode delete(bnode*, int);
void search (bnode*, int);
void preorder (bnode*);
void postorder (bnode*);
void inorder(bnode*);


void main () {

    bnode *root = NULL;
    int elt;
    int choice;
    struct bnode del;
    while (1)
    {
        printf("\noptions are :\n1. insert\n2. delete\n3. search\n4. pre-order\n5. post-order\n6. in-order\n7. exit\n");
        printf("\nEnter your choice: ");
        scanf("%d", &choice);


        switch (choice)
        {
            case 1: 
                printf("\nEnter element to insert: ");
                scanf("%d", &elt);
                insert (root, elt);
                break;

            case 2: 
                del = delete(root, elt);
                printf("%d deleted\n", del);
                break;

            case 3: 
                printf("\nEnter element you want to search: ");
                scanf("%d", &elt);
                search(root, elt);
                
                break;

            case 4: 
                preorder (root);
                break;

            case 5: 
                postorder (root);
                break;

            case 6: 
                inorder(root);
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

struct bnode *find_min(bnode *root)
{

    // Find the leftmost leaf
    if(root == NULL)
        return 0;
    else if(root->left == NULL)
        return root;
    else
        return(find_min(root->left));
}

struct bnode delete(bnode* root, int elt) {


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
    // return (temp);

}

void search (bnode* root, int elt) {
    if (root == NULL )
        printf("\nEmpty!");
    else if (elt == root->info)
        printf("\nItem found! %d",root->info);
    else if (elt < root->info)
        search(root->left, elt);
    else if (elt > root->info )
        search(root->right, elt);
    else {
        printf("\nItem not found!");
    }
}


void preorder(bnode *root)
{
    if(root!=NULL)
    {
        printf("%d", root->info);
        preorder(root->left);
        preorder(root->right);
    }
}


void postorder (bnode* root) {
    if(root!=NULL)
    {
        postorder(root->left);
        postorder(root->right);
        printf("%d", root->info);
    }
}

void inorder(bnode* root) {

    if(root != NULL)
    {
        inorder(root->left);
        printf("%d", root->info);
        inorder(root->right);
    }
}