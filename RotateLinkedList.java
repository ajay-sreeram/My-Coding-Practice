class ListNode{
	int val;
	ListNode next;
	public ListNode(int data){
		val=data;
	}
	public String toString(){
		return ""+val;
	}
}
public class RotateLinkedList {
	public static void main(String args[]){
		ListNode head=new ListNode(1);
		ListNode node2=new ListNode(2);
		head.next=node2;
		node2.next=new ListNode(3);
		ListNode res=rotateRight(head,1);
		while(res!=null){
			System.out.println(res);
			res=res.next;
		}
	}
    public static ListNode rotateRight(ListNode head, int n) {
        int l=0;
        if(head==null||head.next==null)
            return head;
        ListNode ptr=head;
        while(ptr.next!=null){
            ptr=ptr.next;
            l++;
        }
        l++;
		System.out.println("LEN:"+l);
        n=n%l;
        ListNode ptr2=head;
        int t=l-n-1;
        while(t!=0){
            t--;
            ptr2=ptr2.next;
        }
		System.out.println("MID:"+ptr2);
        ListNode resHead=ptr2.next;
        ptr2.next=null;
        ptr.next=head;
        return resHead;
    }
}