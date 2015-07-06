import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Edge implements Comparable<Edge>{
    int x;
    int y;
    public Edge(){
        x=0;y=0;
    }
    public Edge(int x,int y){
        this.x=x;this.y=y;
    }
    public boolean equalsTo(Edge e){
        return e.x==x&&e.y==y;
    }
    public int compareTo(Edge e){
        if(e.x==x&&e.y==y)
            return 0;
        return 1;
    }
}
 class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int T=Integer.parseInt(in.nextLine());
        for(int t=0;t<T;t++){
            String tmp=in.nextLine();
            String tarr[]=in.nextLine().split(" ");
            int nv=Integer.parseInt(tarr[0]);
            int ne=Integer.parseInt(tarr[1]);
            Edge edges[]=new Edge[ne];
            boolean ver[]=new boolean[nv+1];
            for(int e=0;e<ne;e++){
                tarr=in.nextLine().split(" ");
                int x,y;
                x=Integer.parseInt(tarr[0]);
                y=Integer.parseInt(tarr[1]);
                edges[e]=new Edge(x,y);
                ver[x]=true;
                ver[y]=true;
            }
            boolean first=false;
            List<Edge> list=new LinkedList<Edge>();
            for(int j=0;j<edges.length;j++)
                list.add(edges[j]);
            
			System.out.println(Arrays.toString(ver));
            while(count(ver)!=0){
                int i;
                for(i=1;i<=nv;i++){
                    if(ver[i]){
                        ver[i]=false;
                        List<Edge> list2=new LinkedList<Edge>();
                        for(Edge edge:list){
                            if(edge.x!=i&&edge.y!=i)
                                list2.add(edge);
                        }
                        if(connected(list2,ver)){
                            if(first)
                                first=false;
                            else
                                first=true;
                            list=list2;
                            ver[i]=false;
                            break;
                        }else{
                            ver[i]=true;
                        }
                    }
                }
                
                if(i==nv+1){
					System.out.println("HELLO");
                    if(count(ver)==1){
                        if(first)
                                first=false;
                            else
                                first=true;
                            
                        break;
                    }
                    else
                        break;
                }
            }
            
            if(first)
                System.out.println("Artur");
            else
                System.out.println("Alex");
        }
    }
    static Queue<Integer> queue;
    public static boolean connected(List<Edge> list,boolean ver[]){
        if(list.size()==0)
            return true;
        queue=new <Integer>LinkedList();
        Edge f=list.get(0);
        int mat[][]=new int[ver.length-1][ver.length-1];
        for(Edge edge:list){
            mat[edge.x][edge.y]=1;
            mat[edge.y][edge.x]=1;
        }
        if(count(ver)==bfs(mat,f.x,ver))
            return true;
        return false;
    }
    
    
    
public static int bfs(int adjacency_matrix[][], int source,boolean ver[])
    {
        int number_of_nodes = adjacency_matrix[source].length - 1;
 
        int[] visited = new int[number_of_nodes + 1];
        for(int i=1;i<ver.length;i++)
            if(ver[i]==false)
                visited[i-1]=1;
        int i, element;
 
        visited[source] = 1;
        queue.add(source);
           
        int count=0;
        while (!queue.isEmpty())
        {
            element = queue.remove();
            i = element;
            //System.out.print(i + "\t");
            count++;
            while (i <= number_of_nodes)
            {
                if (adjacency_matrix[element][i] == 1 && visited[i] == 0)
                {
                    queue.add(i);
                    visited[i] = 1;
                }
                i++;
            }
        }
    return count;
    }
    
    static int count(boolean var[]){
        int cnt=0;
        for(int i=1;i<var.length;i++)
            if(var[i])
                cnt++;
        return cnt;
    }
}