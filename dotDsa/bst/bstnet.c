// Binary Search Tree operations in C

#include <stdio.h>
#include <stdlib.h>

struct node {
  int key;
  struct node *left, *right;
};

// Create a node
struct node *newNode(int);

// Insert a node
struct node *insert(struct node *node, int key);

// Find the inorder successor
struct node *minValueNode(struct node *node);

// Deleting a node
struct node *delete(struct node *root, int key);

// Searching a node
struct node *search(struct node *root, int elt);

// Inorder Traversal
void inorder(struct node *root);
void preorder(struct node *root);
void postorder(struct node *root);


int main() {
  struct node *root = NULL;
  int choice, elt;

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
                root = insert (root, elt);
                break;

            case 2: 
                inorder(root);
                printf("\nEnter item you want delete: ");
                scanf("%d", &elt);
                root = delete(root, elt);
                printf("\n%d  deleted!", elt);
                break;

            case 3: 
                printf("\nEnter element you want to search: ");
                scanf("%d", &elt);
                root = search(root, elt);
                printf("\nItem %d found", root->key);
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

// Create a node
struct node *newNode(int item) {
  struct node *temp = (struct node *)malloc(sizeof(struct node));
  temp->key = item;
  temp->left = temp->right = NULL;
  return temp;
}

// Insert a node
struct node *insert(struct node *node, int key) {
  // Return a new node if the tree is empty
  if (node == NULL) return newNode(key);

  // Traverse to the right place and insert the node
  if (key < node->key)
    node->left = insert(node->left, key);
  else
    node->right = insert(node->right, key);

  return node;
}

// Find the inorder successor
struct node *minValueNode(struct node *node) {
  struct node *current = node;

  // Find the leftmost leaf
  while (current && current->left != NULL)
    current = current->left;

  return current;
}

// Deleting a node
struct node *delete(struct node *root, int key) {
  // Return if the tree is empty
  if (root == NULL) {
    printf("\nEmpty tree! ");
    return root;
  }
    

  // Find the node to be deleted
  if (key < root->key)
    root->left = delete(root->left, key);
  else if (key > root->key)
    root->right = delete(root->right, key);

  else {
    // If the node is with only one child or no child
    if (root->left == NULL) {
        struct node *temp = root->right;
        free(root);
        return temp;
    } 
    else if (root->right == NULL) {
        struct node *temp = root->left;
        free(root);
        return temp;
    }

    // If the node has two children
    struct node *temp = minValueNode(root->right);

    // Place the inorder successor in position of the node to be deleted
    root->key = temp->key;

    // Delete the inorder successor
    root->right = delete(root->right, temp->key);
  }
  return root;
}

// Searching a node 
struct node *search(struct node *root, int elt) {
  if (root == NULL ){
    printf("\nItem not found!\n");
    // return root;
  }
  else if (elt == root->key)
    return root;
  else if (elt < root->key)
    return search(root->left, elt);
  else 
    return search(root->right, elt);

}

// Inorder Traversal
void inorder(struct node *root) {
  if (root != NULL) {
    
    inorder(root->left);
    printf("%d -> ", root->key);
    inorder(root->right);
  }
  
  
}

void preorder(struct node *root) {
  if (root != NULL) {
    
    printf("%d -> ", root->key);
    preorder(root->left);
    preorder(root->right);
  }  
 

}

void postorder(struct node *root) {
   if (root != NULL) {
    
    postorder(root->left);
    postorder(root->right);
    printf("%d -> ", root->key);
  }
  
  
}