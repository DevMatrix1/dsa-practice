'''Q:https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=finding-middle-element-in-a-linked-list'''


def findMid(self, head):
    # Code here
    # return the value stored in the middle node
    if head is None:
        return -1
    slow, fast = head, head
    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next
    return slow.data
    '''a=[]
        x=head
        while x:
            a.append(x.data)
            x=x.next
        return a[len(a)//2]
            '''
