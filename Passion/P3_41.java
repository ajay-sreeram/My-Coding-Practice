class ListNode{
ListNode next;
int val;
public ListNode(int a){
val=a;
}
public ListNode getNext(){
return next;
}
public void setNext(ListNode l){
this.next=l;
}

public int getVal(){
return val;
}
public void setVal(int v){
val=v;
}
}

public class P3_41{
public static void main(String args[]){
System.out.println(getPosition(10,3));
}
public static int getPosition(int n,int m){
ListNode p,q;
p=new ListNode(1);
q=p;
int i,j;
for(i=2;i<=n;i++)
{
	p.setNext(new ListNode(i));
	p=p.getNext();
}
p.setNext(q);

//q=q.getNext();
//for(;q.getVal()!=1;q=q.getNext())
//	System.out.print(" "+q.getVal());

for(i=n;i>1;i--){
	for(j=0;j<m-1;j++)
		p=p.getNext();
	p.setNext(p.getNext().getNext());
}

return p.getVal();

}

}