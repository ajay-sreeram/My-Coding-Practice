public class RevList{
public static void main(String args[]){
DLLNode root=new DLLNode(1);
DLLNode tmp1=root,tmp2;
int i=2;
for(;i<=8;i++){
	tmp2=new DLLNode(i);
	tmp1.setNextNode(tmp2);
	tmp2.setPrevNode(tmp1);
	tmp1=tmp2;
}
tmp1=root;
System.out.println("DATA:");
while(tmp1!=null){
	System.out.print(" "+tmp1.getData());
	tmp1=tmp1.getNextNode();
}
System.out.println();
root=rev(root);
System.out.println("\nREVERSE DATA:");
while(root!=null){
	System.out.print(" "+root.getData());
	root=root.getNextNode();
}
}

public static DLLNode rev(DLLNode head){
 int cnt=0;
 if (head == null) {
            return null;
        }
 else if (head.getNextNode() == null) {
            return head;
    }
     else {
            DLLNode currentNode = head;
            DLLNode nextNode = null;
            while (currentNode != null) {
                DLLNode previousCurrentNode = currentNode.getPrevNode();
                nextNode = currentNode.getNextNode();
                currentNode.setNextNode(previousCurrentNode);
                currentNode.setPrevNode(nextNode);
                
				System.out.print(++cnt+":");
				DLLNode tmp1=currentNode;
				while(tmp1!=null){
					System.out.print(" "+tmp1.getData());
					tmp1=tmp1.getNextNode();
				}
				System.out.println();

				if (nextNode != null) {
                    currentNode = nextNode;
			} else {
                    return currentNode;
				}
				
			
			}
			//System.out.println("HELLO");
        return currentNode;
	}        
}	

}