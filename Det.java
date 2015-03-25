import java.io.*;
public class Det{
public static void main(String args[])throws java.lang.Throwable{
int a[]={0,1,2,3,4,5,6,7,8,9};
int b[]={0,1,2,3,4,5,6,7,8,9};
int c[]={0,1,2,3,4,5,6,7,8,9};
int d[]={0,1,2,3,4,5,6,7,8,9};
int i,j,k,l;
int det=0;
BufferedWriter br=new BufferedWriter(new FileWriter("out.txt"));
for(i=0;i<10;i++)
	for(j=0;j<10;j++)
		for(k=0;k<10;k++)
			for(l=0;l<10;l++)
		{
			det=(int)Math.abs(a[i]*d[l]-b[j]*c[k]);
			if(det%2!=0&&det!=13&&det!=1)
				{br.write(""+a[i]+b[j]+c[k]+d[l]+" "+det);br.newLine();}
		}
System.out.println("Compleate...");
}
}