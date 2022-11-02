# Q: https: // leetcode.com/problems/merge-two-sorted-lists/submissions/

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        newHead = dummyHead = ListNode()
        while list1 and list2:
            if list1.val < list2.val:
                dummyHead.next = list1
                list1 = list1.next
            else:
                dummyHead.next = list2
                list2 = list2.next
            dummyHead = dummyHead.next

        if list1:
            dummyHead.next = list1
        if list2:
            dummyHead.next = list2
        return newHead.next
