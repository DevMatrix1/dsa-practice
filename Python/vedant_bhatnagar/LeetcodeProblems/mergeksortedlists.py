import heapq
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def mergeKLists(self, lists):
        """
        :type lists: List[ListNode]
        :rtype: ListNode
        """
        hp = []
        for head in lists:
            if head:
                heapq.heappush(hp, (head.val,head))
        ans = ListNode()
        p = ans 
        while hp:
            el = heapq.heappop(hp)[1]
            p.next = el
            p = p.next
            if el.next:
                heapq.heappush(hp, (el.next.val, el.next))
        return ans.next
            