class Mobile
{
String model,maker;
int numberOfSims;
double memory;
Mobile(String model,String maker,int numberOfSims,double memory)
{
this.model=model;
this.maker=maker;
this.numberOfSims=numberOfSims;
this.memory=memory;
}
public static void main(String[] args)
{
Mobile m=new Mobile("Samsung","Wave 525",1,2048.0);
Mobile n=new Mobile("Nokia","Lumia",2,25000.0);
m.print(m);
n.print(n);
Mobile t=n;
n=m;
m=t;
m.print(n);
n.print(n);
}
public void print(Mobile m)
{
System.out.println(model+" "+maker+" "+numberOfSims+" "+memory);
}

}