// link- https://workat.tech/problem-solving/practice/linked-list-to-array

class Solution {
	List<Integer> linkedListToArray (ListNode head) {
	    // add your logic here
		List<Integer> list=new ArrayList<>();
		while(head!=null){
			list.add(head.data);
			head=head.next;
		}
		
		return list;
	}
}