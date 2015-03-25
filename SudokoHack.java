import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SudokoHack {
    static void sudoku_solve(int [][] grid){
    fillsudoko(grid,0,0);
    }
public static void fillsudoko(int grid[][],int r,int c){
	if(r==9){
		System.out.println("HELLO");
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				System.out.print(grid[i][j]+" ");
			}
			//System.out.println("HELLO"+i);
			System.out.println();
		}
		return;
	}
	if(grid[r][c]==0){
		for(int d=1;d<=9;d++){
			if(valid(grid,r,c,d)){
				grid[r][c]=d;
				if(c==8)
					fillsudoko(grid,r+1,0);
				else
					fillsudoko(grid,r,c+1);
			}
		}
		grid[r][c]=0;
	} else{
		if(c==8)
			r=r+1;
		c=(c+1)%9;
		fillsudoko(grid,r,c);
	} 
}
public static boolean valid(int grid[][],int r,int c,int val){
	for(int i=0;i<9;i++){
		if(grid[r][i]==val||grid[i][c]==val){
			return false;
		}
	}
	int sr=(r/3)*3;
	int sc=(c/3)*3;
	for(int i=sr;i<sr+3;i++)
		for(int j=sc;j<sc+3;j++)
			if(grid[i][j]==val)
				return false;
	return true;
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int board[][] = new int[9][9];

        n = in.nextInt();

        //for(int i = 0; i < n; i++) {
            for(int j = 0; j < 9; j++) {
                for(int k = 0; k < 9; k++) {
                    board[j][k] = in.nextInt();
                }
            }
            sudoku_solve(board);
        //}
    }
}
