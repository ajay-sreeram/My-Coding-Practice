import java.util.*;
public class One{
public static void main(String args[]){
	Scanner in=new Scanner(System.in);
	
	int t=Integer.parseInt(in.nextLine());
	int a,i,j,n,tmp;
	int arr[][];
	String temp[];
	for(a=0;a<t;a++)
	{
		n=Integer.parseInt(in.nextLine());
		arr=new int[n+2][n+2];
		for(i=1;i<=n;i++){
			temp=in.nextLine().split(" ");
			for(j=0;j<temp.length;j++)
				arr[i][j+1]=Integer.parseInt(temp[j]);
		}
		int maxcnt=0;
		int val=Integer.MAX_VALUE;
		for(i=1;i<=n;i++)
			for(j=1;j<=n;j++)
				{
					tmp=check(arr,i,j)+1;
					if(tmp>=maxcnt)
					{
						if(tmp==maxcnt)
						{	
							if(arr[i][j]<val)
								val=arr[i][j];
						}
						else
						val=arr[i][j];
						maxcnt=tmp;
					}
				}
		System.out.println("Case #"+(a+1)+": "+val+" "+maxcnt);
	}
}

public static int check(int arr[][],int i,int j){

if(arr[i-1][j]-arr[i][j]==1)
	return 1+check(arr,i-1,j);
if(arr[i+1][j]-arr[i][j]==1)
	return 1+check(arr,i+1,j);
if(arr[i][j-1]-arr[i][j]==1)
	return 1+check(arr,i,j-1);
if(arr[i][j+1]-arr[i][j]==1)
	return 1+check(arr,i,j+1);
return 0;
}

}