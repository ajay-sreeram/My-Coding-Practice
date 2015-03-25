import java.io.*;
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { 
	 val = x;
	 }
 }
 
public class PreInPost {
	public static boolean check;
	public static int ptr;
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int i;
		
		String tarr[]=br.readLine().trim().split(" ");
		int in[]=new int[n];
		for(i=0;i<n;i++)
			in[i]=Integer.parseInt(tarr[i]);
		
		tarr=br.readLine().trim().split(" ");
		int pre[]=new int[n];
		for(i=0;i<n;i++)
			pre[i]=Integer.parseInt(tarr[i]);
		
		tarr=br.readLine().trim().split(" ");
		int post[]=new int[n];
		for(i=0;i<n;i++)
			post[i]=Integer.parseInt(tarr[i]);
		
		TreeNode root=build(in,post);
		check=true;
		
		
		ptr=0;
		preOrder(root,pre);
		//System.out.println("RESULT:");
		if(check)
			System.out.println("yes");
		else
			System.out.println("no");
	}
	public static void preOrder (TreeNode root,int pre[])
	{
	 
	  if(root == null) return ;
	  
	  //System.out.print(" "+root.val);
	   if(root.val!=pre[ptr++]){
		  check=false;
		  return;
	  } 
	  
	  preOrder( root.left,pre);
	  preOrder( root.right,pre ); 
	  
	}
    public static TreeNode build(int[] inorder, int[] postorder) {
        int inStart = 0;
        int inEnd = inorder.length-1;
        int postStart =0;
        int postEnd = postorder.length-1;
        return build(inorder, inStart, inEnd, postorder, postStart, postEnd);
    }
 
    public static TreeNode build(int[] inorder, int inStart, int inEnd, 
                            int[] postorder, int postStart, int postEnd){
        if(inStart > inEnd || postStart > postEnd)
            return null;
        int rootValue = postorder[postEnd];
        TreeNode root = new TreeNode(rootValue);
        int k=0;
        for(int i=0; i< inorder.length; i++){
            if(inorder[i]==rootValue){
                k = i;
                break;
            }
        }
        root.left = build(inorder, inStart, k-1, postorder, postStart, postStart+k-(inStart+1));
        root.right = build(inorder, k+1, inEnd, postorder, postStart+k-inStart, postEnd-1);
        return root;
    }
}