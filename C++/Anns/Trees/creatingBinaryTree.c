#include <stdio.h>
#include <stdlib.h>
struct queue
{
    struct node* ptr;
    struct queue *next;
};

struct queue *head = NULL;
struct queue *tail = NULL;

void enQueue(struct node* p)
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
struct node* deQueue()
{
   if(head==NULL)
   {
    printf("The queue is empty\n");
    return -1;
   }
   else
   {
    struct node* x = head->ptr;
    struct queue *t;
    t = head;
    head = head->next;
    free(t);
    return (struct node*)x;
   }
}
void disp()
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
        return 1;
    else
        return 0;
}
///////////////////////////////////////////////
struct node{
    int val;
    struct node* lchild;
    struct node* rchild;
};
struct node* root=NULL;

void treeCreate()
{   struct node *temp,*ptr;
    int x;
    printf("Enter the data of root\n");
    scanf("%d",&x);
    root=(struct node*)malloc(sizeof(struct node));
    root->lchild=root->rchild==NULL;
    enQueue(&root);
    while(!isEmpty())
    {
     ptr=deQueue();
     printf("Enter the left child\n");
     scanf("%d",&x);
     if(x!=-1)
     {
        temp=(struct node*)malloc(sizeof(struct node));
        temp->val=x;
        temp->lchild=temp->rchild=NULL;
        ptr->lchild=temp;
        enQueue(&temp);
     }
     printf("Enter the right child\n");
     scanf("%d",&x);
     if(x!=-1)
     {
        temp=(struct node*)malloc(sizeof(struct node));
        temp->val=x;
        temp->lchild=temp->rchild=NULL;
        ptr->rchild=temp;
        enQueue(&temp);
     }
      
    }
}
Preorder(struct node* p)
{
    if(p)
    {
        printf("%d ",p->val);
        Preorder(&p->lchild);
        Preorder(&p->rchild);
    }
}

int main()
{
treeCreate();
Preorder(&root);

return 0;
}