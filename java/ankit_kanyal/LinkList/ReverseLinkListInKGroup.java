// Link-


// Iterative Approach.

class Solution {
	ListNode reverseLinkedListKGroup(ListNode head, int k) {
		ListNode mainCurr = head;
        ListNode dummyNode = new ListNode(-1);
        ListNode newCurr = dummyNode;
        
        while(mainCurr != null){
            ListNode curr = mainCurr;
            
            //get next group first node
            int i = k;
            int availableNode = 0;
            while(i --> 0 && curr != null){
                curr = curr.next;
                availableNode++;
            }
            ListNode nextGroupFirstNode = curr;
            if(availableNode == k){
                newCurr.next = getReverseFirstKNodes(mainCurr, k);
                newCurr = mainCurr;
            }else{
                newCurr.next = mainCurr;
            }
            
            
            mainCurr = nextGroupFirstNode;
        }
        
        return dummyNode.next;
	}
	
	 public ListNode getReverseFirstKNodes(ListNode node, int k){
        ListNode prev = null;
        ListNode curr = node;
        
        while(curr != null && k --> 0){
            ListNode next = curr.next;
            
            curr.next = prev;
            prev = curr;
            
            curr = next;
        }

        return prev;
    }
}

// Recusrsive Approach

class Solution {
	ListNode reverseLinkedListKGroup(ListNode head, int k) {
		ListNode currentNode = head;
		int totalNodes = 0;
		while (currentNode != null && totalNodes < k) {
			currentNode = currentNode.next;
			totalNodes++;
		}
		if (totalNodes < k) {
			return head;
		}
		currentNode = head;
		ListNode prevNode = null;
		ListNode nextNode = null;
		int nodeCount = 0;
		while (nodeCount < k) {
			nextNode = currentNode.next;
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
			nodeCount++;
		}
		head.next = reverseLinkedListKGroup(nextNode, k);
		return prevNode;
	}
}