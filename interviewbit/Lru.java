import java.util.*;
class Node{
    int data;
    Node next,prev;
    public Node(int data){
        this.data=data;
    }
    public boolean equals(Object n){
        Node tmp=(Node)n;
        return data==tmp.data;
    }
    public int hashCode(){
        return data;
    }
	public String toString(){
		return ""+data;
	}
}
public class Lru {
	public static void main(String args[]){
		Lru l=new Lru(2);
		//System.out.println(l.header.next.data);
		l.set(2,1);
		l.display();
		//System.out.println(l.header.next.data);
		l.set(1,1);
		l.display();
		//System.out.println(l.header.next.data);
		l.set(2,3);
		l.display();
		//System.out.println(l.header.next.data);
		l.set(4,1);
		l.display();
		System.out.println("RESULT");
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		
	}
    Node header,footer;
    HashMap<Node,Integer> hm;
    int cap;
    int cnt;
    public Lru(int capacity) {
        cap=capacity;
        header=new Node(-1);
		footer=new Node(-1);
		header.next=footer;footer.prev=header;
        hm=new HashMap<Node,Integer>();
        cnt=0;
    }
    
    public int get(int key) {
        Integer tmp=hm.get(new Node(key));
        return tmp==null?-1:tmp.intValue();
        /*if(!hm.containsKey(new Node(key)))
            return -1;
        else{
            //Node tmp=header.next;
            return hm.get(new Node(key)).intValue();
        }*/
    }
    public void display(){
		Node tmp=header.next;
		System.out.println("COUNTER:"+cnt);
		while(tmp!=footer){
			System.out.print(tmp.data+"->");
			tmp=tmp.next;
		}
		System.out.println();
	}
    public void set(int key, int value) {
        Node tmp=new Node(key);
        if(cnt<cap){
            /* if(header.next==footer){
                header.next=tmp;
                tmp.prev=header;
				footer.prev=tmp;
				tmp.next=footer;
				//System.out.println("HAI");
            }else{
             */    /* Node t=footer.prev;
				t.next=tmp;
				tmp.next=footer;
				footer.prev=tmp;
				tmp.prev=t; */
				
				Node t=header.next;
                header.next=tmp;
                t.prev=tmp;
                tmp.next=t;
                tmp.prev=header;
				//System.out.println("header:"+header.next.data+" next:"+header.next.next.data); 
            //}
            cnt++;
            hm.put(tmp,value);
			//System.out.println(hm);
        }else{
			System.out.println("Before deleting:"+key);
				display();
            if(header.next!=footer){
                Node t=footer.prev;
                hm.remove(t);
                t.prev.next=footer;
				footer.prev=t.prev;
				
				/* header.next=header.next.next;
                if(header.next!=null)
                    header.next.prev=header; */
                cnt--;
                set(key,value);
            }
			System.out.println("After deleting:"+key);
				display();
            
        }
        
    }
}
