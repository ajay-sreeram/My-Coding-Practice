import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
    static int p=0;
    static void next_move(int posr, int posc, String[] board){
        if(board[posr].charAt(posc)=='d'){
          System.out.println("CLEAN");  
          return ;
        }
        double min=Integer.MAX_VALUE;
        int dr=0,dc=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length();j++){
                if(board[i].charAt(j)=='d')
                {    
                    double d=Math.sqrt((posr-i)*(posr-i)+(posc-j)*(posc-j));
                    if(d<min){
                        min=d;
                        dr=i;dc=j;
                    }
                }
            }
        }
        if(posr-1>=0&&(Math.abs(dr-(posr-1))<=Math.abs(dr-posr)))
            System.out.println("UP");
        else if(posc-1>=0&&(Math.abs(dc-(posc-1))<=Math.abs(dc-posc)))
            System.out.println("LEFT");
        else if(posr+1<board.length&&(Math.abs(dr-(posr+1))<Math.abs(dr-posr)))
            System.out.println("DOWN");
        else if(posc+1<board[posr].length()&&(Math.abs(dc-(posc+1))<Math.abs(dc-posc)))
            System.out.println("RIGHT");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] pos = new int[2];
        String board[] = new String[5];
        for(int i=0;i<2;i++) pos[i] = in.nextInt();
        for(int i=0;i<5;i++) board[i] = in.next();
        next_move(pos[0], pos[1], board);
    }
}
