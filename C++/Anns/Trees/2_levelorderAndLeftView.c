#include <stdio.h>
#include <stdlib.h>
//5 6 1 -1 -1 3 -1 -1 7 -1 -1 sample tree input
//5 6 1 -1 9 -1 -1 3 -1 -1 7 -1 -1 sample tree2 input
struct node
{
    int data;
    struct node *right;
    struct node *left;
};
int a[100], count = 0;
struct node *create()
{
    struct node *p;
    int x;
    printf("Enter the data of node \n");
    scanf("%d", &x);
    if (x == -1)
        return NULL;
    p = (struct node *)malloc(sizeof(struct node));
    p->data = x;
    printf("Enter the data of left child\n");
    p->left = create();

    printf("Enter the data of right child\n");
    p->right = create();

    return p;
}

void preoder(struct node *t)
{
    if (t != NULL)
    { // a[count]=t->data;
        // count++;
        printf("%d ", t->data);
        preoder(t->left);
        preoder(t->right);
    }
}
void inorder(struct node *t)
{
    if (t != NULL)
    {
        inorder(t->left);
        printf("%d ", t->data);
        inorder(t->right);
    }
}
void postorder(struct node *t)
{
    if (t != NULL)
    {
        postorder(t->left);
        postorder(t->right);
        printf("%d ", t->data);
    }
}
// Queue
struct queue
{
    struct node *ptr;
    struct queue *next;
};

struct queue *head = NULL;
struct queue *tail = NULL;

void enQueue(struct node *p)
{
    if (head == NULL)
    {
        struct queue *temp = (struct queue *)malloc(sizeof(struct queue));
        temp->ptr = p;
        temp->next = NULL;
        head = temp;
        tail = temp;
    }
    else
    {
        struct queue *temp = (struct queue *)malloc(sizeof(struct queue));
        temp->ptr = p;
        temp->next = NULL;
        tail->next = temp;
        tail = temp;
    }
}
struct node *deQueue()
{
    if (head == NULL)
    {
        printf("The queue is empty\n");
        return 0;
    }
    else
    {
        struct node *x = head->ptr;
        struct queue *t;
        t = head;
        head = head->next;
        free(t);
        return x;
    }
}
void display()
{
    struct queue *p = head;
    while (p != NULL)
    {
        printf("%d ", p->ptr);
        p = p->next;
    }
    printf("\n");
}
int isEmpty()
{
    if (head == NULL)
        return 0;
    else
        return 1;
}
void levelorder(struct node *t)
{
    printf("%d ", t->data);
    enQueue(t);
    while (isEmpty())
    {
        struct node* t = deQueue();
        if (t->left)
        {
            printf("%d ", t->left->data);
            enQueue(t->left);
        }
        if (t->right)
        {
            printf("%d ", t->right->data);
            enQueue(t->right);
        }
    }
}
void leftView(struct node* t)
{  
    printf("%d ",t->data);
    if(t->left)
    {
        leftView(t->left);
    }
    else if(t->right)
    {
     leftView(t->right);
    }

}
void rightView(struct node* t)
{  
    printf("%d ",t->data);
    if(t->right)
    {
        rightView(t->right);
    }
    else if(t->right)
    {
     rightView(t->right);
    }

}
int main()
{
    struct node *root = create();
    preoder(root);
    printf("\n");
    // levelorder(root);
    // printf("\n");
    rightView(root);
    printf("\n");
    leftView(root);
    printf("\n");

    return 0;
}