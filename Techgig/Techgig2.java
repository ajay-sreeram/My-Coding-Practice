import java.io.*;
public class Techgig2 
{ 
    public static String[] sortPoints(String[] input1,int input2,int input3)
    {
        int x[]=new int[input1.length];
        int y[]=new int[input1.length];
        int seq[]=new int[input1.length];
        double dist[]=new double[input1.length];
        int i,p,q,j;
String temp[];
        for(i=0;i<input1.length;i++)
        {
        temp=input1[i].split("#");
        p=Integer.parseInt(temp[0]);
        q=Integer.parseInt(temp[1]);
        seq[i]=i;
        dist[i]=Math.sqrt((input2-p)*(input2-p)+(input3-q)*(input3-q));
        }
        int temp1;
	double temp2;
        for(i=0;i<dist.length;i++)
        for(j=0;j<dist.length;j++)
        if(dist[i]>dist[j])
        {
        temp2=dist[i];
        dist[i]=dist[j];
        dist[j]=temp2;
        temp1=seq[i];
        seq[i]=seq[j];
        seq[j]=temp1;
        }
        String result[]=new String[input1.length];
        for(i=0;i<input1.length;i++)
        result[i]=input1[seq[i]];
        return result;
        
        
    }
}