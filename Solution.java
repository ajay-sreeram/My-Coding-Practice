import java.io.*;
public class Solution
{
public static void main(String args[])throws IOException
    {
int r[]={10,20,30};
System.out.println(r.length());
}
}

/*
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int i,n,count=0;
    char ch;
    n=Integer.parseInt(br.readLine());
    String arr[]=new String[n];
    for(i=0;i<n;i++)
        arr[0]=br.readLine();
    int j,k,temp;
  String st;
    for(i=0;i<n;i++)
        {	System.out.println(":"+arr[i]);
        for(j=0;j<arr[i].length();j++)
            {
            temp=0;ch=arr[i].charAt(j);
            for(k=0;k<n;k++)
            {st=arr[k];
            if(st.indexOf(""+ch)!=-1)
                temp++;
            }
            if(temp==n)
                count++;
        }
    }
    System.out.print(count);
}
}*/