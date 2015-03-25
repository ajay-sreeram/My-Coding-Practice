import java.util.*;
import java.io.*;
class Practo1{
    public static void main(String args[] ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i,n = Integer.parseInt(br.readLine());
        int arr[]=new int[n];
        for (i = 0; i < n; i++) {
        arr[i]=Integer.parseInt(br.readLine());
        }
		
		insertionSort(arr);
		i=2;
		 System.out.println(Arrays.toString(arr));
		int j,tmp;
		while(n-i>2)
		{
			arr[n-i]+=arr[n-i+1];
			j=n-i;
			System.out.println((n-i)+":"+arr[j]+":");
			while(j>0&&arr[j]>arr[j-1])
			{
				tmp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=tmp;
				j--;
			}
			
			for(int k=0;k<n-i;k++)
				System.out.print(" "+arr[k]);
			System.out.println();
			
			i++;
		}
		
		
	int a,b,c;
	a=arr[0];
	b=arr[1];
	c=arr[2];
	/*while(true)
	{
		a--;
		if(c<=a)
		{c++;}
		else
		a++;
		a--;
		if(b<=a)
		{b++;}
		else
		a++;
		if(b<c)
		{
			tmp=b;
			b=c;
			c=tmp;
		}
		if(a<b)
		{
			tmp=a;
			a=b;
			b=tmp;
		}
		
		System.out.println(a+" "+b+" "+c);
		
		if(a==b&&(b-c==1||b-c==0))
			break;
	}
		*/
		//SYstem.out.print(a);
       System.out.println("::"+a+" "+b+" "+c);
    }
	
	public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] < key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
    //        printNumbers(array);
        }
    }
	
}
