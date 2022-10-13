#Q:https://practice.geeksforgeeks.org/problems/linked-list-that-is-sorted-alternatingly/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=linked-list-that-is-sorted-alternatingly


'''def sort(h1):
    #return head
    temp=h1
    arr=[]
    while(temp):
        arr.append(temp.data)
        temp=temp.next
    arr.sort()
    new=Node(arr[0])
    head=new
    for i in  range (1,len(arr)):
        new.next=Node(arr[i])
        new=new.next
    if new.next == None:
        return head'''

      '''  temp=head
        arr=[]
        while(temp):
            arr.append(temp.val)
            temp=temp.next
        arr.sort()
        temp=head
        for el in arr:
            temp.val=el
            temp=temp.next
        return head'''