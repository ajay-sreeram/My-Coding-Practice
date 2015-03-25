import java.io.*;
import java.util.*;
public class Example
{
 public static void main(String[] args) 
    {
        int[][][] x = new int[3][][];
        int i, j;
        x[0] = new int[3][];
        x[1] = new int[2][];
        x[2] = new int[5][];
        int k = 0;
        for (i = 0; i < x.length; i++) 
        {
            for (j = 0; j < x[i].length; j++) 
            {
                x[i][j] = new int[i + j + 1];
                k++;
            }
        }
        System.out.println("K value is: " + k);
    }
}
