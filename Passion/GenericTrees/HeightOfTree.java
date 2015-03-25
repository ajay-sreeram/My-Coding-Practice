public class HeightOfTree{
public static void main(String args[]){
//this array denotes parent of each node eg: parent[0]->-1 so it is root ; lly parent of 1 is 0, parent of 2 is 1 and so on....
	int tree[]=new int[]{-1,0,1,6,6,0,0,2,7};
	int height[]=new int[9];
	int i,j;
	int max=0;
	for(i=0;i<tree.length;i++){
		for(j=0;j<tree.length;j++){
			if(i==tree[j]){
				height[j]=height[i]+1;
				if(height[j]>max)
					max=height[j];
			}
		}
	}
	System.out.println("Height:"+max);
	for(i=0;i<tree.length;i++)
		System.out.println("["+i+"]:Height=>"+height[i]);
}
}