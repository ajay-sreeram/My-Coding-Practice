import java.util.*;
class Year{
	Month month[];
	Year(){
		month=new Month[13];
	}
}
class Month{
	int week[];
	int cnt;
	Month(){
		cnt=0;
		week=new int[6];
	}
}
public class Trend{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		String st,gvn[];
		Year year[]=new Year[13];
		int n=0;
		for(n=0;n<545;n++){
			String arr[]=in.nextLine().trim().split(" ");
			gvn=arr[0].split("-");
			int y=Integer.parseInt(gvn[0])-2003;
			if(year[y]==null)
				year[y]=new Year();
			int m=Integer.parseInt(gvn[1]);
			if(year[y].month[m]==null)
				year[y].month[m]=new Month();
			int w=Integer.parseInt(gvn[2].trim())/7+1;
			year[y].month[m].week[w]=Integer.parseInt(arr[3]);
		}
		while((st=in.nextLine())!=null&&st.length()!=0){
			String arr[]=st.trim().split(" ");
			gvn=arr[0].split("-");
			int y=Integer.parseInt(gvn[0])-2003;
			int m=Integer.parseInt(gvn[1]);
			int w=Integer.parseInt(gvn[2].trim())/7+1;
			int avg1=0,cnt1=0,avg2=0,cnt2=0;
			for(int i=0;i<year.length;i++){
				if(year[i]!=null){
					if(year[i].month[m]!=null){
						if(year[i].month[m].week[w]!=0){
							avg1+=year[i].month[m].week[w];
							cnt1++;
						}
						for(int j=1;j<13;j++){
							if(year[i].month[j]!=null&&year[i].month[j].week[w]!=0){
								avg1+=year[i].month[j].week[w];
								cnt2++;
							}
						}
					}
				}
			}
			int res=0;
			if(cnt1!=0)
				res+=(avg1/cnt1);
			if(cnt2!=0)
				res+=(avg2/cnt2);
			
			System.out.println(res);
			
			if(year[y]==null)
				year[y]=new Year();
			if(year[y].month[m]==null)
				year[y].month[m]=new Month();
			year[y].month[m].week[w]=res;
			
		}
		
	}
}