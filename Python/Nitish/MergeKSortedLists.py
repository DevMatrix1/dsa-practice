import heapq 
from typing import List,Optional
# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
    def __str__(self):
        return str(self.val)+"->"+str(self.next)
class Solution:
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        ans = ListNode()
        p = ans 
        # heapify and heappush use some mechanism to compare the element 
        #reffered the below link for help
        # https://stackoverflow.com/questions/70141065/how-to-place-a-linked-list-node-from-a-list-of-linked-lists-onto-a-heap-in-pytho
        hp = [(l.val, i, l) for i, l in enumerate(lists) if l]
        heapq.heapify(hp)
        
        while hp:
            _,pos,el = heapq.heappop(hp)
            p.next = el 
            p = p.next
            if el.next:
                # adding the pos will insure always a unique value is added for comparison 
                heapq.heappush(hp,(el.next.val,pos,el.next))
        
        return ans.next
        
if __name__=="__main__":
    h1 = ListNode(1,ListNode(4,ListNode(5)))
    h2 = ListNode(1,ListNode(3,ListNode(4)))
    h3 = ListNode(2,ListNode(6))
    lists = [h1,h2,h3]
    print(Solution().mergeKLists(lists))
