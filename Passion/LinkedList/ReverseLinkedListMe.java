import java.io.*;
public class ReverseLinkedListMe{
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
		Node<Integer> res=getReversed(null,header);
		while(res!=null){
			System.out.print(res.getData()+"->");
			res=res.getNext();
		}		
	}
	public static Node<Integer> getReversed(Node<Integer> prev,Node<Integer> curr){
		Node<Integer> tmp=curr.getNext();
		curr.setNext(prev);
		while(tmp!=null){
			prev=curr;
			curr=tmp;
			tmp=tmp.getNext();
			curr.setNext(prev);
		}
		return curr;
	}
	public static Node<Integer> getReversed1(Node<Integer> curr){
		if(curr==null)
			return null;
		if(curr.getNext()==null)
			return curr;
		Node<Integer> second=curr.getNext();
		curr.setNext(null);
		Node<Integer> rev=getReversed1(second);
		second.setNext(curr);
		return rev;
	}
}
