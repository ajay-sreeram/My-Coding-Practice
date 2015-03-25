import java.lang.*;
public class MeritW1
{
public void fun(int a[][])
{
	int i,j;
	int maxx,maxy;
	maxx=a[0][0]+a[0][2];
	maxy=a[0][1]+a[0][3];
	for( i=1;i<a.length;i++)
	{
	if((a[i][0]+a[i][2])>maxx)
	maxx=a[i][0]+a[i][2];
	if((a[i][1]+a[i][3])>maxy)
	maxy=a[i][1]+a[i][3];
	}
	int p[][]=new int[maxx][maxy];
	for(i=0;i<maxx;i++)
	for(j=0;j<maxy;j++)
	p[i][j]=0;
	for(int z=0;z<a.length;z++)
	{
	int count=65;
	for(i=a[z][1];i<a[z][1]+a[z][3];i++)
	{
	for(j=a[z][0];j<a[z][0]+a[z][2];j++)
	{
	if(count>90)
	count=65;
	if(p[j][i]==0)
	p[j][i]=count;
	else
	{
	p[j][i]=(p[j][i]-64)+(count-64);
	p[j][i]=p[j][i]+64;
	}
	while(p[j][i]>90)
	p[j][i]=p[j][i]-26;
	

	count++;
	}
	}
	}
	for(i=0;i<maxy;i++)
	{
	for(j=0;j<maxx;j++)
	{
	if(p[j][i]!=0)
	System.out.print("  "+(char)p[j][i]);
	else
	System.out.print("  .");
	}
	System.out.println();
	}
}

	public static void main(String args[])
	{
	int a[][]={{0,3,4,4},{5,0,3,3},{10,10,10,10},{10,10,5,5}};
	MeritW1 m=new MeritW1();
	m.fun(a);
	}
}
