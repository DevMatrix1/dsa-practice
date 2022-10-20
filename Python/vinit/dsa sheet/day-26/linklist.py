# Q:https://practice.geeksforgeeks.org/problems/linked-list-insertion-1587115620/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=linked-list-insertion

 '''def insertAtBegining(self,head,x):
        # code here 
        first=Node(x)
        if head is None:
            return first
        first.next=head
        return first
        
    
    #Function to insert a node at the end of the linked list.
    def insertAtEnd(self,head,x):
        # code here 
        last=Node(x)
        if head is None :
            return last
        curr = head
        while curr.next:
            curr=curr.next
        curr.next=last
        return head'''

#Q;https://practice.geeksforgeeks.org/problems/delete-a-node-in-single-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=delete-a-node-in-single-linked-list

'''def delNode(head, k):
    # Code here
    a=head

    if k==1:

        return a.next

    c=1

    while a and a.next:

        c+=1

        if c==k:

            a.next=a.next.next

        a=a.next

    return head'''