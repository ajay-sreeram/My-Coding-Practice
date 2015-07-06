class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
}
public class ListAdd {
    static ListNode node;
    static int carry;
	public static void main(String args[]){
		//(2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(9);
		ListNode tmp=n1;
		/* tmp.next=new ListNode(4);
		tmp=tmp.next;
		tmp.next=new ListNode(3);
		tmp=tmp.next; */
		tmp=n2;
		tmp.next=new ListNode(9);
		tmp=tmp.next;
		tmp.next=new ListNode(9);
		tmp=tmp.next;
		
		display(addTwoNumbers(n1,n2));
		
	}
	public static ListNode addTwoNumbers(ListNode A, ListNode B) {
	    node=new ListNode(-1);
	    carry=0;
	    auxaddTwoNumbers(A,B,node);
	    return node.next;
	}
	public static void auxaddTwoNumbers(ListNode A, ListNode B,ListNode node) {
	    if(A==null&&B==null)
	        return;
	    if(A!=null&&B!=null){
	        int tmp=A.val+B.val+carry;
	        carry=tmp/10;
			//System.out.println(tmp%10);
	        ListNode newnode=new ListNode(tmp%10);
	        node.next=newnode;
	        auxaddTwoNumbers(A.next,B.next,newnode);
	    }else if(A!=null){
	        int tmp=A.val+carry;
	        carry=tmp/10;
	        ListNode newnode=new ListNode(tmp%10);
	        node.next=newnode;
	        auxaddTwoNumbers(A.next,B,newnode);
	    }else if(B!=null){
	        int tmp=B.val+carry;
	        carry=tmp/10;
	        ListNode newnode=new ListNode(tmp%10);
	        node.next=newnode;
	        auxaddTwoNumbers(A,B.next,newnode);
	    }
	    if(carry!=0){
	        ListNode newnode=new ListNode(carry);
			while(node.next!=null)
				node=node.next;
	        node.next=newnode;
	        //auxaddTwoNumbers(A.next,B.next,newnode);
	    }
	}
	public static void display(ListNode n){
		if(n==null)
			return;
		System.out.print(n.val+"->");
		display(n.next);
			
	}
}
