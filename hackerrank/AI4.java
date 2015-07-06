import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Solution {
static void nextMove(int x, int y, int color, String [] grid){
        //Your logic here
        int max=0;
        int cx=0,cy=0;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if(grid[i].charAt(j)!='-'){
                    int cnt=count(i,j,grid[i].charAt(j),grid);
                    if(cnt>max){
                        max=cnt;
                        cx=i;cy=j;
                    }
                }
            }
        }
    System.out.println(cx+" "+cy);
    }
    public static int count(int x,int y,int color,String[] grid){
        if(x<0||y<0||x>=grid.length||y>=grid[0].length())
            return 0;
        if(grid[x].charAt(y)!=color)
            return  0;
        char tmp[]=grid[x].toCharArray();
        tmp[y]='-';
        grid[x]=new String(tmp);
        return 1+count(x-1,y,color,grid)+count(x,y-1,color,grid)+count(x+1,y,color,grid)+count(x,y+1,color,grid);
    }
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int k = in.nextInt();

        String grid[] = new String[x];

        for(int i = 0; i < x; i++) {
            grid[i] = in.next();
        }

        nextMove(x, y, k, grid);
    }
}
