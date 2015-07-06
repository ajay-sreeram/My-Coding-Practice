import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Node implements Comparable<Node>{
	int x,y;
	Node(int x,int y){
		this.x=x;
		this.y=y;
	}
	public String toString(){
		return x+":"+y;
	}
	public boolean equals(Node n){
		return n.x==x&&n.y==y;
	}
	  public int compareTo(Node n){
		if(n.x==x&&n.y==y)
			return 0;
		return 1;
	}  
}
class Solution {
static void nextMove(int r, int c, int pacman_r, int pacman_c, int food_r, int food_c, String [] grid){
        //Your logic here
		PriorityQueue<Node> q1,q2;
		q1=new PriorityQueue<Node>();
		q2=new PriorityQueue<Node>();
		q1.add(new Node(pacman_r,pacman_c));
		while(true){
			Node tmp=q1.poll();
			char arr[]=grid[tmp.x].toCharArray();
			arr[tmp.y]='o';
			grid[tmp.x]=new String(arr);
			
			q2.add(tmp);
			
			System.out.print("\n"+tmp.x+" "+tmp.y+"=>");
			if(tmp.x-1>=0){
				System.out.print((tmp.x-1)+" "+tmp.y+", ");
				char ch=grid[tmp.x-1].charAt(tmp.y);
				if(ch=='-'){
					q1.add(new Node(tmp.x-1,tmp.y));
				}else if(ch=='.'){
					q2.add(new Node(tmp.x-1,tmp.y));
					break;
				}
			}
			if(tmp.y-1>=0){
				System.out.print(tmp.x+" "+(tmp.y-1)+", ");
				char ch=grid[tmp.x].charAt(tmp.y-1);
				if(ch=='-'){
					q1.add(new Node(tmp.x,tmp.y-1));
				}else if(ch=='.'){
					q2.add(new Node(tmp.x,tmp.y-1));
					break;
				}
			}
			
			if(tmp.y+1<c){
				System.out.print(tmp.x+" "+(tmp.y+1)+", ");
				char ch=grid[tmp.x].charAt(tmp.y+1);
				if(ch=='-'){
					q1.add(new Node(tmp.x,tmp.y+1));
				}else if(ch=='.'){
					q2.add(new Node(tmp.x,tmp.y+1));
					break;
				}
			}
			
			if(tmp.x+1<r){
				System.out.print((tmp.x+1)+" "+tmp.y);
				char ch=grid[tmp.x+1].charAt(tmp.y);
				if(ch=='-'){
					q1.add(new Node(tmp.x+1,tmp.y));
				}else if(ch=='.'){
					q2.add(new Node(tmp.x+1,tmp.y));
					break;
				}
			}
			if(q1.size()==0)
				break;
		}
		System.out.println(q2.size());
		String tmp=q2.toString();
		tmp=tmp.substring(1,tmp.length()-1);
		tmp=tmp.replace(" ","");
		tmp=tmp.replace(",","\n");
		tmp=tmp.replace(":"," ");
		//System.out.println(tmp);
		
    }
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int pacman_r = in.nextInt();
        int pacman_c = in.nextInt();

        int food_r = in.nextInt();
        int food_c = in.nextInt();

       int r = in.nextInt();
        int c = in.nextInt();
    
        String grid[] = new String[r];

        for(int i = 0; i < r; i++) {
            grid[i] = in.next();
        }

        nextMove( r, c, pacman_r, pacman_c, food_r, food_c, grid);
    }
}
