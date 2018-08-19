package carlxuan.algorithm;

public class PairNodesSwitch {

	public static void main(String[] args) {
		Node n1 = new Node(1);		
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		Node n8 = new Node(8);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		System.out.println(n1);
//		System.out.println(switchPair(n1));
		System.out.println(switchNodes(n1));
	}
	
	
	public static Node switchNodes(Node header) {
		if(header == null || header.next == null) {
			return header;
		}
		Node dummy = new Node(0);
		dummy.next = header;
		Node cur = dummy;
		while(cur.next != null && cur.next.next != null) {
			Node first = cur.next;
			Node second = cur.next.next;
			cur.next = second;
			first.next = second.next;
			second.next = first;
			cur = cur.next.next;
		}
		return dummy.next;
		
	}
	
	public static Node switchPair(Node header) {
		if(header == null || header.next == null) {
			return header;
		}
		Node dummy = new Node(0);
		dummy.next = header;
		Node cur = dummy;
		while(cur.next != null && cur.next.next != null) {
			Node first = cur.next;
			Node second = cur.next.next;
			// first from [1]->[2]->[3]...... to be [1]->[3]->[4]->[5]......  
			// second remain the same [2]->[3]->[4]......
			// cur from [0]->[1]->[2]->[3]...... to be [0]->[1]->[3]->[4]->[5]......
			// dummy from [0]->[1]->[2]->[3]...... to be [0]->[1]->[3]->[4]->[5]......	
			first.next = second.next;
			
			// cur from [0]->[1]->[3]->[4]->[5]...... to be [0]->[2]->[3]->[4]->[5]......
			// dummy from [0]->[1]->[3]->[4]->[5]...... to be [0]->[2]->[3]->[4]->[5]......
			cur.next = second;
			
			// first remains the same [1]->[3]->[4]->[5]......  
			// second from [2]->[3]->[4]...... to [2]->[1]->[3]->[4]...... 
			// cur from [0]->[1]->[3]->[4]->[5]...... to [0]->[2]->[1]->[3]->[4]......
			// dummy from [0]->[1]->[3]->[4]->[5]...... to [0]->[2]->[1]->[3]->[4]......
			second.next = first;
			
			// cur from [0]->[2]->[1]->[3]->[4]...... to [1]->[3]->[4]->[5]->[6]......
			cur = cur.next.next;
		}
		return dummy.next;
		
	}

	static class Node
	{
		int value;
		Node next;
		public Node(int value) {
			this.value = value;
		}
		
		@Override
		public String toString() {
			Node tmp = this;
			StringBuilder s = new StringBuilder();
			s.append("["+value+"]");
			while(tmp.next != null) {
				tmp = tmp.next;
				s.append("->");
				s.append("["+tmp.value+"]");
			}
			return s.toString();
		}
	}
}
