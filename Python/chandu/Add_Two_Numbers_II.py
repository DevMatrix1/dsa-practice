def numbers(head):
    res = ""
    while head:
        res+= str(head.data)
        head = head.next
    return int(res)
def solve(l1, l2):
    # CODE HERE
    temp = kat = Node(-1)
    for digit in str(numbers(l1) + numbers(l2)):
        temp.next = Node(digit)
        temp = temp.next
    
    return kat.next
