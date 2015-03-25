import java.io.*;
public class ReverseLinkedListInPair{
	public static void main(String args[])throws IOException{
		Node<Integer> header=new Node<Integer>(new Integer(1));
		Node<Integer> tmp=new Node<Integer>(new Integer(2));
		header.setNext(tmp);
		Node<Integer> tmp1=new Node<Integer>(new Integer(3));
		tmp.setNext(tmp1);
		tmp=tmp1;
		tmp1=new Node<Integer>(new Integer(4));
		tmp.setNext(tmp1);
		tmp=tmp1;
		tmp1=new Node<Integer>(new Integer(5));
		tmp.setNext(tmp1);
		tmp=tmp1;
		tmp1=new Node<Integer>(new Integer(6));
		tmp.setNext(tmp1);
		Node<Integer> res=getReversed(header);
		while(res!=null){
			System.out.print(res.getData()+"->");
			res=res.getNext();
		}
		
	}
	public static Node<Integer> getReversed(Node<Integer> head)throws IOException{
		if(head==null||head.next==null)
			return null;
		Node<Integer> current=head;
		Node<Integer> next=current.getNext();
		Node<Integer> tmp=next.getNext();
		next.setNext(current);
		current.setNext(getReversed(tmp));
		Node<Integer> res=next;
		return next;
	}
}  