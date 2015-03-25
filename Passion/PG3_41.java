class ListNode{
private int data;
private ListNode next;
public ListNode(int data){
this.data=data;
}
public void setData(int Data){
this.data=data;
}
public int getData(){
return data;
}
public void setNext(ListNode next){
this.next=next;
}
public ListNode getNext(){
return this.next;
}
}

public class PG3_41{
public static void main(String args[]){
System.out.println(getPosition(10,3).getData());
}
public static ListNode getPosition(int n,int m){
ListNode p,q;
p.setData(1);
return new ListNode(4);
}
}