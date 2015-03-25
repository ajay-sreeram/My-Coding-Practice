import java.io.*;
public class NthNodeFromLast{
	public static void main(String args[])throws IOException{
		Node<Integer> header=new Node<Integer>(new Integer(5));
		Node<Integer> tmp=new Node<Integer>(new Integer(1));
		header.setNext(tmp);
		Node<Integer> tmp1=new Node<Integer>(new Integer(17));
		tmp.setNext(tmp1);
		tmp=tmp1;
		tmp1=new Node<Integer>(new Integer(4));
		tmp.setNext(tmp1);
		NthFromLast(header,2);
	}
	public static void NthFromLast(Node<Integer> header,int n){
		Node<Integer> p1=header;
		Node<Integer> p2=header;
		int cnt=1;
		while(cnt<n){
		p2=p2.getNext();
		cnt++;
		}
		while(p2.getNext()!=null){
			p1=p1.getNext();
			p2=p2.getNext();
		}
		System.out.println("NTH FROM LAST: "+(Integer)p1.getData());
	}
}