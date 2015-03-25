class ListNode<Integer>{
	int data;
	ListNode<Integer> next;
	public ListNode(){
		data=-1;
		next=null;
	}
	public ListNode(int data,ListNode<Integer> next){
		this.data=data;
		this.next=next;
	}
}
public class ClassLinkedList{
private ListNode<Integer> header;
private ListNode<Integer> last;
private int size;
public ClassLinkedList(){
	header=new ListNode<Integer>();
	last=new ListNode<Integer>();
	size=0;
}
public boolean contains(int num){
	ListNode<Integer> tmp=header;
	while(tmp.next!=null)
		if(tmp.data==num)
			return true;
	return false;
}
public void add(int num){
	ListNode<Integer> tmp=new ListNode<Integer>(num,null);
	last.next=tmp;
	last=tmp;
	size++;
}
public boolean add(int num,int index){
	if(index>=size)
		return false;
	ListNode<Integer> tmp=header;
	int tindex=0;
	while(tindex<index){
		tmp=tmp.next;
		tindex++;
	}
	ListNode<Integer> newNode=new ListNode<Integer>(num,null);
	newNode.next=tmp.next;
	tmp.next=newNode;
	return true;
}
}