#include<stdio.h>
#include<stdlib.h>

struct node {
    int data;
    struct node* right;
    struct node* left;
};

struct node* create()
{
    struct node* p;
    int x;
    printf("Enter the data of node \n");
    scanf("%d",&x);
    if(x==-1)
    return NULL;
    p=(struct node*)malloc(sizeof(struct node));
    p->data=x;
    printf("Enter the data of left child\n");
    p->left=create();
    
    printf("Enter the data of right child\n");
    p->right=create();
    
    return p;
}

void preoder(struct node* t)
{    if(t!=NULL)
{
     printf("%d ",t->data);
     preoder(t->left);
     preoder(t->right);
}
}
void inorder(struct node* t)
{
    if(t!=NULL)
    {                                                   
        inorder(t->left);
        printf("%d ",t->data);
        inorder(t->right);
    }
}
void postorder(struct node* t)
{
    if(t!=NULL)
    {
        postorder(t->left);
        postorder(t->right);
        printf("%d ",t->data);
    }
}

struct node* isearch(struct node* t,int key)
{
    while(t!=NULL)
    {   if(t==NULL)
         {
            return NULL;
         }    
        if(t->data==key)
        {
            return t;
        }
        else if(t->data>key)
        {
            t=t->left;
        }
        else{
            t=t->right;
        }
    }
}
struct node* rsearch(struct node* t,int key)
{
    if(t==NULL)
    {
        return NULL;
    }
    if(t->data==key)
    {
        return t;
    }
    else if(t->data>key)
    {
        rsearch(t->left,key);
    }
    else{
        rsearch(t->right,key);
    }
}

int main()
{
struct node* root= create();
preoder(root);
printf("\n");
inorder(root);
printf("\n");
postorder(root);
return 0;
}