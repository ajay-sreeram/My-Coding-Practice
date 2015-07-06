import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Node{
    int x,y;
    public Node(int x,int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return x+":"+y;
    }
}
class Solution {
    static Stack<Node> stack;
    static String res;
    static int size;
static void dfs(int r, int c, int pacman_r, int pacman_c, int food_r, int food_c, String [] grid){
        //Your logic here
    size=Integer.MAX_VALUE;
    res="";
    stack=new Stack<Node>();
    stack.push(new Node(pacman_r,pacman_c)); 
    dfs2(r,c,pacman_r,pacman_c,food_r,food_c,grid);
    /*System.out.println(size);
    System.out.println(res);
    System.out.println(size-1);
    System.out.println(res);
    */
    }
    public static void dfs2(int r,int c,int pr,int pc,int fr,int fc,String grid[]){
        System.out.println(pr+":"+pc);
		if(pr==fr&&pc==fc){
           // stack.push(new Node(pr,pc));
		  // System.out.println(stack.size());
         //   if(size>stack.size()){
            //System.out.println(stack.size());
            String st=stack.toString();
            st=st.substring(1,st.length()-1);
            st=st.replace(" ","");
            st=st.replace(",","\n");
            st=st.replace(":"," ");
            res=st;
            size=stack.size();
           /* System.out.println(size);
            System.out.println(res);
            System.out.println(size-1);
            System.out.println(res);
            */
			System.exit(0);
			
            //return;
           // }
            return;
        }
        if(pr-1>=0&&(grid[pr-1].charAt(pc)=='-'||grid[pr-1].charAt(pc)=='.')){
            char ch=grid[pr-1].charAt(pc);
            stack.push(new Node(pr-1,pc));
            char tmp[]=grid[pr-1].toCharArray();
            tmp[pc]='o';
            grid[pr-1]=new String(tmp);
            
            dfs2(r,c,pr-1,pc,fr,fc,grid);
            
            tmp[pc]=ch;
            grid[pr-1]=new String(tmp);
            stack.pop();
        }
        if(pc-1>=0&&(grid[pr].charAt(pc-1)=='-'||grid[pr].charAt(pc-1)=='.')){
            char ch=grid[pr].charAt(pc-1);
            stack.push(new Node(pr,pc-1));
            char tmp[]=grid[pr].toCharArray();
            tmp[pc-1]='o';
            grid[pr]=new String(tmp);
            dfs2(r,c,pr,pc-1,fr,fc,grid);
            tmp[pc-1]=ch;
            grid[pr]=new String(tmp);
            stack.pop();
        }
        if(pc+1<c&&(grid[pr].charAt(pc+1)=='-'||grid[pr].charAt(pc+1)=='.')){
            char ch=grid[pr].charAt(pc+1);
            stack.push(new Node(pr,pc+1));
            char tmp[]=grid[pr].toCharArray();
            tmp[pc+1]='o';
            grid[pr]=new String(tmp);
            dfs2(r,c,pr,pc+1,fr,fc,grid);
            tmp[pc+1]=ch;
            grid[pr]=new String(tmp);
            stack.pop();
        }
        if(pr+1<r&&(grid[pr+1].charAt(pc)=='-'||grid[pr+1].charAt(pc)=='.')){
            char ch=grid[pr+1].charAt(pc);
            stack.push(new Node(pr+1,pc));
            char tmp[]=grid[pr+1].toCharArray();
            tmp[pc]='o';
            grid[pr+1]=new String(tmp);
            dfs2(r,c,pr+1,pc,fr,fc,grid);
            tmp[pc]=ch;
            grid[pr+1]=new String(tmp);
            stack.pop();
        }
        
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

        dfs( r, c, pacman_r, pacman_c, food_r, food_c, grid);
    }
}
