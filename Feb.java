import java.io.*;
import java.util.*;
import java.io.InputStreamReader;
 
public class Feb {
public static void main(String args[])throws java.lang.Throwable{
fun(3);
}
    public static void fun(int n)throws java.lang.Throwable {
        PrintWriter out = new PrintWriter(System.out);
 
        long[][] T = new long[2][2];
        long[][] res = new long[2][2];
        long[][] cur = new long[2][2];
        long mod = 100000007;
        
        T[0][0] = T[0][1] = T[1][0] = 1;  //  T = (1 1
        T[1][1] = 0;                      //       1 0)
        
        // res = identity matrix  (the same as T^0)
        res[0][0] = res[1][1] = 1;
        res[0][1] = res[1][0] = 0;
        
        int pow = n-1;
        ArrayList<Integer> bits = new ArrayList<Integer>();
        
        // Get pow in binary and store it in bits
        while (pow > 0) {
            bits.add(pow % 2);
            pow = pow / 2;
        }
                
        // now we have the bits in reversed o
        Collections.reverse(bits); 
        
        // Calculate T^(n-1) with
        // exponentation by squaring - O(log n)
        for (int i=0; i < bits.size(); ++i) { 
            for (int r=0; r < 2; ++r)
                for (int c=0; c < 2; ++c)
                    cur[r][c] = 0; 
                    
            for (int x=0; x < 2; ++x) // matrix multiplication res * res
                for (int y=0; y < 2; ++y)
                    for (int z=0; z < 2; ++z) {
                        cur[x][y] += res[x][z] * res[z][y];
                        if (cur[x][y] >= mod)
                            cur[x][y] %= mod;
                    }
            
            for (int r=0; r < 2; ++r)
                for (int c=0; c < 2; ++c)
                    res[r][c] = cur[r][c];
            
            if (bits.get(i) == 1) { 
                for (int r=0; r < 2; ++r)
                    for (int c=0; c < 2; ++c)
                        cur[r][c] = 0; 
                        
                for (int x=0; x < 2; ++x) // matrix multiplication res * T
                    for (int y=0; y < 2; ++y)
                        for (int z=0; z < 2; ++z) {
                            cur[x][y] += res[x][z] * T[z][y];
                            if (cur[x][y] >= mod)
                                cur[x][y] %= mod;
                        }
                        
                for (int r=0; r < 2; ++r)
                    for (int c=0; c < 2; ++c)
                        res[r][c] = cur[r][c];
            }
        }
              
        long fibn = res[0][0]; // our vector is (fib1 = 1, fib0 = 0)
                               // so we would have (matrix multiplication)
                               // fibn = res[0][0]*fib1 + res[0][1]*fib0 =
        out.println(fibn);     //      = res[0][0]
        out.flush();
    }
}