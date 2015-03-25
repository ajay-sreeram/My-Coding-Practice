class Node{
public int num;
}
public class Try2{
public static void main(String args[]){
	Node n1=new Node();
	n1.num=10;
	fun(n1);
	System.out.println(n1.num);
}
public static void fun(Node n){
	n=new Node();
	n.num=20;
}
}