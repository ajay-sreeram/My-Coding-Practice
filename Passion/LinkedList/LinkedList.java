
public class LinkedList{
	class Node<Object>{
	Object data;
	Node<Object> next;
	public Node(Object data){
		this.data=data;
		next=null;
	}
	}
	private Node<Object> header;
	private Node<Object> last;
	public LinkedList(){
		header=new Node(null);
		last=header;
	}	
	public void insert(Object element){
		Node<Object> newNode=new Node<Object>(element);
		last.next=newNode;
		last=newNode;
	} 
	public Object get(int i){
		Node res=header;
		for(;i>=0;i--)
			res=res.next;
		return res.data;
	}
	
	public void delete(){
		.......................................
	}
}