class ListNode{
ListNode next;
int val;
public ListNode getNext(){
next=new ListNode();
return next;
}
public void setNext(ListNode l){
next=l;
}

public int getVal(){
return val;
}
public void setVal(int v){
val=v;
}
}

public class P40{
public static void main(String args[]){
System.out.println(getPosition(10,3));
}
public static int getPosition(int n,int m){
ListNode p,q;
p=new ListNode();
p.setVal(1);
q=p;
int i,j;
for(i=2;i<=n;i++)
{
	p=p.getNext();
	p.setVal(i);
}
p.setNext(q);
for(i=0;i<n-1;i++){
	for(j=0;j<m;j++)
		p=p.getNext();
	p.setNext(p.getNext().getNext());
}

return p.getVal();

}

}