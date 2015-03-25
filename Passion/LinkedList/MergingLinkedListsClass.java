import java.io.*;
class MergingLinkedListsClass {
	static class Node{
		int data;
		Node next;
		public Node(int data){
			this.data=data;
			next=null;
		}
	}
	public static void main(String[] args)throws IOException {
		Node a=new Node(1);
		Node b=new Node(3);
		Node c=new Node(2);
		Node d=new Node(5);
		Node e=new Node(6);
		Node f=new Node(4);
		Node g=new Node(8);
		Node h=new Node(7);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=f;
		f.next=g;
		g.next=h;
		Node result=mergeSort(a);
		while(a!=null)
		{
			System.out.print(a.data+"->");
			a=a.next;
		}
	}
	public static Node mergeSort(Node a){
		if(a==null||a.next==null)
			return a;
		Node arr[]=split(a);
		Node one=mergeSort(arr[0]);
		Node two=mergeSort(arr[1]);
		Node res=merge(one,two);
		return res;
	}
	public static Node[] split(Node node){
		Node slow=node;
		Node fast=node;
		while(fast!=null&&fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}
		Node res[]=new Node[2];
		res[0]=slow;
		res[1]=slow.next;
		if(slow!=null);
			slow.next=null;
		return res;
	}
	public static Node merge(Node l1,Node l2){
		if(l1==null){
			return l2;
		}
		if(l2==null){
			return l1;
		}
		Node res=null;
		if(l1.data<l2.data){
			res=l1;
			res.next=merge(l1.next,l2);
		}else{
			res=l2;
			res.next=merge(l1,l2.next);
		}
		return res;
	}
}