import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
    
static void displayPathtoPrincess(int n, String [] grid){
    int p=0;
    if(grid[0].charAt(0)=='p')
        p=1;
    else if(grid[0].charAt(n-1)=='p')
        p=2;
    else if(grid[n-1].charAt(0)=='p')
        p=3;
    else if(grid[n-1].charAt(n-1)=='p')
        p=4;
    path(p,n);
  }
  static void path(int p,int n){
      switch(p){
          case 1:
                for(int i=0;i<n/2;i++){
                    System.out.println("LEFT");
                    System.out.println("TOP");
                }break;
          case 2:
                for(int i=0;i<n/2;i++){
                    System.out.println("RIGHT");
                    System.out.println("TOP");
                }break;
          case 3:
                for(int i=0;i<n/2;i++){
                    System.out.println("LEFT");
                    System.out.println("BOTTOM");
                }break;
          case 4:
                for(int i=0;i<n/2;i++){
                    System.out.println("RIGHT");
                    System.out.println("BOTTOM");
                }break;
      }
  }
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m;
        m = in.nextInt();
        String grid[] = new String[m];
        for(int i = 0; i < m; i++) {
            grid[i] = in.next();
        }

    displayPathtoPrincess(m,grid);
    }
}
