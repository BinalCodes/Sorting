import java.util.PriorityQueue;

public class MergeKSortedLists {
	
	static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	public static void main(String[] args) {
		//[[1,4,5],[1,3,4],[2,6]]
		ListNode [] arr = new ListNode[3];
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(4);
		ListNode l3 = new ListNode(15);
		l1.next = l2; l2.next = l3;
		arr[0] = l1;
		 l1 = new ListNode(1);
		l2 = new ListNode(3);
		l3 = new ListNode(4);
		l1.next = l2;l2.next = l3;
		arr[1] = l1;
		l1 = new ListNode(2);
		l2 = new ListNode(6);
		l1.next = l2;
		arr[2] = l1;
		ListNode ans = mergeKLists(arr);
		while(ans!=null) {
			System.out.println(ans.val);
			ans = ans.next;
		}
	}
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	    public static ListNode mergeKLists(ListNode[] lists) {
	        if (lists==null || lists.length==0) return null;
	        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(lists.length,(ListNode l1,ListNode l2) -> l1.val - l2.val );
	        for(ListNode l : lists){
	            if(l!=null)
	                queue.offer(l);
	        }
	        ListNode result = new ListNode(-1);
	        ListNode dummy = result;
	        while(!queue.isEmpty()){
	            result.next = queue.poll();
	            result = result.next;
	            if(result!=null && result.next!=null){
	                queue.offer(result.next);
	            }
	        }
	        return dummy.next;
	        
	    }

}
