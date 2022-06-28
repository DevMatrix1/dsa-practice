// link-https://workat.tech/problem-solving/practice/print-reversed-linked-list

class Solution {
	void printLinkedListReverse (ListNode head) {
	    // add your logic here
		List<Integer> list=new ArrayList<>();
		while(head!=null){
			list.add(head.data);
			head=head.next;
		}
		for(int i=list.size()-1;i>=0;i--){
			System.out.print(list.get(i)+" ");
		}
	}
}