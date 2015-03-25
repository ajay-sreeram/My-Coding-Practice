public class Egg{
public static void main(String args[]){
int n=2,k=36;
System.out.println("RESULT:"+eggDrop(n,k));
}
public static int eggDrop(int n,int k){
int eggFloor[n+1][k+1];
int res;
int i,j,x;
for(i=1;i<=n;i++){
eggFloor[i][1]=1;
eggFloor[i][0]=0;
}
for(j=1;j<=k;j++)
eggFloor[1][j]=j;
}
}