import java.io.*;
public class Spiral {
	public static void main(String[] args)throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int i,n,m,k,l,cnt,tmp;
	k=l=0;cnt=1;
	n=Integer.parseInt(br.readLine());
	m=tmp=n;
	int a[][]=new int[n][n];
	while (k < m && l < n)
    {
        for (i = l; i < n; ++i)
        {
            a[k][i]=cnt++;
        }
        k++;
 
        for (i = k; i < m; ++i)
        {
            a[i][n-1]=cnt++;
        }
        n--;
 
        if ( k < m)
        {
            for (i = n-1; i >= l; --i)
            {
                a[m-1][i]=cnt++;
            }
            m--;
        }
		if (l < n)
        {
            for (i = m-1; i >= k; --i)
            {
                a[i][l]=cnt++;
            }
            l++;    
        }        
    }
	int j;
	System.out.println();
	for(i=0;i<tmp;i++){
		for(j=0;j<tmp;j++)
			System.out.print(a[i][j]+" ");
		System.out.println();
	}
	
	}
}
