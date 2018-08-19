package carlxuan.algorithm.easy;

public class MergeTwoList {

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n3 = new ListNode(3);
		ListNode n5 = new ListNode(5);
		ListNode n2 = new ListNode(2);
		ListNode n4 = new ListNode(4);
		ListNode n6 = new ListNode(6);
		ListNode n8 = new ListNode(8);
		
		n1.next = n3;
		n3.next = n5;
		n2.next = n4;
		n4.next = n6;
		n6.next = n8;
		System.out.println(n1);
		System.out.println(n2);
		
		ListNode result = merge(n1, n2);
//		ListNode result = mergeRecursive(n1, n2);
		System.out.println(result);
	}
	
	
	static class ListNode{
		int value;
		public ListNode(int value) {
			this.value = value;
		}
		ListNode next;
		
		@Override
		public String toString()
		{
			ListNode temp = next;
			StringBuffer buf = new StringBuffer();
			buf.append(value);
			while(temp != null) {
				buf.append(", "+ temp.value);
				temp = temp.next;
			}
			return buf.toString();
		}
	}
	
	public static ListNode merge(ListNode n1, ListNode n2) {
		ListNode dummy = new ListNode(-1), pointer = dummy;
		while(n1 != null && n2 != null) {
			if(n1.value < n2.value) {
				pointer.next = n1;
				n1 = n1.next;
			}else
			{
				pointer.next = n2;
				n2 = n2.next;
			}
			pointer = pointer.next;
		}
		pointer.next = n1 == null ? n2:n1;
		return dummy.next;
	}
	
	public static ListNode mergeRecursive(ListNode n1, ListNode n2) {
		ListNode header = new ListNode(-1);
		mergeRecursive(header, n1, n2);
		return header.next;
	}
	
	private static void mergeRecursive(ListNode header, ListNode n1, ListNode n2) {
		ListNode cur = header;
		if(n1 == null) {
			cur.next = n2;
			return;
		}else if(n2 == null) {
			cur.next = n1;
			return;
		}
		if(n1.value < n2.value) {
			cur.next = n1;
			n1 = n1.next;
		}else
		{
			cur.next = n2;
			n2 = n2.next;
		}
		cur = cur.next;
		mergeRecursive(cur, n1, n2);
	}

}
