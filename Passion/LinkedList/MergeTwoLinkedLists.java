import java.io.*;
public class MergeTwoLinkedLists{
	public static void main(String args[])throws IOException{
		Node<Integer> header1=new Node<Integer>(new Integer(5));
		Node<Integer> tmp=new Node<Integer>(new Integer(7));
		header1.setNext(tmp);
		Node<Integer> tmp1=new Node<Integer>(new Integer(8));
		tmp.setNext(tmp1);
		tmp=tmp1;
		tmp1=new Node<Integer>(new Integer(10));
		tmp.setNext(tmp1);
		
		Node<Integer> header2=new Node<Integer>(new Integer(6));
		tmp=new Node<Integer>(new Integer(9));
		header2.setNext(tmp);
		tmp1=new Node<Integer>(new Integer(11));
		tmp.setNext(tmp1);
		tmp=tmp1;
		tmp1=new Node<Integer>(new Integer(12));
		tmp.setNext(tmp1);
	
		Node<Integer> mixed=getMerge(header1,header2);
		while(mixed!=null){
			System.out.print(mixed.getData()+"->");
			mixed=mixed.getNext();
		}
	}
	public static Node<Integer> getMerge(Node<Integer> a,Node<Integer> b){
		if(a==null)
			return b;
		if(b==null)
			return a;
		Node<Integer> res=null;
		if(a.getData()<b.getData()){
			res=a;
			res.setNext(getMerge(a.getNext(),b));
		}
		else{
			res=b;
			res.setNext(getMerge(a,b.getNext()));
		}
		return res;
	}
}