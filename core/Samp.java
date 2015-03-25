
public class Samp
{
public static void main(String[] args)
{
char a[]=new char[104];
int temp=0;
char c='a';
int i;
for(i=0;i<104;i++)
{
	if(temp>3)
	{
		temp=0;
		c++;
	}
	temp++;
a[i]=c;
}
}
}
