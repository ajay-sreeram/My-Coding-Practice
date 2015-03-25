public class Heap{
	int arr[];
	int size;
	int capacity;
	public Heap(){
		arr=new int[1];
		size=0;
		capacity=1;
	}
	public void resizeHeap(){
		capacity*=2;
		int tmparr[]=new int[capacity];
		for(int i=0;i<arr.length;i++)
			tmparr[i]=arr[i];
		arr=tmparr;
	}
	public int deleteNode(){
		int tmp=arr[0];
		size--;
		arr[0]=arr[size];
		heapify();
		return tmp;
	}
	public void heapify(){
		int i=size-1;
		int par=(i-1)/2;
		while(i>0){
			if(arr[par]<arr[i]){
				arr[par]=arr[par]+arr[i];
				arr[i]=arr[par]-arr[i];
				arr[par]=arr[par]-arr[i];
			}
			i=par;
			par=(par-1)/2;
		}
	}
	public void insert(int node){
		size++;
		if(size>capacity){
			resizeHeap();
		}
		arr[size-1]=node;
		heapify();
	}
	public void display(){
			for(int i=0;i<size;i++){
				System.out.print(" "+arr[i]);
			}
			System.out.println();
	}
	public boolean[] getLeafs(){
		boolean check[]=new boolean[size];
		for(int i=0;i<size;i++){
			int child1=(i*2+1);
			int child2=(i*2+2);
			if(child1>=size&&child2>=size)
				check[i]=true;
		}
		return check;
	}
	public String getBinaryCode(){
		boolean leafs[]=getLeafs();
		String res="";
		for(int i=0;i<size;i++){
			if(leafs[i]){
				res=res+"a["+i+"]:"+arr[i]+" :: "+getCode(i)+"\n";
			}
		}
		return res;
	}
	public String getCode(int index){
		String res="";
		int par=(index-1)/2;
		while(index>0){
			if((2*par+1)==index)
				res=res+"0";
			else
				res=res+"1";
			index=par;
			par=(par-1)/2;
		}
		return new StringBuilder(res).reverse().toString();
	}
}