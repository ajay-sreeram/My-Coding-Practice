import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int p=0;
    static void next_move(int posr, int posc, String[] board){
        //add logic here
        if(board[posr].charAt(posc)=='d'){
          System.out.println("CLEAN");  
        }
        else if(posr-1>=0&&board[posr-1].charAt(posc)=='d'){
            System.out.println("UP");
            p=2;
        }else if(posr+1<board.length&&board[posr+1].charAt(posc)=='d'){
            System.out.println("DOWN");
            p=4;
        }else if(posc-1>=0&&board[posr].charAt(posc-1)=='d'){
            System.out.println("LEFT");
            p=1;
        }else if(posc+1<board[posr].length()&&board[posr].charAt(posc+1)=='d'){
            System.out.println("RIGHT");
            p=3;
        }else if(posc+1<board[posr].length()&&p!=1){
            System.out.println("RIGHT");
            p=3;
        }else if(posr+1<board.length&&p!=2){
            System.out.println("DOWN");
            p=4;
        }else if(posc-1>=0&&p!=3){
            System.out.println("LEFT");
            p=1;
        }else if(posr-1>=0&&p!=4){
            System.out.println("UP");
            p=2;
        }
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
