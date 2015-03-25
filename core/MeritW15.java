class MeritW15
{
public static void main(String args[])
{
char b[][]={{'A', 'S', 'C', 'D'}, {'C', 'T', 'A', 'F'}, {'Q', 'M', 'A', 'S'}, {'V', 'X', 'Z', 'C'}};
String s="CSA";
int i,j,k;
int  co1,co2,count1,co3,co4;
int p,q,m,count;

char sw[]=new char[s.length()];
for(i=0;i<s.length();i++)
sw[i]=s.charAt(i);

int n=s.length();
for(i=0;i<b.length;i++)
{
	for(j=0;j<b[i].length;j++)
	{
	co1=0;co2=0;co3=0;co4=0;count1=n-1;
	for(k=j,p=0;k<j+n;k++,p++,count1--)
	{
		if(k<b[i].length)
		{
		if(sw[p]==b[i][k])
		co1++;
		}
		if(k<b.length)
		{
		if(sw[p]==b[k][i])
		co2++;
		}

		if(k<b[i].length)
		{
		if(sw[count1]==b[i][k])
		co3++;
		}
		if(k<b.length)
		{
		if(sw[count1]==b[k][i])
		co4++;
		}


	}
	if(co1==n||co2==n||co3==n||co4==n)
	{
	System.out.println("yes");System.exit(0);
	}
		
}
}	

for(i=0;i<b.length;i++)
{
	for(m=0;m<b[i].length;m++)
	{
	co1=0;count=0;co2=0;count1=n-1;
	for(p=i,q=m;count<s.length();q++,p++,count++,count1--)
	{
		if(p<b.length&&q<b[i].length)
		{
		if(sw[count]==b[p][q])
		co1++;	
		}
		if(p<b.length&&q<b[i].length)
		{
		if(sw[count1]==b[p][q]&&count1>=0)
		co2++;	
		}
	}

	if(co1==n||co2==n)
	{
	System.out.println("yes");System.exit(0);
	}
	
	}
}



for(i=b.length-1;i>=0;i--)
{
	for(m=0;m<b[i].length;m++)
	{
	co1=0;count=0;co2=0;count1=s.length()-1;
	for(p=i,q=m;count<s.length();p--,q++,count++,count1--)
	{
		if(p>=0&&q<b[i].length)
		{
		if(sw[count]==b[p][q])
		co1++;
		}
		if(p>=0&&q<b[i].length&&count1>=0)
		{
		if(sw[count1]==b[p][q])
		co2++;
		}


	}
	if(co1==s.length()||co2==s.length())
	{
	System.out.println("yes");System.exit(0);
	}
	
	}
}

}
}