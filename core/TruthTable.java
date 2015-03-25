public class TruthTable
{
public static void main(String args[])
{

	int n,i,j,p,t,k;
	//printf("Etner the size");
	//scanf("%d",&n);
	n=3;
	p=1;
	for(i=0;i<n;i++)
	{
		p*=2;
	}
	char a[][]=new char[p][n];
	for(i=0;i<p;i++)
	{
		for (j=0;j<n;j++)
			a[i][j]='0';
		//a[i][j]='\0';
		j=n-1;
		t=i;
		while(t>0)
		{
			if(t%2==0)
				a[i][j]='0';
			else
				a[i][j]='1';
			t=t/2;
			j--;
		}
	}
	for(i=0;i<p;i++)
	{
		for(j=0;j<n;j++)
		System.out.print(a[i][j]);
	System.out.println();
	}
	//getch();
}
}