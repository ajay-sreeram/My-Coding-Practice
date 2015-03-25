import java.util.*;
public class SolutionF{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String arr[]=in.nextLine().toString().replaceAll("[^\\w\\s]","").toLowerCase().split(" ");
String temp[]=in.nextLine().split(" ");
int k,lb,ub,i,j;
k=Integer.parseInt(temp[0]);
lb=Integer.parseInt(temp[1]);
ub=Integer.parseInt(temp[2]);
String given[]=new String[k];
for(i=0;i<k;i++)
given[i]=in.nextLine().toLowerCase();
String tmp;
int start=0,stop=0;
int cnt=0;
for(i=0;i<arr.length;i++)
{
	if(contains(arr[i],given))
	{
		tmp=arr[i];
		start=i;
		stop=-1;
		//System.out.println(tmp);
		for(j=i+1;j<arr.length;j++)
		{
			if(contains(arr[j],given)){
			stop=j;
			//System.out.println(tmp);
			break;
			}
		}
		if(stop!=-1)
		{
		if(!arr[start].equals(arr[stop]))
		{
		int range=stop-start+1;
		if(range>=lb&&range<=ub)
			cnt++;
		}
		}
	}
}
System.out.println(cnt);
}

public static boolean contains(String st,String arr[]){
List<String> lst = Arrays.asList(arr);
return lst.contains(st);

}

}