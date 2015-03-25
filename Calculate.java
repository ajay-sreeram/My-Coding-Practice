public class Calculate{
public static void main(String args[]){
int arr[]={1,3,5,7,9,11,13,15};
int a,b,c,d,e;
for(a=0;a<8;a++)
{
for(b=0;b<8;b++)
{
for(c=0;c<8;c++)
{
for(d=0;d<8;d++)
{
for(e=0;e<8;e++)
{
	if(arr[a]+arr[b]+arr[c]+arr[d]+arr[e]==30)
		System.out.println(""+arr[a]+" "+arr[b]+" "+arr[c]+" "+arr[d]+" "+arr[e]);
}	
}	
}	
}
}

}
}

