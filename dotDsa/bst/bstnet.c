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
struct node *deleteNode(struct node *root, int key);

// Inorder Traversal
void inorder(struct node *root);

// Driver code
int main() {
  struct node *root = NULL;
  int elt, choice, del;

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
  root = insert(root, 8);
  root = insert(root, 3);
  root = insert(root, 1);
  root = insert(root, 6);
  root = insert(root, 7);
  root = insert(root, 10);
  root = insert(root, 14);
  root = insert(root, 4);

  printf("Inorder traversal: ");
  inorder(root);

  printf("\nAfter deleting 10\n");
  root = deleteNode(root, 10);
  printf("Inorder traversal: ");
  inorder(root);
}

struct node *newNode(int item) {
  struct node *temp = (struct node *)malloc(sizeof(struct node));
  temp->key = item;
  temp->left = temp->right = NULL;
  return temp;
}

// Inorder Traversal
void inorder(struct node *root) {
  if (root != NULL) {
    
    inorder(root->left);
    printf("%d -> ", root->key);
    inorder(root->right);
  }
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
struct node *deleteNode(struct node *root, int key) {
  // Return if the tree is empty
  if (root == NULL) return root;

  // Find the node to be deleted
  if (key < root->key)
    root->left = deleteNode(root->left, key);
  else if (key > root->key)
    root->right = deleteNode(root->right, key);

  else {
    // If the node is with only one child or no child
    if (root->left == NULL) {
        struct node *temp = root->right;
        free(root);
        return temp;
    } else if (root->right == NULL) {
        struct node *temp = root->left;
        free(root);
        return temp;
    }

    // If the node has two children
    struct node *temp = minValueNode(root->right);

    // Place the inorder successor in position of the node to be deleted
    root->key = temp->key;

    // Delete the inorder successor
    root->right = deleteNode(root->right, temp->key);
  }
  return root;
}