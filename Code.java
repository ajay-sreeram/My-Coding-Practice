class Test<T>{
	int t;
}
public class Code<T>{
	Test<T> arr[];
	public Code(){
		arr=new Test[10];
		Test[] la = new Test[10]; 
        arr = (Test<T>[])la;
		for(int i=0;i<10;i++)
			arr[i]=new Test<T>();
	}
}