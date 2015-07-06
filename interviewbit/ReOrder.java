  class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
  }
 
public class ReOrder {
	public static void main(String args[]){
		ListNode a=new ListNode(1);
		ListNode b=new ListNode(2);
		a.next=b;
		ListNode tmp=b;
		b=new ListNode(3);
		tmp.next=b;
		tmp=b;
		b=new ListNode(4);
		tmp.next=b;
		tmp=b;
		/* b=new ListNode(5);
		tmp.next=b;
		tmp=b; */
		
		System.out.println("BEFORE");
		display(a);
		tmp=reorderList(a);
		System.out.println("AFTER");
		display(a);
	}
	
	public static ListNode reorderList(ListNode A) {
	    ListNode p1,p2;
	    p1=A;
	    p2=A;
	    int size=0;
	    while(p2!=null){
	        p2=p2.next;
	        size++;
	    }
	    int half=size/2;
		ListNode pre=null;
	    p2=A;
	    for(int i=0;i<half;i++){
			pre=p2;
			p2=p2.next;
		}
	    pre.next=null;
		/* System.out.println("P1:");
		display(p1);
		System.out.println("P2:");
		display(p2); */
		
	    pre=null;
	    while(p2!=null){
	        ListNode tmp=p2.next;
	        p2.next=pre;
	        pre=p2;
	        p2=tmp;
	    }
		p2=pre;
		/* System.out.println("P2:");
		display(p2); */
		
	    boolean flag=true;
	    while(p1!=null&&p2!=null){
	        if(flag){
    	        ListNode tmp=p1.next;
    	        p1.next=p2;
    	        p1=tmp;
    	        //p2=p2.next;
    	        flag=false;
	        }else{
	            ListNode tmp=p2.next;
    	        p2.next=p1;
    	        p2=tmp;
    	       // p1=p1.next;
    	        flag=true;
	        }
	    }
		
	    return A;
	}
	
	public static void display(ListNode node){
		while(node!=null){
			System.out.print(node.val+"->");
			node=node.next;
		}
		System.out.println();
	}
}
