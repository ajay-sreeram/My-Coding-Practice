 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
 class ListNode {
     public int val;
     public ListNode next;
     ListNode(int x) { val = x; next = null; }
 }

public class ListTree {
	public void disp(TreeNode node){
		if(node==null)
				return;
		System.out.println(node.val);
		disp(node.left);
		disp(node.right);
	}
	public static void main(String args[]){
		ListNode root=new ListNode(1);
		ListNode node1=new ListNode(2);
		root.next=node1;
		ListNode node2=new ListNode(3);
		node1.next=node2;
		node1=new ListNode(4);
		node2.next=node1;
		node2=new ListNode(5);
		ListTree l=new ListTree();
		node1.next=node2;
		TreeNode res=l.sortedListToBST(root);
		l.disp(res);
		
	}
	 public TreeNode sortedListToBST(ListNode A) {
	    int size=0;
	    ListNode tmp=A;
	    while(tmp!=null){
	        size++;
	        tmp=tmp.next;
	    }
		node=A;
	    return auxsortedListToBST(0,size-1);
	}
	public TreeNode auxsortedListToBST(int s,int e){
	    if(s>e)
	        return null;
		int mid = s + (e - s) / 2;
	    TreeNode left=auxsortedListToBST(s,mid-1);
	    TreeNode par=new TreeNode(node.val);
	    par.left=left;
	    node=node.next;
	    par.right=auxsortedListToBST(mid+1,e);
	    return par;
	} 
	private ListNode node;
	public TreeNode sortedListToBST2(ListNode head) {
    if(head == null){
        return null;
    }

    int size = 0;
    ListNode runner = head;
    node = head;

    while(runner != null){
        runner = runner.next;
        size ++;
    }

    return auxsortedListToBST(0, size - 1);
	
}

public TreeNode inorderHelper(int start, int end){
    if(start > end){
        return null;
    }

    int mid = start + (end - start) / 2;
    TreeNode left = inorderHelper(start, mid - 1);

    TreeNode treenode = new TreeNode(node.val);
    treenode.left = left;
    node = node.next;

    TreeNode right = inorderHelper(mid + 1, end);
    treenode.right = right;

    return treenode;
}
}
