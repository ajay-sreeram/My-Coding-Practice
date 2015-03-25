class Box{
public int x1,x2,y1,y2,maxx1,maxx2,maxy1,maxy2,maxx,maxy;
public Box(int x,int y )
{ 
 x1=x2=x; 
 y1=y2=y; 
}
public void init()
{
maxx=-1;
 maxy=-1;
maxx1=x1;maxy1=y1;maxx2=x1;maxy2=y1;
}

public void inc()
{x2++;y2++;}

}

public class BigBox{
public static void main(String args[])
{
char[][] arr=new char[][]{{'0', '1', '1', '1', '0', '1', '0', '1'},
                   {'1', '0', '1', '0', '0', '0', '0', '1'},
                   {'0', '0', '0', '1', '0', '1', '0', '0'},
                   {'1', '1', '1', '1', '1', '0', '0', '1'},
                   {'1', '1', '1', '1', '0', '1', '1', '1'},
                   {'1', '1', '1', '1', '0', '1', '1', '1'},
                   {'1', '1', '1', '1', '1', '1', '1', '1'},
                   {'0', '1', '0', '1', '1', '1', '0', '0'}};

arr=new char[][]{{'0','0'},{'0','0'}};				   
Box obj=new Box(0,0);
obj.init();
int i,j;
for(i=0;i<arr.length;i++)
{
 for(j=0;j<arr.length;j++)
 {
  obj.x1=obj.x2=i;
  obj.y1=obj.y2=j; 
   rec(arr,obj);
  }
}
//obj.x1=3;obj.y1=0;
//obj.x2=3;obj.y2=0;
//rec(arr,obj);
//System.out.println("maxx2:"+obj.maxx1+" maxy2:"+obj.maxy1);

for(i=obj.maxx1;i<=obj.maxx2;i++)
{for(j=obj.maxy1;j<=obj.maxy2;j++)
System.out.print(i+"#"+j+" ,");
System.out.println();
}
}

public static void rec(char arr[][],Box obj)
{

int i=0,j=0;
label1:
 for(i=obj.x1;i<=obj.x2;i++)
  for(j=obj.y1;j<=obj.y2;j++)
   if(arr[i][j]=='0')
    break label1;

	
if(i-1==obj.x2&&j-1==obj.y2&&(obj.x2-obj.x1)>obj.maxx&&(obj.y2-obj.y1)>obj.maxy)
{
System.out.println(""+obj.maxx+":"+obj.maxy+" ");
obj.maxx1=obj.x1;
obj.maxy1=obj.y1;
obj.maxx2=obj.x2;
obj.maxy2=obj.y2;
obj.maxx=(obj.x2-obj.x1);
obj.maxy=(obj.y2-obj.y1);

}
if(obj.x2<arr.length-1&&obj.y2<arr.length-1)
{obj.inc();rec(arr,obj);}


}

}