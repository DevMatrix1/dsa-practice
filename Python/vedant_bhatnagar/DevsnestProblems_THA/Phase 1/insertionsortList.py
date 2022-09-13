ans = Node(9999)
def insertInList(head, node):
    global ans
    temp = ans
    while temp.next!=None:
        if temp.next and temp.next.data > node.data:
            node.next = temp.next
            temp.next = node
            break
        else:
            temp=temp.next    
    if temp.next == None:
        temp.next=node
        node.next = None
def solve(head):
    ptr = head
    while ptr!=None:
        temp = ptr
        ptr = ptr.next
        insertInList(ans, temp)
    return ans.next

        